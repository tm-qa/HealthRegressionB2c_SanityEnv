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
@Test(groups = {"Profile_page_test","entire_health"})
public class Profile_page_test extends TestBase {
    public Profile_page_test() {
        super();
    }
    HealthLandingPage hlp;
    Profile_page Profilepage;
    LeadNamePage leadpage;
    TestUtil tl;

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        hlp = new HealthLandingPage();
        Profilepage = new Profile_page();
        tl = new TestUtil();
        leadpage = new LeadNamePage();
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void Floater_Normal() throws InterruptedException {
        Profilepage.Profile_page_Floater_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        LogUtils.info("Profile Page Complete For Floater_Normal");
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void Individual_Normal() throws InterruptedException {
        Profilepage.Profile_page_Idividual_Normal();
        leadpage.SaveLead(tl.NameGenerator());
        LogUtils.info("Profile Page Complete For Idividual_Normal");
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void Multi_Individual() throws InterruptedException {
        Profilepage.Profile_page_Multi_Individual();
        leadpage.SaveLead(tl.NameGenerator());
        LogUtils.info("Profile Page Complete For Multi_Individual");
    }

    @Test(enabled = true,retryAnalyzer= RetryAnalyser.class)
    public void Compare_Page() throws InterruptedException {
        Profilepage.Profile_page_Compare_Page();
        leadpage.SaveLead(tl.NameGenerator());
        LogUtils.info("Profile Page Complete For Compare_Page");

    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}