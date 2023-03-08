package com.qa.turtlemint.pages.health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends TestBase {

    public Dashboard() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement GotitButton;
    @FindBy(xpath = "//img[@class=\"returnimg\"]")
    WebElement BacktoHome;
    @FindBy(xpath = "//button[@ng-click=\"goToPage('BTOH/dashboard');scrollTop();\"]")
    WebElement okbutton;
    @FindBy(xpath = "//div[@class=\"leadCardWrapper\"]")
    WebElement Clickon1stLead;
    @FindBy(xpath = "//span[text()='Quote']")
    WebElement ClickonQuote;

    //Select Niva Bupa Issurnace
    @FindBy(xpath = "//button[@id=\"CTA_DDO01\"]")
    WebElement ClickonViewDetailsButton;
    @FindBy(xpath = "//button[@id=\"proceed-btn\"]")
    WebElement BuyNowButton;
    @FindBy(xpath = "//span[text()='Proposal']")
    WebElement ClickonProposalButton;

    public void dashboard(String name)
    {
        System.out.println(name+"Inside Dashboard");
        TestUtil.click(GotitButton,"Click on got it button");
        TestUtil.click(BacktoHome,"Click on Back to Home on Result Page");
        WebCommands.staticSleep(2000);
        TestUtil.click(okbutton,"Click on Ok button");
        WebCommands.staticSleep(5000);

        WebElement test = driver.findElement(By.xpath("//h3[text()='"+name+"']"));
        TestUtil.click(test,"Click on Lead name");

       // TestUtil.click(Clickon1stLead,"Click on 1st lead");
        TestUtil.getScreenShot();
        TestUtil.click(ClickonQuote,"Click On Quote Button");
        WebCommands.staticSleep(20000);
        TestUtil.getScreenShot();
        TestUtil.click(ClickonViewDetailsButton,"Click on View Details Button");
        LogUtils.info("Select Digit Insurance");
        WebCommands.staticSleep(3000);
        TestUtil.click(BuyNowButton,"Click on Buy Button");
        WebCommands.staticSleep(5000);
        TestUtil.click(BacktoHome,"Click on Back to Home on Result Page");
        WebCommands.staticSleep(3000);
        TestUtil.click(okbutton, "Click on Ok Button");
        WebCommands.staticSleep(3000);
       // TestUtil.click(Clickon1stLead,"Click on 1st lead");

        WebElement test2 = driver.findElement(By.xpath("//h3[text()='"+name+"']"));
        TestUtil.click(test2,"Click on Lead name");

        TestUtil.getScreenShot();
        WebCommands.staticSleep(5000);
        TestUtil.click(ClickonProposalButton,"Click on Proposal button");
        WebCommands.staticSleep(5000);
        LogUtils.info("User is on Checkout Page");

    }
}