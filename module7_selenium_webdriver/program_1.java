//W.A.J.Script for Locating links by linkText() and partialLinkText()
package am_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;	

public class program_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String baseUrl = "https://phptravels.com/demo/";					
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\library\\chromedriver-win64\\chromedriver.exe");					
	     WebDriver driver = new ChromeDriver();		
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
	     driver.findElement(By.linkText("Pricing")).click();		
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Themes")).click();	
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Product")).click();	
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Product")).click();	
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Features")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Company")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Company")).click();
	     Thread.sleep(1000);
	    // WebDriver edgeDriver = new EdgeDriver();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	        //Scroll down till the bottom of the page
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     Thread.sleep(500);
	     driver.findElement(By.linkText(" Hotels ")).click();
	}

}
