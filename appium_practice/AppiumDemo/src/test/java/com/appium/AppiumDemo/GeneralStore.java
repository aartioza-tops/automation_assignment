package com.appium.AppiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GeneralStore {

	@Test
	public void test() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Aarti");
		options.setApp("C:\\Users\\Testing\\Documents\\Appium\\APK\\General-Store.apk");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Jigar Thakkar");
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")); 
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		int productCount =	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i =0;i<productCount;i++)
		{
			String productName =driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			Thread.sleep(1000);
			if(productName.equalsIgnoreCase("Jordan 6 Rings"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"));"));
		productCount =	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i =0;i<productCount;i++)
		{
			String productName =driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			Thread.sleep(1000);
			if(productName.equalsIgnoreCase("Nike SFB Jungle"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.quit();
		Thread.sleep(3000);
		driver.quit();
	}
}
