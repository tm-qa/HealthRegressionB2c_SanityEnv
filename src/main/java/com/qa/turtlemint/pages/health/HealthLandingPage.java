package com.qa.turtlemint.pages.health;

import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

import static com.qa.turtlemint.base.TestBase.driver;

public class HealthLandingPage {
    public HealthLandingPage() {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//div[text()='Health Insurance']//parent::div")
    WebElement healthInsureButton;

    @FindBy(xpath = "//div[text()='Super Top-up']//parent::div")
    WebElement SuperTopup;

    @FindBy(xpath = "//span[text()='Diabetes Patients']")
    WebElement DiabetesPatients;

    @FindBy(xpath = "//span[text()='Senior Citizens']")
    WebElement Seniorcitizens;

    @FindBy(xpath = "//span[text()='Maternity Cover']")
    WebElement MaternityCover;

    @FindBy(xpath = "//span[text()='Premium Plans']")
    WebElement PremiumPlans;

    @FindBy(xpath = "//span[text()='See more plans']")
    WebElement SeemorePlan;

    @FindBy(xpath = "//span[text()='Cashless Hospitals']")
    WebElement CashlessHospital;

    @FindBy(xpath = "//div[text()='Platinum - Enhanced']")
    WebElement AdityaBirla;

    @FindBy(xpath = "//div[text()='Young Star Individual Gold']")
    WebElement YoungStarIndGolg;

    @FindBy(xpath = "//div[text()='Care Freedom']")
    WebElement CareFreedom;

    @FindBy(xpath = "//div[text()='Care - NCB Super']")
    WebElement NCB_superPlan;

    @FindBy(xpath = "//div[text()='Pro Health - Plus']")
    WebElement Manipal_cigma_PlusPlan;;

    @FindBy(xpath = "//div[text()='Comprehensive']")
    WebElement StarComprehensiveplan;

    @FindBy(xpath = "//div[@class='flex']//button[text()='Get Quotes']")
    WebElement GetQuotes;

    @FindBy(xpath = "//div[text()='Niva Bupa Health Companion']/parent::*/div/div")
    WebElement Niva_Bupa_Companion;

    @FindBy(xpath = "//div[text()='Niva Bupa Reassure']/parent::*/div/div")
    WebElement Niva_Bupa_Reassure;

    @FindBy(xpath = "//input[@placeholder=\"Pincode\"]")
    WebElement Pincodeentered;

    @FindBy(xpath = "//div[@name=\"Insurer\"]")
    WebElement insurer;

    @FindBy(xpath = "//li[text()='All Insurer']")
    WebElement AllInsurerSelect;

    @FindBy(xpath = "//span[text()='Find Hospitals']")
    WebElement FindHospital;

    @FindBy(xpath = "//input[@name=\"searchKey\"]")
    WebElement SearchKey;

    @FindBy(xpath = "//span[text()='parbhani icu & trauma care']")
    WebElement ParbhaniICUSelect;

    @FindBy(xpath = "//span[text()='Get Quotes for Cashless Insurers']")
    WebElement GetQuotesCashless;

    @FindBy(xpath = "//label[@class='select-type-health-desk']//img[@class='health-img']")
    WebElement HealthVertical;

    @FindBy(xpath = "//a[@id='health-banner-title-1']")
    WebElement BuyNewPolicy;

    @FindBy(xpath = "//a[@class='btno'][text()='Become a PoSP with us']")
    WebElement posp;

    @FindBy(xpath = "//span[text()='Join as a PoSP']")
    WebElement joinPosp;

    @FindBy(xpath = "//button[text()='Raise a Claim']")
    WebElement claim;

    @FindBy(xpath = "//li[@id='menu-item-44']//a[text()='Log in']")
    WebElement login;

    @FindBy(xpath = "//li[@id='menu-item-45']//a[text()='Sign Up']")
    WebElement signup;

    @FindBy(xpath = "//span[text()='Create an account/ Sign in']")
    WebElement createAccount;

    @FindBy(xpath = "//a[text()='Contact a Turtlemint Advisor']")
    WebElement tmadvisor;

    @FindBy(xpath = "//input[@name='Lead-Name']")
    WebElement name;

    @FindBy(xpath = "//input[@name='Mobile']")
    WebElement mobile;

    @FindBy(xpath = "//input[@name='Lead-Email']")
    WebElement email;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitlead;

    @FindBy(xpath = "//div[text()='Success!']")
    WebElement success;

    @FindBy(xpath = "//h6[text()='Training for latest']")
    WebElement textmsg;

    @FindBy(xpath = "//div[contains(@class,'cta-btns d-none d-lg-block d-sm-none d-md-block')]//button[@type='button'][normalize-space()='Get a Quote']")
    WebElement GetQuote;

    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void VerticalSelection() throws InterruptedException {
        TestUtil.click(HealthVertical,"Clicked on Health Insurance Button");
        TestUtil.click(GetQuote,"Clicked on get a Quote");
    }

    public void BuyNewPolicy()
    {
        TestUtil.click(BuyNewPolicy, "Clicked on Buy New Policy button");
    }


    public void HealthInsuranceClick() throws InterruptedException {
        TestUtil.click(healthInsureButton,"Clicked on Health Insurance Button");
    }

    public void SuperTopUpClick() throws InterruptedException {
        TestUtil.click(SuperTopup,"Clicked on Super Top Up Button");
    }
    public void DiabetesPatientsClick() {
        WebCommands.staticSleep(5000);
        TestUtil.click(DiabetesPatients,"Diabetes Patients Clicked");
        TestUtil.click(AdityaBirla,"Aditya Birla Selected");
        WebCommands.staticSleep(8000);
        TestUtil.click(GetQuotes,"Get Quotes Selected");
    }

    public void SeniorcitizensClick() {
        WebCommands.staticSleep(4000);
        Seniorcitizens.click();
        TestUtil.click(NCB_superPlan,"Care NCB Selected");
        TestUtil.click(GetQuotes,"Get Quotes Selected");
        WebCommands.staticSleep(4000);
    }

    public void MaternityCoverClick() {
        TestUtil.click(MaternityCover,"Maternity Cover Clicked");
        TestUtil.click(YoungStarIndGolg,"muncipal siggma selected");
        //   TestUtil.click(Manipal_cigma_PlusPlan,"muncipal siggma selected");
        TestUtil.click(GetQuotes,"Get Quotes Selected");
        WebCommands.staticSleep(4000);
    }

    public void PremiumPlansClick() {
        TestUtil.click(PremiumPlans,"Premium Plans Clicked");
        TestUtil.click(StarComprehensiveplan,"Star compression Selected");
        TestUtil.click(GetQuotes,"Get Quotes Selected");
        WebCommands.staticSleep(4000);
    }

    public void OnePlanClick(String planSelect) {
        WebCommands.staticSleep(3000);
        TestUtil.click(SeemorePlan,"Seemore clicked");
        WebCommands.staticSleep(10000);
        // TestUtil.click(Niva_Bupa_Reassure,"Niva Bupa Reassure Selected ");

        driver.findElement(By.xpath("//div[text()='"+planSelect+"']/parent::*/div/div")).click();

        TestUtil.click(GetQuotes,"Get Quotes Selected");
        WebCommands.staticSleep(4000);
    }
    public void CashlessHospital() {
        TestUtil.click(CashlessHospital,"Cashless Hospital Clicked");
        TestUtil.click(Pincodeentered,"");
        TestUtil.sendKeys(Pincodeentered,"431401","Pincode entered selected");
        TestUtil.click(insurer,"All insurer Selected");
        TestUtil.click(AllInsurerSelect,"All insurer Selected");
        TestUtil.click(FindHospital,"Find Hospital Selected");
//        TestUtil.click(SearchKey,"");
//        TestUtil.sendKeys(SearchKey,"Parbha","parbhani typed");
        TestUtil.click(ParbhaniICUSelect,"Parbhani ICU seleced");
        WebCommands.staticSleep(6000);
        TestUtil.click(GetQuotesCashless,"Cashless Get Quotes Select");
    }

    public void posp() {
        TestUtil.click(posp, "Clciked on POSP button");
        WebCommands.staticSleep(3000);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String p = it.next();
        String c = it.next();
        driver.switchTo().window(c);
        WebCommands.staticSleep(5000);
        //TestUtil.getScreenShot();
        Actions act = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", textmsg);
        //act.moveToElement(login).perform();
        //act.moveToElement(login).build().perform();
        //TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
        //TestUtil.click(login, "clicked on login button");
        login.click();
       //js.executeScript("arguments[0].click();", login);
        WebCommands.staticSleep(8000);
        boolean status = TestUtil.clickable(createAccount, "Clicked on create account button is displayed");
        Assert.assertEquals(status, true);
        driver.navigate().back();
        WebCommands.staticSleep(3000);
        TestUtil.click(signup, "clicked on Sign Up button");
        boolean signup = TestUtil.clickable(createAccount, "Clicked on create account button is displayed");
        Assert.assertEquals(signup, true);
    }

    public void Joinposp() {
        TestUtil.click(joinPosp, "Clciked on Join as POSP link");
        WebCommands.staticSleep(3000);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String p = it.next();
        String c = it.next();
        driver.switchTo().window(c);
        WebCommands.staticSleep(6000);
        TestUtil.getScreenShot();
        //TestUtil.click(login, "clicked on login button");
        js.executeScript("arguments[0].click();", login);
        WebCommands.staticSleep(8000);
        boolean status = TestUtil.clickable(createAccount, "Create account button is displayed");
        Assert.assertEquals(status, true);
        driver.navigate().back();
        WebCommands.staticSleep(3000);
        TestUtil.click(signup, "clicked on Sign Up button");
        boolean signup = TestUtil.clickable(createAccount, "Create account button is displayed");
        Assert.assertEquals(signup, true);
    }

    public void contactTMAdvisor()
    {
        tmadvisor.click();
        TestUtil.sendKeys(name, "TestLead", "Name is entered");
        TestUtil.sendKeys(mobile, "6999912345", "Mobile number entered");
        TestUtil.sendKeys(email, "test@turtlemint.com", "Email Entered");
        Select insurers = new Select(driver.findElement(By.xpath("//select[@name='InsuranceType']")));
        insurers.selectByIndex(1);
        TestUtil.click(submitlead, "Lead submitted");
        String successmsg = success.getText();
        WebCommands.staticSleep(10000);
        Assert.assertEquals(successmsg, "Success!");
        System.out.println("Lead Submitted");
    }

}