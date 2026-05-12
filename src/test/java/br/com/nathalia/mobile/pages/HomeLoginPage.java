package br.com.nathalia.mobile.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeLoginPage {

    private AndroidDriver driver;

    public HomeLoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clicarAcessarConta() {

        WebDriverWait wait = new WebDriverWait(driver, 15);

        for (int i = 0; i < 2; i++) {
            try {
                wait.until(
                        ExpectedConditions.elementToBeClickable(
                                MobileBy.AccessibilityId("Acesse sua conta")
                        )
                );
                driver.findElement(
                        MobileBy.AccessibilityId("Acesse sua conta")
                ).click();
                break;
            } catch (StaleElementReferenceException e) {
                // tenta de novo
            }
        }
    }
}