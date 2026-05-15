package br.com.nathalia.mobile.base;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeEach
    public void setUp() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "emulator");
        caps.setCapability("appPackage", "br.com.xp.carteira");
        caps.setCapability(
                "appActivity",
                "br.com.xpinc.mobile.commons.flutter.host.CommonsFlutterFragmentActivity"
        );
        caps.setCapability("noReset", true);

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                caps
        );
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
