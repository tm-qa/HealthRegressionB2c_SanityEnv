package Ninja;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Ninja.BranchIssuanceHealth;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.health.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BranchIssuanceTest extends TestBase {
    public BranchIssuanceTest() {
        super();
    }

    ninja ninjapage;
    BranchIssuanceHealth nbi;

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        ninjapage = new ninja();
        nbi = new BranchIssuanceHealth();

        ninjapage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
    }

    @Test(enabled = true)
    public void Direct_Issuance_Flow() throws InterruptedException {
        nbi.NinjaBranchIssuanceFlow();
    }

}