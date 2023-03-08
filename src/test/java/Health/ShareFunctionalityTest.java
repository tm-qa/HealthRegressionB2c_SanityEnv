package Health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.health.HealthLandingPage;
import com.qa.turtlemint.pages.health.LeadNamePage;
import com.qa.turtlemint.pages.health.Profile_page;
import com.qa.turtlemint.pages.health.SharePlanPage;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;


@Listeners(iTestListener.class)
@Test(groups = {"ShareFunctionalityTest","entire_health"})
public class ShareFunctionalityTest extends TestBase {

    HealthLandingPage hlp;
    Profile_page Profilepage;
    LeadNamePage leadpage;
    SharePlanPage sp;
    TestUtil tl;

    public ShareFunctionalityTest() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        hlp = new HealthLandingPage();
        Profilepage = new Profile_page();
        tl = new TestUtil();
        leadpage = new LeadNamePage();
        sp = new SharePlanPage();
    }
    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void ShareVideoFromPDP() throws InterruptedException {
        Profilepage.Profile_page_Idividual_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        WebCommands.staticSleep(5000);
        sp.ShareVideoFromPDP();
        LogUtils.info("Share Result flow completed");
    }
    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void ShareHospitalFromPDP() throws InterruptedException {
        Profilepage.Profile_page_Idividual_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        WebCommands.staticSleep(5000);
        sp.ShareHospitalFromPDP();
        LogUtils.info("Share Result flow completed");
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void CheckPolicyDocumentsOnPDP() throws InterruptedException {
        WebCommands.staticSleep(4000);
        Profilepage.Profile_page_Idividual_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        WebCommands.staticSleep(5000);
        sp.CheckPolicyDocOnPDP();
        LogUtils.info("Share Result flow completed");
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}


