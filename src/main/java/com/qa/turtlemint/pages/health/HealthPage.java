package com.qa.turtlemint.pages.health;

import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.base.TestBase.driver;

public class HealthPage {

    @FindBy(xpath = "//label[@class='select-type-health-desk']//img[@class='health-img']")
    WebElement health;

    @FindBy(xpath = "//div[contains(@class,'cta-btns d-none d-lg-block d-sm-none d-md-block')]//button[@type='button'][normalize-space()='Get a Quote']")
    WebElement getQuate;


    public HealthPage() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateHealthClick() throws InterruptedException {
        TestUtil.click(health,"health button Click");
        TestUtil.click(getQuate,"Get Quote button Click");
        System.out.println("Entered HealthPage");
    }
}
