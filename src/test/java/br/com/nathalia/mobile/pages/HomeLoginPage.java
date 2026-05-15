package br.com.nathalia.mobile.pages;

import br.com.nathalia.mobile.base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeLoginPage extends BasePage {

    public HomeLoginPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Acesse sua conta")
    private MobileElement acessarConta;

    public void clicarAcessarConta() {

        System.out.println("➡️ [ACTION] Aguardando botão 'Acesse sua conta'");

        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.elementToBeClickable(acessarConta));

        System.out.println("➡️ [ACTION] Clicando em 'Acesse sua conta'");
        acessarConta.click();
    }
}