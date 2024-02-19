
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.*;

//import org.openqa.commons.io.FileUtils;

public class screen_shot {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
	    WebElement Element = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	    		// driver.findElement(By.xpath("//input[@name='q']"));
        MakeBorder(Element,driver);
		takeSnapShot(driver,"C:\\Users\\Tops\\Desktop\\automation\\test.png");
		
        driver.quit();
	}
	
	// Function to Take screenshot
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
 
    // Function to Make border
    public static void MakeBorder(WebElement Element, ChromeDriver driver)
    {
 
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(
            "arguments[0].style.border = '3px solid red'",
            Element);
    }
	

}
