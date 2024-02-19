package com.appium.AppiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumTest {

	@Test
	public void test() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Aarti");
		options.setApp("C:\\Users\\Testing\\Documents\\Appium\\APK\\ApiDemos-debug.apk");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Cloning\"]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
	}
}
