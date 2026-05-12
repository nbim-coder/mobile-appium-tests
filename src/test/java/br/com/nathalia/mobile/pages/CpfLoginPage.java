package br.com.nathalia.mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class CpfLoginPage {

    private AndroidDriver driver;

    public CpfLoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void digitarCpf(String cpf) {

        // 📏 Tamanho da tela
        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth() / 2;
        int y = (int) (size.getHeight() * 0.55);

        // 🖱️ Pointer (W3C standard)
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(
                Duration.ZERO,
                PointerInput.Origin.viewport(),
                x,
                y
        ));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // ✅ Executa o TAP no padrão W3C
        driver.perform(Collections.singletonList(tap));

        // ⌨️ Digita CPF
        driver.getKeyboard().sendKeys(cpf);
    }

    public void clicarAcessar() {
        driver.findElementByAccessibilityId("Acessar").click();
    }
}