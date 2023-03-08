package com.qa.turtlemint.pages.health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_page extends TestBase {
    public Profile_page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@data-auto=\"male\"]")
    WebElement GenderButton;

    @FindBy(xpath = "//label[@data-auto=\"male\"]")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@data-auto=\"female\"]")
    WebElement Femaleselected;

    @FindBy(xpath = "//label[@for='members0']")
    WebElement SelfTick;

    @FindBy(xpath = "//label[@for='members1']")
    WebElement WifeTick;

    @FindBy(xpath = "//label[@for='members2']")
    WebElement MotherTick;

    @FindBy(xpath = "//label[@for=\"members3\"]")
    WebElement FatherTick;

    @FindBy(xpath = "//label[@for='members4']")
    WebElement SonTick;

    @FindBy(xpath = "//label[@for='members5']")
    WebElement DautherTick;

    @FindBy(xpath = "//div[text()='Next']")
    WebElement NextButton;

    @FindBy(xpath = "//div[text()=' Next']")
    WebElement NextButtonforAge;

    @FindBy(xpath = "//div[@class=\"dropdown\"]//button[text()=' Select age ']")
    WebElement SelfAgeDD;

    @FindBy(xpath = "//div[@class=\"dropdown open\"]//input")
    WebElement SearchAge;

    @FindBy(xpath = "//div[text()='Daughter 1']//parent::div//input[@placeholder=\"Search\"]")
    WebElement SearchAgeDauther;

    @FindBy(xpath = "//input[@data-auto=\"searchage-daughter\"]//parent::li//parent::ul//a")
    WebElement AgeSelectedDauther;

    @FindBy(xpath = "//div[@class='dropdown open']//a")
    WebElement AgeSelected;

    @FindBy(xpath = "(//button[@data-auto='SelectAge-2'])[1]")
    WebElement MotherAgeDD;

    @FindBy(xpath = "//div[@class='btn nextBtn green']")
    WebElement NextButton1;

    @FindBy(xpath = "//label[@data-auto=\"pedYes\"]")
    WebElement YesClick;

    @FindBy(xpath = "(//label[@class='col-xs-12 radio dividerRadio'])[1]")
    WebElement DiseaseButton;

    @FindBy(xpath = "//div[@class='btn nextBtn green']")
    WebElement NextButton2;

    @FindBy(xpath = "//button[text()=' No disease ']")
    WebElement diseasedrop;

    @FindBy(xpath = "//label[text()=' Blood pressure ']")
    WebElement BP_Select;

    @FindBy(xpath = "//button[text()='Done']")
    WebElement Done;

    @FindBy(xpath = "//button[@class='btn green full']")
    WebElement DiseaseSelectionDone;

    @FindBy(xpath = "//div[@class='btn nextBtn green']")
    WebElement NextButton3;

    @FindBy(xpath = "//input[@data-auto=\"pincode\"]")
    WebElement EnterMyPin;

    @FindBy(xpath = "//div[@class='btn nextBtn green']")
    WebElement NextButton4;

    @FindBy(xpath = "//div[@class='btn nextBtn green ng-binding']")
    WebElement NextButton5;

    @FindBy(xpath = "//div[text()='Skip']")
    WebElement SkipButton;


    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement EnterNameTab;

    @FindBy(xpath = "//div[@class='btn nextBtn green']")
    WebElement NextButton6;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
            WebCommands.staticSleep(1000);
            TestUtil.click(NextButton, "Next button clicked");
        } else
            TestUtil.click(Femaleselected, "Female Gender Selected");
        WebCommands.staticSleep(1000);
    }

    public void SelectAge(String age) {

        TestUtil.click(SelfAgeDD, "Clicked on Select age Button");
        TestUtil.sendKeys(SearchAge, age, age + " Entered");
        TestUtil.click(AgeSelected, age + " Age Selected");
    }

    public void SelectDauther(String age) {

        TestUtil.click(SelfAgeDD, "Clicked on Select age Button");
        WebCommands.staticSleep(5000);

    //    js.executeScript("arguments[0].click();", SelfAgeDD);
        TestUtil.sendKeys(SearchAgeDauther, age, age + " Entered");
        TestUtil.click(AgeSelectedDauther, age + " Age Selected");
    }

    public void SelfMemberSelect() {
        TestUtil.click(SelfTick, "Clicked on Self Button");
        TestUtil.click(NextButton, "Clicked on next Button");
    }

    public void Self_wife() {
        TestUtil.click(SelfTick, "Clicked on Self Button");
        TestUtil.click(WifeTick, "Clicked on wife Button");
        TestUtil.click(NextButton, "Clicked on next Button");
    }

    public void Self_Wife_Child() {
        TestUtil.click(SelfTick, "Clicked on Self Button");
        TestUtil.click(WifeTick, "Clicked on wife Button");
        TestUtil.click(SonTick, "Clicked on Child");
        TestUtil.click(NextButton, "Clicked on next Button");
    }
    public void Self_Mother_Father() {
        TestUtil.click(SelfTick, "Clicked on Self Button");
        TestUtil.click(MotherTick, "Clicked on Mother");
        TestUtil.click(FatherTick,"Cliked on Father");
        TestUtil.click(NextButton, "Clicked on next Button");
    }

    public void Self_Wife_Mother_Daughter() {
        TestUtil.click(SelfTick, "Clicked on Self Button");
        TestUtil.click(WifeTick, "Clicked on wife Button");
        TestUtil.click(SonTick, "Clicked on Mother");
        TestUtil.click(DautherTick, "Clicked on Daughter");
        TestUtil.click(NextButton, "Clicked on next Button");
    }

    public void PlanningChild() {
        TestUtil.click(NextButton, "planning child NO and Clicked on next Button");
    }

    public void NextButtonforAge() {
        TestUtil.click(NextButtonforAge, "Clicked on next Button");
    }

    public void DiseaseSelection(String Disease, WebElement selectDisease) {
        if (Disease == "Yes") {
            TestUtil.click(YesClick, "Yes clicked");
            TestUtil.click(diseasedrop, "Dropdown of Disease");
            TestUtil.click(selectDisease, "Blood pressure Selected");
            TestUtil.click(Done, "done clicked");
            TestUtil.click(NextButton, "Clicked on next Button");
        } else
            TestUtil.click(NextButton, "Clicked on next Button");
    }

    public void MyPincode(String pincode) {
        TestUtil.sendKeys(EnterMyPin, pincode, "Pincode Entered ");
        TestUtil.click(NextButton, "Clicked on next Button");
        TestUtil.click(SkipButton, "Your preffered Hospitals Skip");
        WebCommands.staticSleep(1000);
        TestUtil.click(SkipButton, "your income bracket Skipped");
    }
    public void MyPincode2(String pincode) {
        TestUtil.sendKeys(EnterMyPin, pincode, "Pincode Entered ");
        TestUtil.click(NextButton, "Clicked on next Button");
        TestUtil.click(SkipButton, "Your preffered Hospitals Skip");
    }

    public void Profile_page_Floater_Normal() {
        GenderButtonClick("male");
        Self_wife();
        SelectAge("25");
        SelectAge("24");
        NextButtonforAge();
        PlanningChild();
        DiseaseSelection("no",BP_Select);
        MyPincode("110090");
        LogUtils.info("Profile Page Complete For Floater_Normal");
    }

    public void Profile_page_Idividual_Normal() {
        GenderButtonClick("male");
        SelfMemberSelect();
        SelectAge("40");
        NextButtonforAge();
        DiseaseSelection("Yes",BP_Select);
        MyPincode("600024");
        LogUtils.info("Profile Page Complete For Idividual_Normal");
    }
    public void SuccessProfile_page_Normal() {
        GenderButtonClick("male");
        SelfMemberSelect();
        SelectAge("28");
        NextButtonforAge();
        DiseaseSelection("No",BP_Select);
        MyPincode("400000");
        LogUtils.info("Profile Page Complete For Success flow");
    }

    public void Profile_page_Multi_Individual() {
        GenderButtonClick("male");
        Self_wife();
        SelectAge("27");
        SelectAge("25");
        NextButtonforAge();
        PlanningChild();
        DiseaseSelection("No",BP_Select);
        MyPincode("400605");
        LogUtils.info("Profile Page Complete For Idividual_Normal");
    }

    public void Profile_page_Super_Topup() {
        GenderButtonClick("Female");
        SelfMemberSelect();
        SelectAge("30");
        NextButtonforAge();
        PlanningChild();
        DiseaseSelection("No",BP_Select);
        MyPincode("445215");
        WebCommands.staticSleep(2000);
        TestUtil.click(SkipButton,"skip cliked");
        LogUtils.info("Profile Page Complete For Super Top-up");
    }
    public void Profile_page_Compare_Page() {
        GenderButtonClick("Female");
        Self_Wife_Mother_Daughter();
        SelectAge("54");
        SelectAge("52");
        SelectAge("21");
        SelectDauther("4");
        NextButtonforAge();
        PlanningChild();
        DiseaseSelection("No",BP_Select);
        MyPincode("412206");
        LogUtils.info("Profile Page Complete For Compare Page");
    }
    public void Profile_page_Diabities() {
        GenderButtonClick("male");
        SelfMemberSelect();
        SelectAge("46");
        NextButtonforAge();
        DiseaseSelection("No",BP_Select);
        MyPincode2("400002");
        LogUtils.info("Profile Page Complete For Diabities");
    }

    public void Senior_citizens(){
        GenderButtonClick("male");
        SelfMemberSelect();
        SelectAge("67");
        NextButtonforAge();
        DiseaseSelection("No",BP_Select);
        MyPincode2("700001");
        LogUtils.info("Profile Page Complete For Senior citizens");
    }
    public void Maternity_Cover(){
        GenderButtonClick("Female");
        SelfMemberSelect();
        SelectAge("30");
        NextButtonforAge();
        PlanningChild();
        DiseaseSelection("No",BP_Select);
        MyPincode2("400018");
    }
    public void Premium_Plans(){
        GenderButtonClick("male");
        Self_wife();
        SelectAge("29");
        SelectAge("30");
        NextButtonforAge();
        PlanningChild();
        DiseaseSelection("No",BP_Select);
        MyPincode2("222002");
    }
    public void One_plan_Flow(){
        GenderButtonClick("male");
        SelfMemberSelect();
        SelectAge("27");
        NextButtonforAge();
        DiseaseSelection("No",BP_Select);
        MyPincode2("400605");
    }

    public void Cashless_Hospital(){
        GenderButtonClick("male");
        SelfMemberSelect();
        SelectAge("35");
        NextButtonforAge();
        DiseaseSelection("No",BP_Select);
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton,"next buttton click");
        TestUtil.click(NextButton,"Next Again to reach LEad Name Page");
        TestUtil.click(SkipButton,"Skipped Salary Bracket");
    }


    public void One_plan_Flow_SelfWife(String pincode){
        GenderButtonClick("male");
        Self_wife();
        SelectAge("25");
        SelectAge("25");
        NextButtonforAge();
        DiseaseSelection("No",BP_Select);
        MyPincode2(pincode);
    }
    public void ProfileFlow_SelfWifeChild(String pincode){
        GenderButtonClick("male");
        Self_Wife_Child();
        SelectAge("36");
        SelectAge("26");
        SelectAge("5");
        NextButtonforAge();
        PlanningChild();
        DiseaseSelection("No",BP_Select);
        MyPincode(pincode);
    }
    public void SecondProfileFlow_SelfWifeChild(String pincode){
        GenderButtonClick("male");
        Self_Wife_Child();
        SelectAge("45");
        SelectAge("45");
        SelectAge("20");
        NextButtonforAge();
        PlanningChild();
        DiseaseSelection("Yes",BP_Select);
        MyPincode(pincode);
    }
}
