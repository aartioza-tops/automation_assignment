 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExec  
//utor;  
public class waitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");          
	    driver.findElement(By.id("FromSector_show")).sendKeys("Delhi",Keys.ENTER);          
	    driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai", Keys.ENTER);  
	    driver.findElement(By.id("ddate")).click(); 
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
	    driver.findElement(By.id("snd_4_08/08/2019")).click();  
	    driver.findElement(By.className("src_btn")).click();  
	    driver.findElement(By.xpath("//button[text()='Book Now']")).click();   
	   
	}

}
