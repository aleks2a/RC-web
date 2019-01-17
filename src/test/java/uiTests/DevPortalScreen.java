package uiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevPortalScreen {

    WebDriver driver;

    public DevPortalScreen(WebDriver driver) {
        this.driver = driver;
    }

    String defaultURL = "https://developer.ringcentral.com/";
    By signInButton = By.cssSelector("a.button.button-orange.header-sign-in-up-btn");
    By signIn = By.xpath("//span[text()='Sign in']");
    By accountField = By.id("credential");
    By nextButton = By.cssSelector("button.btn.btn-primary.btn-block");
    By passwordField = By.id("password");
    By confirmCredentials = By.cssSelector("button.btn.btn-primary");


    public void getToHomePage() {

        driver.get(defaultURL);
    }

    public void submitAccountInfo() {
        driver.findElement(signInButton).click();
        driver.findElement(signIn).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountField));
        driver.findElement(accountField).sendKeys("+13133982768");
        driver.findElement(nextButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys("BSRz6JtFEELhV8S");
        driver.findElement(confirmCredentials).click();
    }

}
