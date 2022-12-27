package org.pickardqa.resources.config;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InternetConnection {

    public void disconnectInternet( WebDriver driver) throws IOException {
        Map map = new HashMap();
        map.put("offline", true);
        map.put("latency", 5);
        map.put("download_throughput", 500);
        map.put("upload_throughput", 1024);

        CommandExecutor executor = ((ChromeDriver)driver).getCommandExecutor();
        Response response = executor.execute(
                new Command(((ChromeDriver)driver).getSessionId(), "setNetworkConditions", ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map))));
    }

    public void reconnectInternet(WebDriver driver) throws IOException {
        Map map = new HashMap();
        map.put("offline", false);
        map.put("latency", 5);
        map.put("download_throughput", 0);
        map.put("upload_throughput", 0);

        CommandExecutor executor = ((ChromeDriver)driver).getCommandExecutor();
        Response response = executor.execute(
                new Command(((ChromeDriver)driver).getSessionId(), "setNetworkConditions", ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map))));
    }

    public void toggle(AndroidDriver driver){
        driver.toggleWifi();
    }

    public void toggleWifi(){
        String wifiState = "adb shell dumpsys wifi | grep 'Wi-Fi is' | cut -d ' ' -f 3";
        String wifiToggle = "adb shell svc wifi enable";

        if(wifiState.equals("enabled")){
            wifiToggle = "adb shell svc wifi disable";
        }
        try {
          Process process =  Runtime.getRuntime().exec(wifiToggle);
          process.waitFor();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
