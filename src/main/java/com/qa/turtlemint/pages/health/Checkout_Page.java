package com.qa.turtlemint.pages.health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class  Checkout_Page extends TestBase {
    public Checkout_Page() {
        PageFactory.initElements(driver, this);
    }

    String currentWindow;

    @FindBy(xpath = "//input[@placeholder=\"Enter mobile number\"]")
    WebElement MobileNo;

    @FindBy(xpath = "//input[@placeholder=\"Enter Email Id\"]")
    WebElement Mailid;

    @FindBy(xpath = "//button[@data-auto=\"Continue\"]")
    WebElement Continue;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement Continue2;

    @FindBy(xpath = "//input[@placeholder='PAN']")
    WebElement PanNo;

    @FindBy(xpath = "//input[@name='proposer.panNo']")
    WebElement OtherPanNo;

    @FindBy(xpath = "//input[@id=\"insuredMembers.0.name\"]")
    WebElement NomineeFullName;

    @FindBy(xpath = "//input[@id=\"insuredMembers.1.name\"]")
    WebElement NomineeFullName2;

    @FindBy(xpath = "//input[@id=\"insuredMembers.2.name\"]")
    WebElement NomineeFullName3;

    @FindBy(xpath = "//input[@id=\"insuredMembers.3.name\"]")
    WebElement NomineeFullName4;

    @FindBy(xpath = "//div[@id=\"insuredMembers.0.education-uiSelect\"]")
    WebElement education1;

    @FindBy(xpath = "//div[@id=\"insuredMembers.1.education-uiSelect\"]")
    WebElement education2;

    @FindBy(xpath = "//div[@id=\"insuredMembers.2.education-uiSelect\"]")
    WebElement education3;

    @FindBy(xpath = "//div[@id=\"insuredMembers.3.education-uiSelect\"]")
    WebElement education4;


    @FindBy(xpath = "//div[@id=\"proposer.education-uiSelect\"]")
    WebElement education;

    @FindBy(xpath = "//span[text()='Education and Teaching Professional']")
    WebElement educationandTeching;

    @FindBy(xpath = "//span[text()='Graduate']")
    WebElement graduate;

    @FindBy(xpath = "//span[text()='Undergraduates']")
    WebElement undergraduates;

    @FindBy(xpath = "//input[@id=\"insuredMembers.0.dob-datepicker\"]")
    WebElement DOB;

    @FindBy(xpath = "//input[@id=\"insuredMembers.1.dob-datepicker\"]")
    WebElement DOB2;

    @FindBy(xpath = "//input[@id=\"insuredMembers.2.dob-datepicker\"]")
    WebElement DOB3;

    @FindBy(xpath = "//input[@id=\"insuredMembers.3.dob-datepicker\"]")
    WebElement DOB4;

    @FindBy(xpath = "//input[@id=\"insuredMembers.0.height_feet\"]")
    WebElement feet;

    @FindBy(xpath = "//input[@id=\"insuredMembers.1.height_feet\"]")
    WebElement feet2;

    @FindBy(xpath = "//input[@id=\"insuredMembers.2.height_feet\"]")
    WebElement feet3;

    @FindBy(xpath = "//input[@id=\"insuredMembers.3.height_feet\"]")
    WebElement feet4;

    @FindBy(xpath = "//input[@id='insuredMembers.0.height_inches']")
    WebElement inch;

    @FindBy(xpath = "//input[@id='insuredMembers.1.height_inches']")
    WebElement inch2;

    @FindBy(xpath = "//input[@id='insuredMembers.2.height_inches']")
    WebElement inch3;

    @FindBy(xpath = "//input[@id='insuredMembers.3.height_inches']")
    WebElement inch4;

    @FindBy(xpath = "//input[@data-auto=\"insuredmembers.0.weight\"]")
    WebElement Weight;

    @FindBy(xpath = "//input[@data-auto=\"insuredmembers.1.weight\"]")
    WebElement Weight2;

    @FindBy(xpath = "//input[@data-auto=\"insuredmembers.2.weight\"]")
    WebElement Weight3;

    @FindBy(xpath = "//input[@data-auto=\"insuredmembers.3.weight\"]")
    WebElement Weight4;

    @FindBy(xpath = "//div[@id=\"insuredMembers.0.occupation-uiSelect\"]")
    WebElement occupationdropdown;

    @FindBy(xpath = "//div[@id=\"insuredMembers.1.occupation-uiSelect\"]")
    WebElement occupationdropdown2;

    @FindBy(xpath = "//div[@id=\"insuredMembers.2.occupation-uiSelect\"]")
    WebElement occupationdropdown3;

    @FindBy(xpath = "//span[text()=\"STUDENTS-SCHOOL AND COLLEGE\"]")
    WebElement OccupationDaughter;

    @FindBy(xpath = "//span[text()='STUDENT']")
    WebElement OccupationStudent;

    @FindBy(xpath = "//span[text()=\"PRIVATE_JOB\"]")
    WebElement PrivateJobSelect;

    @FindBy(xpath = "//span[text()='HOUSEWIVES']")
    WebElement Housewives;

    @FindBy(xpath = "//span[text()='House wife']")
    WebElement HousewivesNiva;

    @FindBy(xpath = "//span[text()='Housewife']")
    WebElement HousewifeHDFC;


    @FindBy(xpath = "//span[text()='Salaried']")
    WebElement Salaried;

    @FindBy(xpath = "//input[@id='insuredMembers.0.mobile']")
    WebElement MobileNos;

    @FindBy(xpath = "//input[@id='insuredMembers.1.mobile']")
    WebElement MobileNoSpouse;

    @FindBy(xpath = "//input[@id='insuredMembers.2.mobile']")
    WebElement MobileNoSon;

    @FindBy(xpath = "//input[@name='proposer.nomineeName']")
    WebElement nomineenamedetail;

    @FindBy(xpath = "//input[@name='insuredMembers.0.name']")
    WebElement selfNameStar;

    @FindBy(xpath = "//input[@name='insuredMembers.0.nomineeName']")
    WebElement nomineenamedetailDiabetes;

    @FindBy(xpath = "//input[@name='insuredMembers.1.nomineeName']")
    WebElement nomineenamedetailDiabetes2;

    @FindBy(xpath = "//input[@name='insuredMembers.2.nomineeName']")
    WebElement nomineenamedetailDiabetes3;

    @FindBy(xpath = "//div[@id='proposer.nomineeRelation-uiSelect']")
    WebElement nomineeisMy;

    @FindBy(xpath = "//span[text()='Relationship']")
    WebElement nomineeisMyDiabetes;

    @FindBy(xpath = "(//span[text()='Relationship'])[2]")
    WebElement nomineeisMyDiabetes2;


    @FindBy(xpath = "(//span[text()='Relationship'])[4]")
    WebElement adityanominee;

    @FindBy(xpath = "(//span[text()='Relationship'])[3]")
    WebElement nomineeisMyDiabetes3;

    @FindBy(xpath = "//span[text()='Mother']")
    WebElement mother;

    @FindBy(xpath = "//input[@id='proposer.nomineeMobileNumber']")
    WebElement nomineemobileNodetails;

    @FindBy(xpath = "//input[@id='insuredMembers.0.nomineeMobileNumber']")
    WebElement nomineemobileNodetailsDiabetes;

    @FindBy(xpath = "//input[@id='insuredMembers.1.nomineeMobileNumber']")
    WebElement nomineemobileNodetailsDiabetes2;

    @FindBy(xpath = "(//input[@placeholder=\"Enter mobile number\"])[4]")
    WebElement AdityaMobile;



    @FindBy(xpath = "//input[@id='insuredMembers.2.nomineeMobileNumber']")
    WebElement nomineemobileNodetailsDiabetes3;

    @FindBy(xpath = "//input[@id=\"proposer.nomineeDob-datepicker\"]")
    WebElement dobdetails;

    @FindBy(xpath = "//input[@id=\"addrLine1\"]")
    WebElement Address1;

    @FindBy(xpath = "//input[@id=\"addrLine2\"]")
    WebElement Address2;

    @FindBy(xpath = "//span[text()='Online']")
    WebElement online;

    @FindBy(xpath = "//span[text()='Cheque']")
    WebElement cheque;

    @FindBy(xpath = "//span[text()=' Copy link']")
    WebElement copylink;

    @FindBy(xpath = "//span[@class=\"checkmark\"]")
    WebElement checkmark;

    @FindBy(xpath = "//button[text()='Approve']")
    WebElement Approve;

    @FindBy(xpath = "//button[text()=\"Reject\"]")
    WebElement Reject;

    @FindBy(xpath = "//input[@id=\"otp\"]")
    WebElement otp;

    @FindBy(xpath = "//button[@data-auto=\"otpverifybutton\"]")
    WebElement verifyotp;

    @FindBy(xpath = "//input[@id=\"copytxtInput\"]")
    WebElement copyURLLink;

    @FindBy(xpath = "//div[@id=\"rejectionReason-uiSelect\"]")
    WebElement reasondropdown;

    @FindBy(xpath = "//span[text()='Others']")
    WebElement reasonselect;

    @FindBy(xpath = "//button[@data-ng-click=\"cancelFn()\"]")
    WebElement closecrossbutton;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement RejectSubmitButton;

    @FindBy(xpath = "//span[@aria-label='Select box activate']")
    WebElement CityDropdown;

    @FindBy(xpath = "//span[@class='ui-select-choices-row-inner']")
    WebElement CitySelect;

    @FindBy(xpath = "(//span[@aria-label='Select box activate'])[2]")
    WebElement AreaDropdown;

    @FindBy(xpath = "//input[@id='proposer.proposer.nomineeAddress']")
    WebElement nomineeAddress;

    @FindBy(xpath = "//input[@id=\"CardNumber\"]")
    WebElement cardnumber;

    @FindBy(xpath = "//select [@id=\"ExpiryMonth\"]")
    WebElement expirymonth;

    @FindBy(xpath = "//select [@id=\"ExpiryMonth\"]//option[@value=03]")
    WebElement expirymonthselect;

    @FindBy(xpath = "//select [@id=\"ExpiryYear\"]")
    WebElement expiryyear;

    @FindBy(xpath = "//select [@id=\"ExpiryYear\"]//option[@value=2024]")
    WebElement expiryyearselect;

    @FindBy(xpath = "//input [@id=\"CVV\"]")
    WebElement cvv;

    @FindBy(xpath = "//input [@id=\"CardHolderName\"]")
    WebElement cardholdername;

    @FindBy(xpath = "//input [@id=\"CardPaymentSubmit\"]")
    WebElement submitbuttonforicic;

    @FindBy(xpath = "//span[text()='Cheque']")
    WebElement Cheque;

    @FindBy(xpath = "//file-handler[@data-auto=\"cheque\"]//input[@type='file']")
    WebElement Chequeupload;

    @FindBy(xpath = "//file-handler[@data-auto=\"id_proof\"]//input[@type='file']")
    WebElement IDUpload;

    @FindBy(xpath = "//button[@class=\"common-btn\"]")
    WebElement Yeshdfc;

    @FindBy(xpath = "//div[@class=\"static-menu\"]")
    WebElement hdfcmenu;

    @FindBy(xpath = "//li[text()='HDFC BANK CREDIT CARD']")
    WebElement creditCardHdfc;

    @FindBy(id="cardNumber")
    WebElement hdfccardno;

    @FindBy(id="cardExpiry")
    WebElement hdfcbcardexpiry;

    @FindBy(id="cardCvv")
    WebElement hdfcCVV;

    @FindBy(id="cardOwnerName")
    WebElement  hdfccardname;

    @FindBy(xpath = "(//div[text()='Recaptcha requires verification. ']//parent::div//span)[3]")
    WebElement hdfcnotbot;

    @FindBy(xpath = "//span[text()='PROCEED']")
    WebElement submit;

    @FindBy(xpath = "//a[text()='Go back to ']")
    WebElement goback;

    @FindBy(xpath = "(//div[@placeholder=\"Marital Status\"])[3]")
    WebElement maritalstatusdropdown;

    @FindBy(xpath = "//span[text()='Married']")
    WebElement married;

    @FindBy(xpath = "//div[@placeholder=\"Title\"]")
    WebElement zonedropdown;

    @FindBy(xpath = "//span[text()='Zone 1']")
    WebElement zone1;

    @FindBy(xpath = "//div[text()='Card']")
    WebElement fgtiecard;

    @FindBy(id="card_number")
    WebElement fgticardnumber;

    @FindBy(id="card_expiry")
    WebElement fgtiExpiry;

    @FindBy(id="card_cvv")
    WebElement fgtiCVV;

    @FindBy(xpath = "//span[text()='Save card securely for future payments']")
    WebElement checkmarkfgti;

    @FindBy(xpath = "//button[text()='Pay Now']")
    WebElement fgtiPaynow;

    @FindBy(xpath = "//i[text()='arrow_forward']//parent::a")
    WebElement fgtigobackToBankPage;

    @FindBy(xpath = "//button[text()='Success']")
    WebElement Successclicked;

    @FindBy(xpath = "//button[text()='Failure']")
    WebElement FailuareClicked;

    @FindBy(id="proposer.occupation-uiSelect")
    WebElement nomineeocupation;

    @FindBy(xpath = "//span[text()='Engineer']")
    WebElement engineeer;

    @FindBy(xpath = "//span[text()='ACCOUNTANT']")
    WebElement Accountant;




    @FindBy(xpath="(//span[@aria-label='Select box activate'])[2]")
    WebElement incomrsource;

    @FindBy(xpath="//span[text()='Salary'] ")
    WebElement salary;


    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions act = new Actions(driver);


    public void commonContactDetails() {
        TestUtil.sendKeys(MobileNo, "6999912345", "mobile enered");
        TestUtil.sendKeys(Mailid, "automationtesting@turtlemint.com", "mail enered");
        TestUtil.click(Continue, "continue clicked");
        WebCommands.staticSleep(5000);
    }

    public void selfInsuredDetails() {
        TestUtil.sendKeys(NomineeFullName, "Test Auto", "Name entered");
        DOB.sendKeys("12/02/1988");
        DOB.sendKeys(Keys.ENTER);
        act.moveToElement(feet).click().perform();
        TestUtil.sendKeys(feet, "5", "feet enteerd");
        TestUtil.sendKeys(inch, "9", "inch entered");
        TestUtil.sendKeys(Weight, "72", "Wt entered");
    }

    public void selfDetailsForOriental() {
        TestUtil.sendKeys(NomineeFullName, "Test Auto", "Name entered");
        DOB.sendKeys("12/02/1988");
        TestUtil.click(Continue, "Continue Pressed");
    }

    public void nomineeoccupation() {
        TestUtil.click(nomineeocupation, "");
        TestUtil.click(engineeer, "engineer select");
    }


    public void occupationSelect() {
        TestUtil.click(occupationdropdown, "");
        TestUtil.click(PrivateJobSelect, "Private select");
    }

    public void occupationSelectMaternity() {
        WebCommands.staticSleep(6000);
        TestUtil.click(occupationdropdown, "");
        WebCommands.staticSleep(1000);
        TestUtil.click(Housewives, "Housewife selected");
    }

    public void occupationSelectAccountant(){
        WebCommands.staticSleep(2000);
        TestUtil.click(occupationdropdown, "");
        TestUtil.click(Accountant, "Account selected");
    }

    public void occupationSelectOnePlan() {
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        TestUtil.click(occupationdropdown, "");
        TestUtil.click(Salaried, "Occupation One Plan");

    }

    public void occupationSelectPremiumPlans() {
        WebCommands.staticSleep(2000);
        TestUtil.click(occupationdropdown2, "");
        TestUtil.click(Housewives, "Housewife selected");
    }

    public void occupationSelectHDFC() {
        WebCommands.staticSleep(2000);
        TestUtil.click(occupationdropdown2, "");
        TestUtil.click(HousewifeHDFC, "Housewife selected");
    }

    public void educationSelect() {
        WebCommands.staticSleep(6000);
        TestUtil.getScreenShot();
        TestUtil.click(education1, "Education Dropdown opened");
      // education1.click();
        TestUtil.click(graduate, "Graduate Selected");
    }

    public void SBIeducationSelect() {
        TestUtil.click(education1, "Education Dropdown opened");
        TestUtil.click(undergraduates, "Graduate Selected");
        TestUtil.click(occupationdropdown, "");
        TestUtil.click(educationandTeching,"");
    }

    public void spouseInsuredDetails() {
        TestUtil.sendKeys(NomineeFullName2, "test test", "second time name entered");
        DOB2.sendKeys("12/02/1988");
        DOB2.sendKeys(Keys.ENTER);
        WebCommands.staticSleep(5000);
        act.moveToElement(feet2).click().perform();
        TestUtil.sendKeys(feet2, "5", "feet enteerd");
        TestUtil.sendKeys(inch2, "4", "inch entered");
        TestUtil.sendKeys(Weight2, "55", "Wt entered");
    }

    public void ComppairePageDetails() {
        TestUtil.sendKeys(NomineeFullName, "test test", "1st time name entered");
        DOB.sendKeys("12/02/1988");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(NomineeFullName2, "test test", "2nd time name entered");
        DOB2.sendKeys("12/02/1988");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(NomineeFullName3, "test test", "3rd time name entered");
        DOB3.sendKeys("12/02/1998");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(NomineeFullName4, "test test", "4rth time name entered");
        DOB4.sendKeys("12/02/2002");
        TestUtil.click(Continue, "continue");
    }

    public void spouseOccupationSelect() {
        TestUtil.click(occupationdropdown2, "");
        TestUtil.click(PrivateJobSelect, "Private select");
    }



    public void spouseEducationSelect() {
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(education2, "Education Dropdown opened");
        TestUtil.getScreenShot();
        TestUtil.click(graduate, "Graduate Selected");
    }


    public void DaughterInsuredDetails() {
        TestUtil.sendKeys(NomineeFullName3, "test test", "second time name entered");
        DOB3.sendKeys("12/02/2017");
        DOB3.sendKeys(Keys.ENTER);
        WebCommands.staticSleep(2000);
        act.moveToElement(feet3).click().perform();
        TestUtil.sendKeys(feet3, "4", "feet enteerd");
        TestUtil.sendKeys(inch3, "2", "inch entered");
        TestUtil.sendKeys(Weight3, "20", "Wt entered");
    }


    public void SonInsuredDetails() {
        TestUtil.sendKeys(NomineeFullName3, "test test", "second time name entered");
        DOB3.sendKeys("12/02/1988");
        WebCommands.staticSleep(2000);
        act.moveToElement(feet3).click().perform();
        TestUtil.sendKeys(feet3, "4", "feet enteerd");
        TestUtil.sendKeys(inch3, "2", "inch entered");
        TestUtil.sendKeys(Weight3, "20", "Wt entered");
        TestUtil.click(education2,"");
        TestUtil.click(graduate,"Graduate select");
    }
    public void DautherInsuredDetails() {
        TestUtil.sendKeys(NomineeFullName4, "test test", "second time name entered");
        WebCommands.staticSleep(2000);
        act.moveToElement(feet4).click().perform();
        TestUtil.sendKeys(feet4, "5", "feet enteerd");
        TestUtil.sendKeys(inch4, "2", "inch entered");
        TestUtil.sendKeys(Weight4, "78", "Wt entered");
        DOB4.sendKeys("12/02/1988");
        DOB4.sendKeys(Keys.ENTER);
    }
    public void SonInsuredDetailsNIva() {
        TestUtil.sendKeys(NomineeFullName3, "test test", "second time name entered");
        WebCommands.staticSleep(3000);
        DOB3.sendKeys("12/02/1988");
        DOB3.sendKeys(Keys.ENTER);
        WebCommands.staticSleep(3000);
        act.moveToElement(feet3).click().perform();
        TestUtil.sendKeys(feet3, "5", "feet enteerd");
        TestUtil.sendKeys(inch3, "2", "inch entered");
        TestUtil.sendKeys(Weight3, "78", "Wt entered");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(8000);
        TestUtil.click(education3,"");
        //js.executeScript("arguments[0].click();",education3);
        TestUtil.click(graduate,"Graduate select");
       // js.executeScript("arguments[0].click();",graduate);
     //   js.executeScript("arguments[0].click();", );
        TestUtil.click(occupationdropdown3, "");
        TestUtil.click(Salaried,"");

    }
    public void SonInsuredDetailsAditya() {
        TestUtil.sendKeys(NomineeFullName3, "test test", "second time name entered");
        DOB3.sendKeys("12/02/1988");
        WebCommands.staticSleep(2000);
        act.moveToElement(feet3).click().perform();
        TestUtil.sendKeys(feet3, "5", "feet enteerd");
        TestUtil.sendKeys(inch3, "2", "inch entered");
        TestUtil.sendKeys(Weight3, "78", "Wt entered");

        TestUtil.sendKeys(nomineenamedetailDiabetes3, "auto test", "name entered");
        WebCommands.staticSleep(4000);
        TestUtil.click(nomineeisMyDiabetes3, "Clicked on Drop Down");
        WebCommands.staticSleep(2000);
        TestUtil.click(mother, "mother clicked");
        TestUtil.sendKeys(nomineemobileNodetailsDiabetes3, "6999912345", "");

    }


    public void finalNomineeDetails() {
        TestUtil.sendKeys(nomineenamedetail, "auto test", "name entered");
        TestUtil.click(nomineeisMy, "");
        TestUtil.click(mother, "mother clicked");
        TestUtil.sendKeys(nomineemobileNodetails, "6999912345", "");
        WebCommands.staticSleep(3000);
        dobdetails.sendKeys("12/02/1988");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(3000);
    }
    public void ICICfinalNomineeDetails() {
        TestUtil.sendKeys(nomineenamedetail, "auto test", "name entered");
        TestUtil.click(nomineeisMy, "");
        TestUtil.click(mother, "mother clicked");
       // TestUtil.sendKeys(nomineemobileNodetails, "6999912345", "");
        dobdetails.sendKeys("12/02/1988");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(3000);
    }

    public void finalNomineeDetailsDiabetes() {
        TestUtil.sendKeys(nomineenamedetailDiabetes, "auto test", "name entered");
        WebCommands.staticSleep(4000);
        TestUtil.click(nomineeisMyDiabetes, "Clicked on Drop Down");
//        act.moveToElement(nomineeisMyDiabetes).click().perform();
//        nomineeisMyDiabetes.click();
        WebCommands.staticSleep(2000);
        TestUtil.click(mother, "mother clicked");
        TestUtil.sendKeys(nomineemobileNodetailsDiabetes, "6999912345", "");
//        dobdetails.sendKeys("12/02/1988");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(5000);
    }

    public void finalNomineeDetailswithAddress() {
        TestUtil.sendKeys(nomineenamedetail, "auto test", "name entered");
        TestUtil.click(nomineeisMy, "");
        TestUtil.click(mother, "mother clicked");
        TestUtil.sendKeys(nomineemobileNodetails, "6999912345", "");
        dobdetails.sendKeys("12/02/1988");
        TestUtil.sendKeys(nomineeAddress, "asdfghjye", "Mobile No entered");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(3000);
    }

    public void finalNomineeDetailswithoutMobileNumber() {
        TestUtil.sendKeys(nomineenamedetail, "auto test", "name entered");
        TestUtil.click(nomineeisMy, "");
        TestUtil.click(mother, "mother clicked");
        dobdetails.sendKeys("12/02/1988");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(3000);
    }

    public void finalNomineeDetailswithoutMobilenDOB() {
        TestUtil.sendKeys(nomineenamedetail, "auto test", "name entered");
        TestUtil.click(nomineeisMy, "");
        TestUtil.click(mother, "mother clicked");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(3000);
    }

    public void medicalHistoryQuestions() {
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(3000);
        TestUtil.click(Continue, "continue");
    }

    public void medicalQuestionOriental() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(3000);
        Continue2.click();
    }

    public void mailingAddress() {
        WebCommands.staticSleep(6000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(Address1, "adressAutomaation", "Adress line 1 entered");
        TestUtil.sendKeys(Address2, "adressAutomaation", "Adress line 2 entered");
        TestUtil.click(Continue, "continue clicked");
    }


    public void maternityAddress() {
        TestUtil.sendKeys(Address1, "adressAutomaation", "Adress line 1 entered");
        TestUtil.sendKeys(Address2, "adressAutomaation", "Adress line 2 entered");
        TestUtil.click(CityDropdown, "CityDropdown Opened");
        TestUtil.click(CitySelect, "City Selected");
        TestUtil.click(AreaDropdown, "AreaDropdown Opened");
        TestUtil.click(CitySelect, "Area Selected");
        TestUtil.click(Continue, "continue clicked");
    }

    public void paymentDetails() {
        WebCommands.staticSleep(8000);
        TestUtil.click(online, "Online clicked");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(12000);
        TestUtil.click(Continue, "Continue clicked"); //Make Payment
        WebCommands.staticSleep(25000);
        TestUtil.getScreenShot();
    }

    public void ChequepaymentDetails() {
        TestUtil.click(Cheque, "Online clicked");
        TestUtil.click(Continue, "Continue clicked");
        WebCommands.staticSleep(5000);
    }
    public void Documents() {
        Chequeupload.sendKeys("/home/ubuntu/storage/dog.png");
        WebCommands.staticSleep(2000);
        IDUpload.sendKeys("/home/ubuntu/storage/dog.png");
        WebCommands.staticSleep(2000);
        TestUtil.click(Continue, "Continue clicked");
    }

    public void share_payment_link() {
        WebCommands.staticSleep(18000);
        TestUtil.click(copylink, "Copy link clicked");
        TestUtil.click(closecrossbutton, "close share window button");
        String copiedText = copyURLLink.getAttribute("value");
        System.out.println("copied link is " + copiedText);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(copiedText);
        WebCommands.staticSleep(2000);
    }

    public void icicpayment() {
        TestUtil.sendKeys(cardnumber, "411111111111", " Card no entered");
        TestUtil.click(expirymonth, "");
        TestUtil.click(expirymonthselect, "month selected");
        TestUtil.click(expiryyear, "");
        TestUtil.click(expiryyearselect, "Expiry year selected");
        TestUtil.sendKeys(cvv, "111", "CVV entered");
        TestUtil.sendKeys(cardholdername, "test auto testing", "card holder entered");
        TestUtil.click(submitbuttonforicic, "sumbit for ICC payment");
    }

    public void RazorPaySuccesspayment(WebElement SUCESSorFAILURE) {
        driver.switchTo().frame(0);
        TestUtil.click(fgtiecard,"");
        TestUtil.sendKeys(fgticardnumber, "4111111111111111", " Card no entered");
        TestUtil.sendKeys(fgtiExpiry,"0424" ,"Expiry year selected\"");
        TestUtil.sendKeys(fgtiCVV, "123", "CVV entered");
        TestUtil.click(checkmarkfgti ,"checkmark tip");
        TestUtil.click(fgtiPaynow, "sumbit for Future payment");
        WebCommands.staticSleep(10000);
        TestUtil.click(fgtigobackToBankPage,"go back to page ");
        TestUtil.click(SUCESSorFAILURE,"Success or Failure button clicked");
        WebCommands.staticSleep(18000);
        LogUtils.info("Payment Successfully Done");
        TestUtil.getScreenShot();

    }
    public void HDFCpayment() {
        WebCommands.staticSleep(8000);
        TestUtil.click(Yeshdfc, " Yes clicked");
        TestUtil.click(hdfcmenu, "");
        TestUtil.click(creditCardHdfc, "credit card selected");
        TestUtil.sendKeys(hdfccardno,"4111111111111111", "card no entered");
        TestUtil.sendKeys(hdfcbcardexpiry,"0424", "Expiry month selected");
        TestUtil.sendKeys(hdfcCVV, "111", "CVV entered");
        TestUtil.sendKeys(hdfccardname, "test auto testing", "card holder entered");
        TestUtil.click(hdfcnotbot, "i am not bot clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(submit, "i am not bot clicked");
        WebCommands.staticSleep(8000);
        TestUtil.click(goback,"clicked on Go back button");
        WebCommands.staticSleep(12000);
    }

    public void do_payment(String Approved_OR_reject) {
        WebCommands.staticSleep(7000);
        act.moveToElement(checkmark).click().build().perform();
        if (Approved_OR_reject == "A") {
            WebCommands.staticSleep(8000);
            act.moveToElement(Approve).click().build().perform();
            LogUtils.info("Approve clicked");
            WebCommands.staticSleep(3000);
            TestUtil.sendKeys(otp, "1234", "OTP entered");
            TestUtil.click(verifyotp, "verify OTP");
            WebCommands.staticSleep(8000);
            TestUtil.getScreenShot();
            //  icicpayment();

        } else {
            act.moveToElement(Reject).click().build().perform();
            LogUtils.info("Reject clicked");
            TestUtil.click(reasondropdown, "dropdown reson");
            TestUtil.click(reasonselect, "");
            TestUtil.click(RejectSubmitButton, "Submit btn pressed");
            TestUtil.getScreenShot();
        }
    }

    public void backtoMainWindow(){
        driver.close();
        driver.switchTo().window(currentWindow);
        WebCommands.staticSleep(1200);
        driver.navigate().refresh();
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }

    public void checkmarks() {
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size = AllCheckboxes.size();
        for (int i = 0; i < size; i++) {
            WebCommands.staticSleep(2000);
            AllCheckboxes.get(i).click();
        }
    }

    public void CheckoutFloater_Normal() {
        commonContactDetails();
        TestUtil.sendKeys(PanNo, "ttttt0000t", "Pan Entered");
        selfInsuredDetails();
        occupationSelect();
        spouseInsuredDetails();
        spouseOccupationSelect();
        finalNomineeDetails();
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
       // share_payment_link();
       //do_payment("R");
       //backtoMainWindow();
    }


    public void Checkout_individual_Normal() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "ttttt0000t", "Pan Entered");
        selfInsuredDetails();
        ICICfinalNomineeDetails();
        WebCommands.staticSleep(5000);
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
       // share_payment_link();
     //   do_payment("A");
       // backtoMainWindow();
        //WebCommands.staticSleep(2000);
    }

    public void CheckoutMultiIndividual() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "ttttt0000t", "Pan Entered");
        TestUtil.click(education, "Education Dropdown opened");
        TestUtil.click(graduate, "Graduate Selected");
        selfInsuredDetails();
        educationSelect();
        TestUtil.getScreenShot();
        spouseEducationSelect();
        TestUtil.getScreenShot();
        spouseInsuredDetails();
//        TestUtil.click(education2, "Education Dropdown opened");
//        TestUtil.click(graduate, "Graduate Selected");
        finalNomineeDetailswithoutMobileNumber();
        medicalHistoryQuestions();
        mailingAddress();
//        ChequepaymentDetails();
//        Documents();
        WebCommands.staticSleep(3000);
        paymentDetails();
      //  share_payment_link();
      //  do_payment("A");
        //backtoMainWindow();
        //WebCommands.staticSleep(2000);
    }
    public void CheckoutCompairPlan() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        TestUtil.click(education, "Education Dropdown opened");
        TestUtil.click(graduate, "Graduate Selected");
        selfInsuredDetails();
        educationSelect();
        WebCommands.staticSleep(1000);
        spouseEducationSelect();
        spouseInsuredDetails();
        TestUtil.sendKeys(NomineeFullName3, "test test", "second time name entered");
        TestUtil.click(maritalstatusdropdown,"");
        TestUtil.click(married,"married selected");
        DOB3.sendKeys("12/02/1988");
        DOB3.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(2000);
        act.moveToElement(feet3).click().perform();
        TestUtil.sendKeys(feet3, "5", "feet enteerd");
        TestUtil.sendKeys(inch3, "4", "inch entered");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(Weight3, "50", "Wt entered");
        WebCommands.staticSleep(3000);
        TestUtil.click(education3,"");
        TestUtil.click(graduate,"Graduate select");
        DautherInsuredDetails();
        TestUtil.click(education4,"");
        TestUtil.click(graduate,"Graduate select");
        finalNomineeDetailswithoutMobileNumber();
        medicalHistoryQuestions();
        mailingAddress();
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        //js.executeScript("arguments[0].scrollIntoView();",zonedropdown);
       // TestUtil.click(zonedropdown,"");
        WebCommands.staticSleep(3000);
        //js.executeScript("arguments[0].scrollIntoView();",zone1);
        //TestUtil.click(zone1," Zone 1 selected");
        WebCommands.staticSleep(5000);
       // ChequepaymentDetails();
        //Documents();
        paymentDetails();
    }
    public void CheckoutCompairPlanshare() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        TestUtil.click(education, "Education Dropdown opened");
        TestUtil.click(graduate, "Graduate Selected");
        selfInsuredDetails();
        educationSelect();
        WebCommands.staticSleep(1000);
        spouseEducationSelect();
        spouseInsuredDetails();
        TestUtil.sendKeys(NomineeFullName3, "test test", "second time name entered");
        DOB3.sendKeys("12/02/1988");
        WebCommands.staticSleep(2000);
        act.moveToElement(feet3).click().perform();
        TestUtil.sendKeys(feet3, "5", "feet enteerd");
        TestUtil.sendKeys(inch3, "4", "inch entered");
        TestUtil.sendKeys(Weight3, "50", "Wt entered");
        TestUtil.click(maritalstatusdropdown,"");
        TestUtil.click(married,"married selected");
        TestUtil.click(education3,"");
        TestUtil.click(graduate,"Graduate select");
        DautherInsuredDetails();
        TestUtil.click(education4,"");
        TestUtil.click(graduate,"Graduate select");
        finalNomineeDetailswithoutMobileNumber();
        medicalHistoryQuestions();
        mailingAddress();
        WebCommands.staticSleep(3000);
//        TestUtil.getScreenShot();
//        js.executeScript("arguments[0].scrollIntoView();",zonedropdown);
//        // TestUtil.click(zonedropdown,"");
//        WebCommands.staticSleep(3000);
//        js.executeScript("arguments[0].scrollIntoView();",zone1);
//        //TestUtil.click(zone1," Zone 1 selected");
//        WebCommands.staticSleep(5000);
//        ChequepaymentDetails();
//        Documents();
    }
    public void CheckoutSuperTopup() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();
        SBIeducationSelect();
        finalNomineeDetailswithoutMobileNumber();
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void CheckoutDiabetesCitizen() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "ttttt0000t", "Pan Entered");
        selfInsuredDetails();
        finalNomineeDetailsDiabetes();
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void CheckoutSeniorCitizen() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();
        finalNomineeDetailswithoutMobilenDOB();
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void CheckoutMaternity() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        TestUtil.click(incomrsource, "source dropedown select");
        WebCommands.staticSleep(5000);
        TestUtil.click(salary, "salary");
        selfInsuredDetails();
        occupationSelectMaternity();
        finalNomineeDetailswithoutMobileNumber();
        medicalHistoryQuestions();
        maternityAddress();
        WebCommands.staticSleep(6000);
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void CheckoutPremium() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        TestUtil.click(incomrsource, "select income source");
        WebCommands.staticSleep(3000);
        TestUtil.click(salary, "salary");
        selfInsuredDetails();
        occupationSelectMaternity();
        spouseInsuredDetails();
        occupationSelectPremiumPlans();
        finalNomineeDetailswithoutMobileNumber();
        medicalHistoryQuestions();
        maternityAddress();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void CheckoutOnePlanFlow() {
        TestUtil.sendKeys(Address1, "adressAutomaation", "Adress line 1 entered");
        TestUtil.sendKeys(Address2, "adressAutomaation", "Adress line 2 entered");
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        occupationSelectOnePlan();
        educationSelect();
        selfInsuredDetails();
        WebCommands.staticSleep(4000);
        TestUtil.sendKeys(MobileNos, "6999912345", "Mobile No entered");
        //finalNomineeDetailswithAddress();
        finalNomineeDetails();
        medicalHistoryQuestions();
        //mailingAddress();
        WebCommands.staticSleep(3500);
        js.executeScript("window.scrollBy(0,-400)");
        checkmarks();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void CashlessCashlessFlow() {
        TestUtil.sendKeys(Address1, "adressAutomaation", "Adress line 1 entered");
        TestUtil.sendKeys(Address2, "adressAutomaation", "Adress line 2 entered");
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        educationSelect();
        occupationSelectOnePlan();
        selfInsuredDetails();
        TestUtil.sendKeys(MobileNos, "6999912345", "Mobile No entered");
        finalNomineeDetails();
        medicalHistoryQuestions();
        //mailingAddress();
        WebCommands.staticSleep(2000);
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        WebCommands.staticSleep(3000);
        checkmarks();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void Checkout_SuccessFlow() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();
        nomineeoccupation();
        finalNomineeDetails();
        medicalHistoryQuestions();
        mailingAddress();
        WebCommands.staticSleep(6000);
        paymentDetails();
        share_payment_link();
        do_payment("A");
       // RazorPaySuccesspayment();
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void CheckoutnivaBupaoneplan() {
        TestUtil.sendKeys(Address1, "adressAutomaation", "Adress line 1 entered");
        TestUtil.sendKeys(Address2, "adressAutomaation", "Adress line 2 entered");
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();
        occupationSelectOnePlan();
        educationSelect();
        TestUtil.sendKeys(MobileNos, "6999912345", "Mobile No entered");
        spouseInsuredDetails();
        WebCommands.staticSleep(4000);
        TestUtil.click(education2, "Education Dropdown opened");
        TestUtil.click(graduate, "Graduate Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(occupationdropdown2, "");
        TestUtil.click(HousewivesNiva, "Graduate Selected");
        TestUtil.sendKeys(MobileNoSpouse, "6999912345", "Mobile No entered");
       // finalNomineeDetailswithAddress();
        finalNomineeDetails();
        medicalHistoryQuestions();
        //mailingAddress();
        WebCommands.staticSleep(3500);
        js.executeScript("window.scrollBy(0,-400)");
        checkmarks();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }
    public void CheckoutnivaBupaoneplanSelfWifeChild() {

        TestUtil.sendKeys(Address1, "adressAutomaation", "Adress line 1 entered");
        TestUtil.sendKeys(Address2, "adressAutomaation", "Adress line 2 entered");
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();
        occupationSelectOnePlan();
        educationSelect();
        TestUtil.sendKeys(MobileNos, "6999912345", "Mobile No entered");
        spouseInsuredDetails();
        TestUtil.click(education2, "Education Dropdown opened");
        TestUtil.click(graduate, "Graduate Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(occupationdropdown2, "");
        TestUtil.click(HousewivesNiva, "Graduate Selected");
        TestUtil.sendKeys(MobileNoSpouse, "6999912345", "Mobile No entered");
        WebCommands.staticSleep(2000);
        SonInsuredDetailsNIva();
        TestUtil.click(occupationdropdown3, "");
        TestUtil.click(Salaried,"");
        //finalNomineeDetailswithAddress();
        finalNomineeDetails();
        medicalHistoryQuestions();
      //  mailingAddress();
        WebCommands.staticSleep(3500);
        js.executeScript("window.scrollBy(0,-400)");
        checkmarks();
        paymentDetails();
        TestUtil.getScreenShot();
     //   share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }
    public void CheckoutnivaBupaoneplanSelfWifeChildSecond() {
        TestUtil.sendKeys(Address1, "adressAutomaation", "Adress line 1 entered");
        TestUtil.sendKeys(Address2, "adressAutomaation", "Adress line 2 entered");
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();
        occupationSelectOnePlan();
        educationSelect();
        TestUtil.sendKeys(MobileNos, "6999912345", "Mobile No entered");
        spouseInsuredDetails();
        TestUtil.click(education2, "Education Dropdown opened");
        WebCommands.staticSleep(2000);
        TestUtil.click(graduate, "Graduate Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(occupationdropdown2, "");
        TestUtil.click(HousewivesNiva, "Graduate Selected");
        TestUtil.sendKeys(MobileNoSpouse, "6999912345", "Mobile No entered");
        SonInsuredDetailsNIva();
        TestUtil.click(maritalstatusdropdown,"");
        TestUtil.click(married,"married selected");
        TestUtil.sendKeys(MobileNoSon, "6999912345", "Mobile No entered");
       // finalNomineeDetailswithAddress();
        finalNomineeDetails();
        medicalHistoryQuestions();
        //mailingAddress();
        WebCommands.staticSleep(3500);
        js.executeScript("window.scrollBy(0,-400)");
        checkmarks();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }


    public void CheckoutAdityaoneplan() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();

        TestUtil.sendKeys(nomineenamedetailDiabetes, "auto test", "name entered");
        WebCommands.staticSleep(4000);
        TestUtil.click(nomineeisMyDiabetes, "Clicked on Drop Down");
        WebCommands.staticSleep(2000);
        TestUtil.click(mother, "mother clicked");
        TestUtil.sendKeys(nomineemobileNodetailsDiabetes, "6999912345", "");
        spouseInsuredDetails();
        TestUtil.sendKeys(nomineenamedetailDiabetes2, "auto test", "name entered");
        WebCommands.staticSleep(6000);
        TestUtil.click(adityanominee, "Clicked on Drop Down");
        WebCommands.staticSleep(4000);
        TestUtil.click(mother, "mother clicked");
        TestUtil.sendKeys(AdityaMobile, "6999912345", "");
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void CheckoutAdityaoneplanSelfSpouseChild() {
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();

        TestUtil.sendKeys(nomineenamedetailDiabetes, "auto test", "name entered");
        WebCommands.staticSleep(4000);
        TestUtil.click(nomineeisMyDiabetes, "Clicked on Drop Down");
        WebCommands.staticSleep(2000);
        TestUtil.click(mother, "mother clicked");
        TestUtil.sendKeys(nomineemobileNodetailsDiabetes, "6999912345", "");
        spouseInsuredDetails();
        TestUtil.sendKeys(nomineenamedetailDiabetes2, "auto test", "name entered");
        WebCommands.staticSleep(4000);
        TestUtil.click(adityanominee, "Clicked on Drop Down");
        WebCommands.staticSleep(2000);
        TestUtil.click(mother, "mother clicked");
        TestUtil.sendKeys(AdityaMobile, "6999912345", "");
        TestUtil.click(maritalstatusdropdown,"");
        TestUtil.click(married,"");
        SonInsuredDetailsAditya();
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
        TestUtil.getScreenShot();
        share_payment_link();
        do_payment("A");
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void StarCompOnePlanFlow(){
        commonContactDetails();
        TestUtil.click(Continue,"Continue");
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        TestUtil.click(incomrsource,"income drop down");
        WebCommands.staticSleep(4000);
        TestUtil.click(salary,"salary");
        selfInsuredDetails();
        WebCommands.staticSleep(3000);
        occupationSelectMaternity();
        occupationSelectPremiumPlans();
        spouseInsuredDetails();
        //occupationSelectPremiumPlans();
        //ICICfinalNomineeDetails();
        dobdetails.sendKeys("12/02/1988");
        TestUtil.click(nomineeisMy, "");
        TestUtil.click(mother, "mother clicked");
        // TestUtil.sendKeys(nomineemobileNodetails, "6999912345", "");
        TestUtil.sendKeys(nomineenamedetail, "auto test", "name entered");
        TestUtil.click(Continue, "continue");
        WebCommands.staticSleep(3000);



        medicalHistoryQuestions();
        maternityAddress();
        paymentDetails();
        share_payment_link();
        do_payment("A");
//        RazorPaySuccesspayment(Successclicked);
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void StarCompLandingPageFlow(){
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        TestUtil.click(incomrsource, "open incomedropdown");
        WebCommands.staticSleep(3000);
        TestUtil.click(salary,"select salary");
        selfInsuredDetails();
        occupationSelectMaternity();
        spouseInsuredDetails();
        occupationSelectPremiumPlans();

        TestUtil.click(occupationdropdown3,"Child Occupation");
        TestUtil.click(OccupationDaughter,"Daughter Studying");
        DaughterInsuredDetails();
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
//        TestUtil.click(occupationdropdown3,"Child Occupation");
//        TestUtil.click(OccupationDaughter,"Daughter Studying");
        ICICfinalNomineeDetails();
        medicalHistoryQuestions();
        maternityAddress();
        paymentDetails();
        share_payment_link();
        do_payment("A");
      //  RazorPaySuccesspayment(FailuareClicked);
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void HDFCOptimaOnePlanFlow(){
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();
        occupationSelectAccountant();
        spouseInsuredDetails();
        occupationSelectHDFC();
        finalNomineeDetailswithoutMobilenDOB();
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
        share_payment_link();
        do_payment("A");
        HDFCpayment();
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }

    public void HDFCLandingPagePlan(){
        commonContactDetails();
        TestUtil.sendKeys(OtherPanNo, "APMGR3451R", "Pan Entered");
        selfInsuredDetails();
        occupationSelectAccountant();
        spouseInsuredDetails();
        occupationSelectHDFC();
        TestUtil.click(occupationdropdown3,"Child Occupation");
        TestUtil.click(OccupationStudent,"Child Studying");
        DaughterInsuredDetails();
        finalNomineeDetailswithoutMobilenDOB();
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
        share_payment_link();
        do_payment("A");
        HDFCpayment();
        backtoMainWindow();
        WebCommands.staticSleep(2000);
    }



    public void Checkout_Dashboard() {
        commonContactDetails();
        TestUtil.sendKeys(PanNo, "ttttt0000t", "Pan Entered");
        selfInsuredDetails();
        occupationSelect();
        spouseInsuredDetails();
        spouseOccupationSelect();
        //DaughterInsuredDetails();

        finalNomineeDetails();
        medicalHistoryQuestions();
        mailingAddress();
        paymentDetails();
        share_payment_link();
        do_payment("A");
        //RazorPaySuccesspayment(Successclicked);
        backtoMainWindow();
        WebCommands.staticSleep(2000);

    }

}