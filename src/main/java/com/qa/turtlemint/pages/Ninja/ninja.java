package com.qa.turtlemint.pages.Ninja;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class ninja  extends TestBase {

        public String p;
        public String c;

        public String mintproW;
        public String ninjaW;
        public String ninjasignupW;
        public String reqID;

        @FindBy(xpath = "//span/a[@id='google-signin-button']")
        WebElement SignInbtn;

        @FindBy(xpath = "//input[@type='email']")
        WebElement Email;

        @FindBy(xpath = "//span[text()='Next']")
        WebElement Nextbtn1;

        @FindBy(xpath = "//div[@id='password']/div/div/div/input[@type='password']")
        WebElement Password;

        @FindBy(xpath = "//div[@id='passwordNext']")
        WebElement Nextbtn2;

        @FindBy(xpath = "//input[@placeholder=\"Search by Reg Number, Customer Name, DP Name, DP Phone Number\"]")
        WebElement SearchBar;

        @FindBy(xpath = "//a[contains(text(),'Policy Issuance')]")
        WebElement PolicyIssuance;

        @FindBy(xpath = "//span[text()='Action Reqd']")
        WebElement ActionReq;

        @FindBy(xpath = "//button[text()='OWN']")
        WebElement OWNbtn;

        @FindBy(xpath = "//button[normalize-space()='Save Issuance']")
        WebElement saveissuance;

        @FindBy(xpath = "//md-select[@id=\"policyIssuanceStatus\"]")
        WebElement policystatus;

        @FindBy(xpath = "//md-option[@data-auto=\"policyIssuanceStatus-CANCELLED-select\"]")
        WebElement Canceeled;

        @FindBy(xpath = "//textarea[@id=\"cancellationReason\"]")
        WebElement cancelledReson;

        @FindBy(xpath = "//button[@data-auto=\"close-pi-button\"]")
        WebElement closeButton;

        @FindBy(id="businessType")
        WebElement selectbusinessType;

        @FindBy(xpath = "//div[text()='New']")
        WebElement new_Buss_select;

        @FindBy(xpath = "//div//md-datepicker[@id='paymentCompleteDate']")
        WebElement completepaymentdate;

        @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")
        WebElement selectCurrentdate;

        @FindBy(xpath = "//td[text()='CANCELLED']")
        WebElement CANCELLED;

        @FindBy(xpath = "//md-radio-button[@data-auto='POLICY-tag-radio']")
        WebElement uploadPolicyBtn;

        @FindBy(xpath = "//button[@data-auto='done-tag-button']")
        WebElement done;

        @FindBy(xpath = "(//p[text()='Order Id ']//span)[2]")
        WebElement orderIDCheck;

        @FindBy(xpath = "//input[@id=\"requestId\"]")
        WebElement reqid;

        public ninja() {
            PageFactory.initElements(driver, this);
        }

        public void NinjaLogin(String NinjaEmail, String NinjaPassword) throws Exception {

            //  driver.get("https://ninja.sanity.planturtle.com/login");                ////oldsanityURL
            //   driver.get("https://ninja.sanity.turtle-feature.com/login");         ////sanityURL
            driver.get("https://ninja.turtlemint.com/login");                     ////ProdURL
            //   driver.get("https://ninja.pulse.turtle-feature.com/login");           ////Pulse

            Thread.sleep(2000);
            LogUtils.info("Ninja Website Opened");
            SignInbtn.click();
            LogUtils.info("Clicked on Sign In with Google Button");

            Set<String> allWindowHandles = driver.getWindowHandles();
            ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
            System.out.println("No. of tabs: " + tabs.size());

            if (tabs.size() <= 2) {
                Set<String> windows = driver.getWindowHandles();
                Iterator<String> it = windows.iterator();
                p = it.next();
                c = it.next();
                driver.switchTo().window(c);
            } else {
                Set<String> windows = driver.getWindowHandles();
                Iterator<String> it = windows.iterator();
                mintproW = it.next();
                ninjaW = it.next();
                ninjasignupW = it.next();
                driver.switchTo().window(ninjasignupW);
            }
            LogUtils.info("Switched to child window");
            Email.sendKeys(NinjaEmail);
            LogUtils.info("Email Entered");
            Nextbtn1.click();
            LogUtils.info("Clicked on Next button");
            Password.sendKeys(NinjaPassword);
            LogUtils.info("Password entered");
            Nextbtn2.click();
            LogUtils.info("Clicked on Next button after password");
            if (tabs.size() <= 2) {
                driver.switchTo().window(p);
            } else {
                driver.switchTo().window(ninjaW);
            }
            LogUtils.info("Switched Back to Parent window");
            WebCommands.staticSleep(5000);
            TestUtil.getScreenShot();
        }

        public void Ninjaflow(String u_ID) throws Exception {
            driver.switchTo().newWindow(WindowType.WINDOW);
            NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
            WebCommands.staticSleep(5000);
            System.out.println(u_ID);
            PolicyIssuance.click();
            LogUtils.info("Clicked on PolicyIssuance btn");
            Thread.sleep(3500);
            SearchBar.click();
            WebCommands.staticSleep(1000);
            SearchBar.sendKeys(u_ID);
            LogUtils.info("Clicked on Searchbar and put unique ID");
            Thread.sleep(2000);
            SearchBar.sendKeys(Keys.RETURN);
            LogUtils.info("Enter on Search bar");
            WebCommands.staticSleep(4000);
            TestUtil.getScreenShot();
            try {
                CANCELLED.isDisplayed();
                Assert.assertEquals(CANCELLED.getText(),"CANCELLED");
            }
            catch (Exception e){
                TestUtil.click(ActionReq, "Clicked On action required for own");
                TestUtil.click(OWNbtn, "Clicked on OWN button");
                WebCommands.staticSleep(30000);
                String currUrl = driver.getCurrentUrl();
                WebCommands.staticSleep(2000);
                reqID = reqid.getAttribute("value");
                TestUtil.click(policystatus, "policy status click");
                TestUtil.click(Canceeled, "Cancelled selected");
                TestUtil.sendKeys(cancelledReson, "Policy cancelled by Auomation Testing", "Cancelled");
                TestUtil.click(selectbusinessType, "");
                TestUtil.click(new_Buss_select, "New Select ");
                TestUtil.click(completepaymentdate, "");
                TestUtil.click(selectCurrentdate, "current date selected");
                WebCommands.staticSleep(3000);
                TestUtil.click(saveissuance, "Save successfully for inspection");
                WebCommands.staticSleep(2000);
                TestUtil.click(closeButton, "close button clicked");
                WebCommands.staticSleep(2000);
            }
        }
    }