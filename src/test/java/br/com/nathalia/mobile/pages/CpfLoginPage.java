package br.com.nathalia.mobile.pages;

import br.com.nathalia.mobile.base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class CpfLoginPage extends BasePage {

    public CpfLoginPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Acessar")
    private MobileElement botaoAcessar;

    public void digitarCpf(String cpf) {

        System.out.println("➡️ [ACTION] Posicionando no campo CPF");

        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth() / 2;
        int y = (int) (size.getHeight() * 0.55);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);

        tap.addAction(finger.createPointerMove(Duration.ZERO,
                PointerInput.Origin.viewport(), x, y));

        tap.addAction(finger.createPointerDown(
                PointerInput.MouseButton.LEFT.asArg()));

        tap.addAction(finger.createPointerUp(
                PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));

        System.out.println("➡️ [ACTION] Digitando CPF");
        driver.getKeyboard().sendKeys(cpf);
    }

    public boolean botaoAcessarVisivel() {

        System.out.println("✅ [ASSERT] Validando botão 'Acessar'");
        return botaoAcessar.isDisplayed();
    }
}