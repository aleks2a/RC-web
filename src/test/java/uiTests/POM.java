package uiTests;

import org.openqa.selenium.WebDriver;

public class POM {

    public DevPortalScreen portalScreen;
    public PortalHomeScreen portalHome;

    public POM(WebDriver driver) {
        portalScreen = new DevPortalScreen(driver);
        portalHome = new PortalHomeScreen(driver);
    }



}
