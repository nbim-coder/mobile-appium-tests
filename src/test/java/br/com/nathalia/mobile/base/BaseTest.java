package br.com.nathalia.mobile.base;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeEach
    public void setUp() throws Exception {

        System.out.println("🚀 Iniciando Appium...");

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "emulator");
        caps.setCapability("appPackage", "br.com.xp.carteira");
        caps.setCapability("appActivity",
                "br.com.xpinc.mobile.commons.flutter.host.CommonsFlutterFragmentActivity");
        caps.setCapability("noReset", true);

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                caps
        );
    }

    @AfterEach
    public void tearDown(TestInfo testInfo) throws Exception {

        System.out.println("📸 Capturando screenshot...");

        if (driver != null) {

            File screenshot = driver.getScreenshotAs(OutputType.FILE);

            File destino = new File("screenshots/"
                    + testInfo.getDisplayName() + ".png");

            FileUtils.copyFile(screenshot, destino);

            driver.quit();
        }
    }
}
