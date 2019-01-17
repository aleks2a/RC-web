package uiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PortalHomeScreen {
    WebDriver driver;
    WebDriverWait wait;

    By accountTitle = By.cssSelector("div.header-account-user-name");

    public PortalHomeScreen(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public String accountName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountTitle));
        return driver.findElement(accountTitle).getText();
    }



}
