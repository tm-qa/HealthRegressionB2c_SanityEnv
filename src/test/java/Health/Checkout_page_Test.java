package Health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.health.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"Checkout_page_Test","entire_health"})
public class Checkout_page_Test extends TestBase {
    public Checkout_page_Test() {
        super();
    }
    HealthLandingPage hlp;
    Profile_page Profilepage;
    LeadNamePage leadpage;
    TestUtil tl;
    Checkout_Page checkoutPage;
    ResultPage resultPage;
    ninja ninjapage;
    SharePlanPage sp;

    @BeforeMethod()
    public void start()
    {
        initialization();
        hlp = new HealthLandingPage();
        Profilepage = new Profile_page();
        tl = new TestUtil();
        leadpage = new LeadNamePage();
        checkoutPage = new Checkout_Page();
        sp = new SharePlanPage();
        resultPage = new ResultPage();
        ninjapage = new ninja();
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void Floater_NormalFlow_For_GoDigit() throws InterruptedException {
        Profilepage.Profile_page_Floater_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        WebCommands.staticSleep(10000);
        WebCommands.staticSleep(5000);
        resultPage.coverAmountdigit();
        resultPage.selectInsuer("Go Digit");
        checkoutPage.CheckoutFloater_Normal();
        LogUtils.info("Checkout flow completed");
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void Individual_Normal_Flow_For_ICICI() throws Exception {
        Profilepage.Profile_page_Idividual_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        resultPage.whyIsThisPlanBestForYou();
        WebCommands.staticSleep(5000);
        resultPage.selectInsuerforICICI("ICICI Lombard");
        checkoutPage.Checkout_individual_Normal();
        LogUtils.info("Checkout flow completed");
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void Multi_Individual_Flow_For_ManipalCigna() throws Exception {
        Profilepage.Profile_page_Multi_Individual();
        leadpage.SaveLead(tl.NameGenerator());
        WebCommands.staticSleep(5000);
        resultPage.multiIndividual();
        System.out.println("hdjghfg");
        resultPage.selectInsuermulti("Manipal Cigna Health Insurance");
        checkoutPage.CheckoutMultiIndividual();
        LogUtils.info("Checkout flow completed");
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void Compare_Page() throws InterruptedException {
        Profilepage.Profile_page_Compare_Page();
        leadpage.SaveLead(tl.NameGenerator());
        resultPage.comparePlan();
        checkoutPage.CheckoutCompairPlan();
        LogUtils.info("Checkout flow completed");
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}