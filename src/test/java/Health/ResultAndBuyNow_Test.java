package Health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
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
@Test(groups = {"ResultAndBuyNow_Test","entire_health"})
public class ResultAndBuyNow_Test extends TestBase {

    ResultPage resultPage;
    HealthLandingPage hlp;
    Profile_page Profilepage;
    LeadNamePage leadpage;
    TestUtil tl;

    @BeforeMethod()
    public void start() {
        initialization();
        hlp = new HealthLandingPage();
        Profilepage = new Profile_page();
        tl = new TestUtil();
        leadpage = new LeadNamePage();
        resultPage = new ResultPage();
    }

    @Test(retryAnalyzer= RetryAnalyser.class)
    public void resultPageForFloaterNormal() throws InterruptedException {
        Profilepage.Profile_page_Floater_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        WebCommands.staticSleep(5000);
        resultPage.selectInsuer("Go Digit");
        LogUtils.info("Result page flow completed");
    }

    @Test(retryAnalyzer= RetryAnalyser.class)
    public void resultPageForIndividual_Normal() throws InterruptedException {
        Profilepage.Profile_page_Idividual_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        resultPage.whyIsThisPlanBestForYou();
        WebCommands.staticSleep(5000);
        resultPage.selectInsuerforICICI("ICICI Lombard");
        LogUtils.info("Result page flow completed");
    }

    @Test(retryAnalyzer= RetryAnalyser.class)
    public void resultPageForMulti_Individual() throws InterruptedException {
        Profilepage.Profile_page_Multi_Individual();
        leadpage.SaveLead(tl.NameGenerator());
        resultPage.multiIndividual();
        resultPage.selectInsuermulti("Manipal Cigna Health Insurance");
        LogUtils.info("Result page flow completed");
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void resultPageForComparePlan() throws InterruptedException {
        Profilepage.Profile_page_Compare_Page();
        leadpage.SaveLead(tl.NameGenerator());
        resultPage.comparePlan();
        LogUtils.info("Result page flow completed");
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}