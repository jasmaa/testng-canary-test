package com.github.canary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import software.amazon.awssdk.services.cloudwatch.CloudWatchClient;

public class Utils {
  public static WebDriver getDriver() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-debugging-port=9222");
    options.addArguments("--headless=new");

    WebDriver driver = new ChromeDriver(options);
    return driver;
  }

  public static CloudWatchClient getCloudWatchClient() {
    return CloudWatchClient.create();
  }
}
