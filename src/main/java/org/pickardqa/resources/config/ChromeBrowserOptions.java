package org.pickardqa.resources.config;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserOptions {
    private ChromeOptions options;

    public ChromeOptions getChromeOptionsWithMaximizedBrowser(){
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        return options;
    }
}
