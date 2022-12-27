package pickardqa.gui;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;
import org.pickardqa.gui.steps.*;
import org.pickardqa.resources.config.DriverFactory;
import org.pickardqa.resources.config.BrowserConfig;
import org.pickardqa.resources.config.InternetConnection;

import java.net.MalformedURLException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTests {


    BrowserConfig config = new BrowserConfig();

    InternetConnection internetConnection = new InternetConnection();

    DriverFactory driverFactory = new DriverFactory();

    StarbucksSteps steps = new StarbucksSteps();

    @BeforeEach
    public void setup() throws MalformedURLException {
        driverFactory.getAndroidDriver();
    }

    @AfterEach
    public void closeBrowser(){
        config.quitDriver();
    }



    @Test
    @Order(1)
    public void testOnAndroidEmulator2() throws Exception {

        Thread.sleep(1000);
        steps.openStarbucksHomePage();
        steps.isAtMobilePage();
        Thread.sleep(5000);
        steps.clickAgreeBtn();
        steps.clickHamburger();
        steps.clickOrderMobile();
        //internetConnection.toggle((AndroidDriver )WebDriverRunner.getWebDriver());
        steps.clickAllProducts();
        Thread.sleep(5000);
        //internetConnection.toggle((AndroidDriver )WebDriverRunner.getWebDriver());
        steps.clickHotCoffee();
        Thread.sleep(5000);

    }
}
