package org.pickardqa.resources.config;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumCapabilities {

    public DesiredCapabilities returnCapabilities(String browserName, String deviceName, String deviceVersion){

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("deviceName", deviceName);
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", deviceVersion);
        cap.setCapability("browserName", browserName);
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("isHeadless", true);
        cap.setCapability("avdArgs", "-no-window");

        return cap;
    }
}
