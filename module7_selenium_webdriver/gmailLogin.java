import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
class gmailLogin {
	 static WebDriver driver = new ChromeDriver();	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Testing\\Desktop\\Aarti\\chromedriver-win64\\chromedriver.exe");					
	    
	     String baseUrl = "https://accounts.google.com/signin";
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
	     driver.get("https://accounts.google.com/signin");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//close browser
	      driver.close();
	}

	@Test
	void test() {
		//identify email
	      WebElement l = driver
	      .findElement(By.name("identifier"));
	      l.sendKeys("abc@gmail.com");
	      WebElement b = driver
	      .findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
	      b.click();
	      //identify password
	      WebElement p = driver
	      .findElement(By.name("password"));
	      p.sendKeys("123456");
	      b.click();
	}

}
