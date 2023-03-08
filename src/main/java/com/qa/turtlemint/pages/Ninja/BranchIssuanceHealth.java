package com.qa.turtlemint.pages.Ninja;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BranchIssuanceHealth extends TestBase {

    TestUtil tl = new TestUtil();

    @FindBy(xpath = "//a[contains(text(),'Policy Issuance')]")
    WebElement IssuanceBtn;

    @FindBy(xpath = "//button[@class='_md-nav-button md-accent md-button md-ink-ripple md-unselected']")
    WebElement ReportASale;

    @FindBy(xpath = "//button[@type='button'][@data-auto='new-branch-button']")
    WebElement Plusbtn;

    @FindBy(xpath = "//md-select[@id='$$vertical']")
    WebElement VerticlDropdown;

    //List Required in Function
    @FindBy(xpath = "//md-select-menu[contains(@class,'_md md-overflow')]//md-content//md-option")
    WebElement VerticalList;

    @FindBy(id = "policyIssuanceStatus")
    WebElement  PolicyIssuanceDropdown;

    //List Required in Function
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option")
    WebElement PolicyIssuaceList;

    @FindBy(id = "insurer")
    WebElement InsurerDropdown;

    @FindBy(xpath = "//li[@class='ng-scope']")
    WebElement InsurerList;

    @FindBy(xpath = "//button[contains(text(),'Create Sale')]")
    WebElement CreateSale;

    @FindBy(name = "registrationNumber")
    WebElement RegNo;

    @FindBy(xpath = "//div/md-datepicker[@id='saleCloseDate']")
    WebElement SaleCloseDatePicker;

    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")
    WebElement TodaysDate;

    @FindBy(id = "policyType")
    WebElement PolicyTypeDropdown;

    //List need to add in method
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//md-option")
    WebElement PolicyTypeList;

    @FindBy(id = "partnerName")
    WebElement PartnerName;

    @FindBy(xpath = "//button[@class='md-icon-button md-button md-ink-ripple']")
    WebElement PolicyFieldSectionArrow;

    @FindBy(xpath = "//md-select[@id='proposerTitle']")
    WebElement ProposerTitleDropDown;

    @FindBy(xpath = "//md-option[@data-auto='proposerTitle-mr-select']")
    WebElement MrSelected;

    @FindBy(id = "proposerFName")
    WebElement FName;

    @FindBy(id = "proposerLName")
    WebElement LName;

    @FindBy(id = "proposerEmail")
    WebElement Email;

    @FindBy(id = "proposerMobile")
    WebElement Mobile;

    @FindBy(xpath = "//input[@id='pincode']")
    WebElement Pincode;

    @FindBy(xpath = "//input[@id='city']")
    WebElement City;

    @FindBy(xpath = "//input[@aria-label='Plan name (custom)']")
    WebElement PlanNameCustom;

    @FindBy(xpath = "//input[@id='state']")
    WebElement State;

    @FindBy(xpath = "//input[@id='manufactureYear']")
    WebElement ManufacturingYear;

    @FindBy(xpath = "//md-select[@id=id='proposerGender']")
    WebElement GenderDropDown;

    @FindBy(xpath = "//md-option[@value='Male']")
    WebElement GenderSelect;

    @FindBy(xpath = "//md-datepicker[@id='proposerDob']//input[@placeholder='Enter date']")
    WebElement DOBDropDown;

    @FindBy(xpath = "//md-datepicker[@id='inceptionDate']//input[@placeholder='Enter date']")
    WebElement InceptionDateDropDown;

    @FindBy(xpath = "//md-datepicker[@name='policyStartDate']")
    WebElement StartDatePicker;

    @FindBy(xpath = "//table[@class='md-calendar']/tbody[4]/tr[2]/td[4]/span[@class='md-calendar-date-selection-indicator']")
    WebElement StartDate;

    @FindBy(xpath = "//input[@id='policyTerm']")
    WebElement PolicyTerm;


    @FindBy(xpath = "//md-datepicker[@name='policyEndDate']")
    WebElement EndDatePicker;

    @FindBy(xpath = "//table[@class='md-calendar']/tbody[4]/tr[2]/td[4]/span[@class='md-calendar-date-selection-indicator']")
    WebElement EndDate;

    @FindBy(xpath = "//input[@id='sumInsured']")
    WebElement sumInsured;

    @FindBy(xpath = "//input[@id='tmPlanId']")
    WebElement PlanNameDropDown;

    @FindBy(xpath = "//span[@title='Health Suraskha']")
    WebElement PlanSelect;


    @FindBy(xpath = "//input[@id='netPremium']")
    WebElement NetPremium;

    @FindBy(xpath = "//input[@id='serviceTax']")
    WebElement ServiceTax;

    @FindBy(xpath = "//input[@id='grossPremium']")
    WebElement GrossPremium;


    //List needs to be added in function
    @FindBy(xpath = "//md-card[@class='issuance-form _md'][4]//md-radio-button")
    WebElement PaymentMode;

    @FindBy(id = "chequeDetails")
    WebElement ChequeDetails;

    @FindBy(id = "paymentStatus")
    WebElement PaymentStatus;

    @FindBy(xpath = "//md-option[contains(@value,'COMPLETED')]")
    WebElement PaymentStatusValue;

    @FindBy(xpath = "//md-datepicker[(@name='paymentCompleteDate')]/button[@class='md-datepicker-button md-icon-button md-button md-ink-ripple']")
    WebElement PaymentCompleteDatePicker;

    @FindBy(xpath = "//table[@class='md-calendar']/tbody[4]/tr[2]/td[4]/span[@class='md-calendar-date-selection-indicator']")
    WebElement PaymentCompleteDate;

    @FindBy(xpath = "//md-checkbox[@id='paymentVerified']//div[@class='md-container md-ink-ripple']")
    WebElement PaymentVerifiedCheck;

    @FindBy(xpath = "//md-select[@id='policyIssuanceStatus']/md-select-value")
    WebElement IssuanceStatusDropdown;

    @FindBy(xpath = "//div[text()='Issued'][1]")
    WebElement IssuanceStatus;

    @FindBy(xpath = "//md-datepicker[@name='policyIssuanceDate']/button")
    WebElement PolicyIssuanceDatePicker;

    @FindBy(xpath = "//table[@class='md-calendar']/tbody[4]/tr[2]/td[4]/span[@class='md-calendar-date-selection-indicator']")
    WebElement PolicyIssuanceDate;

    @FindBy(id = "policyNumber")
    WebElement PolicyNumber;

    @FindBy(xpath = "//input[@type='file']")
    WebElement FileUpload;

    @FindBy(xpath = "//md-radio-button[@value='POLICY']")
    WebElement PolicyTag;

    @FindBy(xpath = "//button[normalize-space()='Done']")
    WebElement FileTagDone;

    @FindBy(xpath = "//div[@class='ng-scope layout-align-center-center layout-column'][1]")
    WebElement IssuanceSave;

    @FindBy(xpath = "//button[@data-auto='close-pi-button']")
    WebElement Close;


    public BranchIssuanceHealth() {
        PageFactory.initElements(driver, this);
    }

    public void NinjaBranchIssuanceFlow() throws InterruptedException {

        LogUtils.info("Logged In successfully");
        IssuanceBtn.click();
        LogUtils.info("Clicked on Issuance button");
        TestUtil.click(ReportASale,"Clicked on ReportSale button");
        Plusbtn.click();
        Thread.sleep(3000);
        LogUtils.info("Clicked on Branch Issuance button to create entry");
        VerticlDropdown.click();
        Thread.sleep(2000);
        LogUtils.info("Vertical selected");
        vertical_list();
        Thread.sleep(2000);
        PolicyIssuanceDropdown.click();
        LogUtils.info("Policy Issuance status selected");
        Thread.sleep(500);
        policy_issuance_status();

        Thread.sleep(500);

        InsurerDropdown.click();
        Thread.sleep(500);
        LogUtils.info("Insurer Selected");
        insurer_list();
        LogUtils.info("Showing Insurer list");


        CreateSale.click();
        LogUtils.info("Clicked on Create Sale button");
        Thread.sleep(2000);
        SaleCloseDatePicker.click();
        LogUtils.info("Sale Closer date picker opened");
        Thread.sleep(3000);
        TodaysDate.click();
        Thread.sleep(2000);

        PartnerName.sendKeys("Automation");
        LogUtils.info("Name Sent to field");
        Thread.sleep(2000);
        PartnerName.sendKeys(Keys.ARROW_DOWN);
        PartnerName.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        PolicyFieldSectionArrow.click();
        LogUtils.info("PolicyFieldSectionArrow selected");
        ProposerTitleDropDown.click();
        WebCommands.staticSleep(1000);
        MrSelected.click();
        WebCommands.staticSleep(1000);
        LogUtils.info("Title Selected as Mr.");
        FName.sendKeys("Test");
        LName.sendKeys("Health");
        Email.sendKeys("automationtesting@turtlemint.com");
        Mobile.sendKeys("7980000000");
        Pincode.sendKeys("400001");
        Thread.sleep(1000);
//        City.sendKeys("Mumbai");
//        WebCommands.staticSleep(1000);
//        State.sendKeys("Maharashtra");
        LogUtils.info("City Sent to field");
        LogUtils.info("Name, Mobile Number, Pin and State Entered");
//        GenderDropDown.click();
//        WebCommands.staticSleep(1000);
//        GenderSelect.click();
        WebCommands.staticSleep(1000);
        DOBDropDown.click();
        WebCommands.staticSleep(3000);
        DOBDropDown.sendKeys(TestUtil.ninjaPastDate(8000));
        WebCommands.staticSleep(4000);
        DOBDropDown.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(3000);
        InceptionDateDropDown.click();
        WebCommands.staticSleep(1500);
        TodaysDate.click();
        StartDatePicker.click();
        LogUtils.info("Start date picker is clicked");
        Thread.sleep(500);
        StartDate.click();

        PolicyTerm.sendKeys("1");

        sumInsured.sendKeys("30");
        LogUtils.info("Premium is set");

        WebCommands.staticSleep(1500);

        PlanNameDropDown.click();
        WebCommands.staticSleep(1500);
        PlanSelect.click();

        WebCommands.staticSleep(1500);
//        PlanNameCustom.sendKeys("HDFC Health Plan");

        NetPremium.sendKeys("2");
        LogUtils.info("net premium is set");

        ServiceTax.sendKeys("1");
        LogUtils.info("Service tax is set");

        GrossPremium.sendKeys("3");
        LogUtils.info("Gross premium is set");
        Thread.sleep(1000);
        payment_mode();
        LogUtils.info("Payment mode selected");


        ChequeDetails.sendKeys("Test");
        Thread.sleep(1000);
        LogUtils.info("Cheque details are set");


        PaymentStatus.click();
        PaymentStatusValue.click();

        Thread.sleep(1000);

        PaymentCompleteDatePicker.click();
        TodaysDate.click();
        LogUtils.info("Payment Complete Date is selected");
        Thread.sleep(1000);
        LogUtils.info("Now Waiting for payment verified check....");


        PaymentVerifiedCheck.click();
        LogUtils.info("Payment verification check box checked");


        PolicyIssuanceDatePicker.click();
        TodaysDate.click();
        LogUtils.info("Policy issuance date is selected");
        LogUtils.info("Now Waiting for Policy number...");

        Thread.sleep(1000);
        PolicyNumber.sendKeys(TestUtil.generateRandomPolicyNo(7));
        Thread.sleep(1000);
        LogUtils.info("Policy Number sent");

        LogUtils.info("Waiting to upload policy copy...");

        WebCommands.staticSleep(3000);
        FileUpload.sendKeys("/Users/tejasbahadure/Downloads/dog.png");
        //FileUpload.sendKeys("/home/ubuntu/storage/dog.png");
        LogUtils.info("Policy copy file uploaded to Server Location --> /home/ubuntu/storage/dog.png");
        Thread.sleep(4000);
        TestUtil.getScreenShot();
        PolicyTag.click();
        LogUtils.info("Policy tag selected");

        FileTagDone.click();
        LogUtils.info("File Tagging done");
        Thread.sleep(2000);
        IssuanceSave.click();
        Thread.sleep(10000);
        LogUtils.info("Details saved successfully");
        LogUtils.info("And now Entry added successfully in system");
        Close.click();

    }

    public void vertical_list()
    {
        List<WebElement> vertical_menu=driver.findElements(By.xpath("//md-select-menu[contains(@class,'_md md-overflow')]//md-content//md-option"));
        System.out.println("Vertical Menu = " + vertical_menu.size());


        for(int i=0; i<vertical_menu.size(); i++)
        {
            System.out.println(vertical_menu.get(i).getText());
            if(vertical_menu.get(i).getText().contains("Health"))
            {
                vertical_menu.get(i).click();
                break;
            }
        }
    }


    public void policy_issuance_status()
    {
        List<WebElement> Issuance_menu=driver.findElements(By.xpath("//div[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option"));
        System.out.println("Issuance Status = " +Issuance_menu.size());

        for(int j=0;j<Issuance_menu.size();j++)
        {
            System.out.println(Issuance_menu.get(j).getText());

            if(Issuance_menu.get(j).getText().contains("Issued"))
            {
                Issuance_menu.get(j).click();
                break;
            }

        }
    }

    public void insurer_list()
    {
        List<WebElement> insurerlist=driver.findElements(By.xpath("//li[@class='ng-scope']"));

        System.out.println("Insurer List = " +insurerlist.size());

        for(int k=0;k<insurerlist.size();k++)
        {
            if(insurerlist.get(k).getText().contains("HDFC Ergo"))
            {
                insurerlist.get(k).click();
            }
        }
    }

    public void policy_type()
    {
        List<WebElement> policy_type=driver.findElements(By.xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option"));
        System.out.println("Policy Type = " + policy_type.size());

        for(int l=0; l<policy_type.size();l++)
        {
            if(policy_type.get(l).getText().contains("Comprehensive"))
            {
                policy_type.get(l).click();
            }
        }
    }

    public void payment_mode()
    {
        List<WebElement> payment_mode= driver.findElements(By.xpath("//md-card[@class='issuance-form _md'][4]//md-radio-button"));
        System.out.println("Payment Mode = " + payment_mode.size());

        for (int m=0;m<payment_mode.size();m++)
        {
            if (payment_mode.get(m).getText().contains("Cheque"))
            {
                payment_mode.get(m).click();
            }
        }
    }



}