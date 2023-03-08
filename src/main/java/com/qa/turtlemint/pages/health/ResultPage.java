package com.qa.turtlemint.pages.health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.qa.turtlemint.base.TestBase.driver;
import static com.qa.turtlemint.util.TestUtil.clickElementFromList;
import static com.qa.turtlemint.util.TestUtil.scroll;

public class ResultPage extends TestBase {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String getUrl;
    public String orderID;

    @FindBy(xpath = "(//*[text()=' Check Activity Points '])[1]")
    WebElement checkActivityPoints;

    @FindBy(xpath = "//button[text()='×']")
    WebElement closeActivityPointsPopUp;

    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement GotItBtn;

    @FindBy(xpath = "//*[@id=\"filterInsurer\"]")
    WebElement selectInsuer;

    @FindBy(xpath = "//*[@id=\"filterCover\"]")
    WebElement selectCover;

    @FindBy(xpath = "//button[@id='filterInsurer']/following-sibling::ul/li/label")
    List<WebElement> insuranceList;

    @FindBy(xpath = "(//*[text()='10 '])[1]")
    WebElement CoverAmount10lakh;

    @FindBy(xpath = "(//*[text()='5 '])[1]")
    WebElement CoverAmount5lakh;

    @FindBy(xpath = "//button[text()='View Details']")
    WebElement viewdetails;



    @FindBy(xpath = "//button[starts-with(@id,'CTA_D')]")
    List<WebElement> viewDetails;

    @FindBy(xpath = "//*[@id=\"resultPage\"]/div[4]/div[2]/div[2]/div[1]/div/p")
    WebElement randomClick;

    @FindBy(id = "proceed-btn")
    WebElement buyNowButton;

    @FindBy(xpath = "(//*[text()=' Why is this the best plan for you ? '])[1]")
    WebElement whyIsThisPlanBestForYou;

    @FindBy(xpath = "//div[text()='Also, the waiting period for specific diseases is 24 months only ']")
    WebElement text;

    @FindBy(id = "CTA_IHBP")
    WebElement veiwD;

    @FindBy(id = "filterType_of Policy")
    WebElement typeOfPolicy;

    @FindBy(xpath = "//*[text()='Multi-Individual ']")
    WebElement multiIndividual;

    @FindBy(id = "CTA_CTPHPS")
    WebElement veiwm;

    @FindBy(id = "CTA_SBATU")
    WebElement veiwS;

    @FindBy(id = "CTA_RCNS")
    WebElement veiwSc;

    @FindBy(xpath = "//*[@id=\"filterCover\"]")
    WebElement coverAmount;

    @FindBy(id="CTA_FGHTVP")
    WebElement fggi;

    @FindBy(id = "CTA_SYIG")
    WebElement veiwYoungstar;

    @FindBy(id = "CTA_SC")
    WebElement veiw2;

    @FindBy(xpath = "(//*[text()='10 '])[1]")
    WebElement lakh;

    @FindBy(xpath = "(//*[text()=\"Parents\"])[1]")
    WebElement parent;

    @FindBy(id = "CTA_MXBPRA")
    WebElement veiwone;

    @FindBy(id = "CTA_MXBPRASF")
    WebElement veiwori;

    @FindBy(id = "filterBenefits")
    WebElement benefits;

    @FindBy(xpath = "//button[@id='filterBenefits']/following-sibling::ul/li/label")
    List<WebElement> benefitslist;

    @FindBy(xpath = "//button[@id='filterSort_by']")
    WebElement sortbyfilter;

    @FindBy(xpath = "//a[normalize-space()='Price (low to high)']")
    WebElement lowtohigh;

    @FindBy(xpath = "//label[@id='labelForOHFF']")
    WebElement orientalcompare;

    @FindBy(xpath = "//label[@id='labelForRCF']")
    WebElement carecompare;

//    @FindBy(xpath = "//label[@id='labelForCTPHAE']")
//    WebElement caremanipal;

    @FindBy(xpath = "//label[@id='labelForCTPHPS']")
    WebElement caremanipal;


    @FindBy(xpath = "//span[normalize-space()='Compare']")
    WebElement comparebutton;

//    @FindBy(xpath = "//button[@id='CTA_CTPHAE']")
//    WebElement buymanipal;

    @FindBy(xpath = "//button[@id='CTA_CTPHPS']")
    WebElement buymanipal;

    @FindBy(xpath = "//button[@id='CTA_ABHPEN']")
    WebElement viewdetaildiabetes;

    @FindBy(xpath = "//span[text()='Downloads ']")
    WebElement downloaddropdown;

    @FindBy(xpath = "//span[text()='policy brochure']")
    WebElement downloadpolicybrochure;

    @FindBy(xpath = "//span[text()='policy wording']")
    WebElement downloadpolicywording;


    public void gotIT() throws InterruptedException {
       // TestUtil.click(GotItBtn, "Got It Clicked !");
        getUniqueID();
        WebCommands.staticSleep(8000);
        TestUtil.getScreenShot();

    }

    public String getUniqueID() throws InterruptedException {
        getUrl = driver.getCurrentUrl();
        System.out.println(getUrl);
        String[] result = getUrl.split("results/");
        System.out.println("Order ID = " + result[1]);
        orderID = result[1];
        String[] final_result = orderID.split("/");
        orderID = final_result[0];
        System.out.println("Order ID = " + orderID);
        WebCommands.staticSleep(2000);
        return orderID;
    }

    public void setCheckActivityPoints() {
        TestUtil.click(checkActivityPoints, "check activity point");
        closeActivityPointsPopUp.click();
    }

    public void selectInsuer(String insuranceValu) {
        scroll(selectInsuer, "-500");
        TestUtil.click(selectInsuer, "click on select Insuer");
        WebCommands.staticSleep(5000);
        TestUtil.selectValueFromDropDown(insuranceList, insuranceValu);
        TestUtil.click(randomClick, "click on select Insuer");
        clickElementFromList(viewDetails);
        TestUtil.click(buyNowButton, "veiw detais");
    }

    public void whyIsThisPlanBestForYou() {

        TestUtil.click(whyIsThisPlanBestForYou, "click on why Is This Plan Best For You ");
        String availabilityOfText = text.getText();
        System.out.println(availabilityOfText);
    }
    public void successResultPage() {

        TestUtil.click(fggi, "click on fggi ");
        WebCommands.staticSleep(3000);
        TestUtil.click(buyNowButton,"buy button click");

    }

    public void selectInsuerforICICI(String insuranceValu) {

        scroll(selectInsuer, "-500");

        TestUtil.click(selectInsuer, "click on select Insuer");

        TestUtil.selectValueFromDropDown(insuranceList, insuranceValu);

        TestUtil.click(randomClick, "click on select Insuer");
        WebCommands.staticSleep(3000);

        TestUtil.click(veiwD, "view");

        TestUtil.click(buyNowButton, "veiw detais");
    }

    public void multiIndividual() {

        TestUtil.click(typeOfPolicy, "click on why Is This Plan Best For You ");
        TestUtil.click(multiIndividual, "click on why Is This Plan Best For You ");
    }

    public void selectInsuermulti(String insuranceValu) {

        WebCommands.staticSleep(10000);
        TestUtil.click(selectInsuer, "click on select Insuer");
        WebCommands.staticSleep(5000);
        TestUtil.selectValueFromDropDown(insuranceList, insuranceValu);
        TestUtil.click(randomClick, "click on select Insuer");
        WebCommands.staticSleep(7000);
//        clickElementFromList(veiwm);
        TestUtil.click(veiwm, "click on select Insuer");
        TestUtil.click(buyNowButton, "veiw detais");
    }

    public void selectInsuerSuper(String insuranceValu) {
        WebCommands.staticSleep(5000);
        TestUtil.click(selectInsuer, "click on select Insuer");
        WebCommands.staticSleep(5000);
        TestUtil.selectValueFromDropDown(insuranceList, insuranceValu);
        TestUtil.click(randomClick, "click on select Insuer");
        TestUtil.click(veiwS, "click on select Insuer");
        TestUtil.click(buyNowButton, "veiw detais");
    }

    public void coverAmount() {

        TestUtil.click(coverAmount, "amount");
        TestUtil.click(lakh, "amount");
        System.out.println("wedfwe");
        TestUtil.click(veiwSc, "click on select Insuer");
        TestUtil.click(buyNowButton, "veiw detais");
        WebCommands.staticSleep(5000);
    }


    public void maternity() {
        WebCommands.staticSleep(3000);
        //  TestUtil.click(veiw1, "click on select Insuer");
        TestUtil.click(veiwYoungstar, "click on select Insuer");
        TestUtil.click(buyNowButton, "veiw detais");
    }

    public void premium_Plans() {

        TestUtil.click(veiw2, "click on select Insuer");
        TestUtil.click(buyNowButton, "veiw detais");
    }

    public void onePlanFow() {
        //  TestUtil.click(parent, "click on select Insuer");
        TestUtil.click(veiwone, "click on select Insuer");
        TestUtil.click(buyNowButton, "veiw detais");
    }

    public void benefits() {
        TestUtil.click(benefits, "click on select Insuer");
        TestUtil.selectValueFromDropDown(benefitslist, "Treatment at home");
        TestUtil.click(selectInsuer, "click on select Insuer");
        WebCommands.staticSleep(5000);
        TestUtil.selectValueFromDropDown(insuranceList, "Niva Bupa Health Insurance");
        TestUtil.click(veiwori, "click on select Insuer");
        TestUtil.click(buyNowButton, "veiw detais");
    }

    public void comparePlan() {
        TestUtil.click(sortbyfilter, "Clicked on sort by filter");
        TestUtil.click(lowtohigh, "Selected low to high");
        WebCommands.staticSleep(5000);
        TestUtil.click(caremanipal,"Future compair clicked");
        TestUtil.click(orientalcompare, "Selected oriental plan to compare");
        TestUtil.click(carecompare, "Selected care plan to compare");
        TestUtil.click(comparebutton, "Clicked on compare plan button");
        WebCommands.staticSleep(2000);
        TestUtil.click(buymanipal, "Clicked on oriental plan buy now");
    }

    public void diabetesPatients() {
        TestUtil.click(viewdetaildiabetes, "Clicked on View details on Result Page");
        TestUtil.click(downloaddropdown, "Clicked on download dropdown");
        TestUtil.click(downloadpolicybrochure, "Clicked on download policy brochure");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it = TabSwitch.iterator();
        String p = it.next();
        String c = it.next();

        driver.switchTo().window(c);
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
        TestUtil.click(downloadpolicywording, "Clicked on download policy wording");
        driver.switchTo().window(c);
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);

        TestUtil.click(buyNowButton, "Clicked on Buy Now");
    }

    public void coveramount(String coveramount){
        TestUtil.click(selectCover,"dropdown select");
        driver.findElement(By.xpath("(//*[text()='"+coveramount+" '])[1]")).click();
    }
    public void BuynowOneplan(){
        TestUtil.click(viewdetails,"view details clicked");
        TestUtil.click(buyNowButton, "Clicked on Buy Now");
    }

    public void Buynowself_wife_child(String planSelect){
        WebCommands.staticSleep(4000);
        driver.findElement(By.xpath("//span[text()=' "+planSelect+"']//parent::span//parent::div//parent::div//div//button")).click();

        TestUtil.getScreenShot();
//        Star Health Comprehensive

        TestUtil.click(buyNowButton, "Clicked on Buy Now");
    }
    public void onePlanFowselfWife() {
        //  TestUtil.click(parent, "click on select Insuer");
        TestUtil.click(veiwone, "click on select Insuer");
        TestUtil.click(buyNowButton, "veiw detais");
    }
    public void coverAmountdigit() {

        TestUtil.click(coverAmount, "amount");
        TestUtil.click(lakh, "amount");
        System.out.println("wedfwe");
//        TestUtil.click(veiwSc, "click on select Insuer");
//        TestUtil.click(buyNowButton, "veiw detais");
        WebCommands.staticSleep(5000);
    }
}