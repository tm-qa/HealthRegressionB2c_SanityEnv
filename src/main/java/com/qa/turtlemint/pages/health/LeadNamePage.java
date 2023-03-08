package com.qa.turtlemint.pages.health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.TestNGUtils;

public class LeadNamePage extends TestBase {

    public LeadNamePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement name;

    @FindBy(xpath = "//input[@type='tel']")
    WebElement mobile;

    @FindBy(xpath = "//input[@data-auto='leadEmail']")
    WebElement email;

    @FindBy(id="Next")
    WebElement NextButton;

    public void SaveLead(String LeadName) throws InterruptedException {
        name.sendKeys(LeadName);
        mobile.sendKeys("6999912345");
        email.sendKeys("manjiri.s@turtlemint.com");
        LogUtils.info("All Details Filled and Lead Name Entered");
        NextButton.click();
        WebCommands.staticSleep(2000);
    }
}

