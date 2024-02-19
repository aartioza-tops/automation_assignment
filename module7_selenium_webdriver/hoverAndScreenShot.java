import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class hoverAndScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/screenshots");
//		
//		WebElement link_home = driver.findElement(By.linkText("Galaxy Note 10 Plus"));
//		
//		Actions builder = new Actions(driver);
//		Action mouseOverHome = builder.moveToElement(link_home).build();	
//		mouseOverHome.perform(); 
		
		//Thread.sleep(5000);
		
		WebElement link_home  = driver.findElement(By.partialLinkText("iPhone SE 2020 v(13)"));
		Actions builder = new Actions(driver);
		
		Action seriesOfActions = builder.moveToElement(link_home).build();
		
		seriesOfActions.perform();	
		
		
		
		takeSnapShot(driver, "C:\\Users\\Tops\\Desktop\\automation\\test.png");
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		Files.copy(SrcFile, DestFile);
	}

}
