import org.testng.Assert;
import uiTests.BaseTest;
import uiTests.DevPortalScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DevPortal extends BaseTest {

    @Test
    public void userSignIn() throws Exception {
        pom.portalScreen.getToHomePage();
        pom.portalScreen.submitAccountInfo();
        String accountTitle = pom.portalHome.accountName();
        Assert.assertEquals(accountTitle, "Aleksei");
    }
}
