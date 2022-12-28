package org.pickardqa.resources.config;

import com.codeborne.selenide.WebDriverRunner;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DriverFactory {
    WebDriver driver ;


    public void getAndroidDriver() throws MalformedURLException {
        AppiumCapabilities cap = new AppiumCapabilities();
        DesiredCapabilities capabilities = cap.returnCapabilities("chrome","Nexus 6", "25");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        WebDriverRunner.setWebDriver(driver);

    }



}
