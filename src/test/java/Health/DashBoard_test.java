package Health;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.health.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(groups = {"DashBoard_test", "entire_health"})

public class DashBoard_test extends TestBase {

    public DashBoard_test() {
        super();
    }

    public String Name_for_dashboard;

    LoginPage Loginpage;
    GrowPageSellButton gp;
    HealthPage hp;
    HealthLandingPage hlp;
    Profile_page Profilepage;
    LeadNamePage leadpage;
    TestUtil tl;
    Dashboard dashboardpage;
    Checkout_Page checkoutpage;


    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        hp = new HealthPage();
        hlp = new HealthLandingPage();
        Profilepage = new Profile_page();
        tl = new TestUtil();
        leadpage = new LeadNamePage();
        dashboardpage = new Dashboard();
        checkoutpage = new Checkout_Page();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();
        hp.ValidateHealthClick();
    }

    @Test(enabled = true)
    public void Dashboard() throws InterruptedException {
        hlp.HealthInsuranceClick();
        Profilepage.Profile_page_Floater_Normal();
        Name_for_dashboard = tl.NameGenerator();
        leadpage.SaveLead(Name_for_dashboard);

        System.out.println(Name_for_dashboard+"Outside Dashboard");
        WebCommands.staticSleep(5000);
        dashboardpage.dashboard(Name_for_dashboard);
        checkoutpage.Checkout_Dashboard();
        WebCommands.staticSleep(5000);

    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}