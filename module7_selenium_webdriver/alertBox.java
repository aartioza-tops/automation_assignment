//https://demo.guru99.com/test/delete_customer.php

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class alertBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement custID = driver.findElement(By.name("cusid"));
		custID.sendKeys("1001");
		
		driver.findElement(By.name("submit")).click();
		
		driver.switchTo().alert().accept();		
		
		
	}

}
