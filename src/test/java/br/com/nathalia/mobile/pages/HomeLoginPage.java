package br.com.nathalia.mobile.pages;

import br.com.nathalia.mobile.base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.android.AndroidDriver;

public class HomeLoginPage extends BasePage {

    public HomeLoginPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Acesse sua conta")
    private MobileElement acessarConta;

    public void clicarAcessarConta() {
        acessarConta.click();
    }
}