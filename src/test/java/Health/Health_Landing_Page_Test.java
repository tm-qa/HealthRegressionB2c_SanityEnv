package Health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.health.HealthLandingPage;
import com.qa.turtlemint.pages.health.HealthPage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"Health_Landing_Page_Test","entire_health"})
public class Health_Landing_Page_Test extends TestBase {
    public Health_Landing_Page_Test() {
        super();
    }
    HealthLandingPage hlp;

    @BeforeMethod()
    public void start() {
        initialization();
        hlp = new HealthLandingPage();
    }

    @Test(enabled = true)
    public void Health_Insurer() throws InterruptedException {
        hlp.VerticalSelection();
        //hlp.BuyNewPolicy();
    }

    @Test(enabled = true)
    public void BecomePosp()
    {
        hlp.posp();
    }

    @Test(enabled = true)
    public void JoinPosp()
    {
        hlp.Joinposp();
    }

    @Test(enabled = true)
    public void SpeakToAdvisor()
    {
        hlp.contactTMAdvisor();
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}