



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class keyboard_mouse_action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		/* driver.get("http://demo.guru99.com/test/newtours/");
		
		
		
		WebElement link_home = driver.findElement(By.linkText("Home"));
		
		WebElement td_home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
		String bgColor = td_home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_home).build();	
		mouseOverHome.perform(); 
		  
        bgColor = td_home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        
        driver.close();
        */
		
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		
		Action seriesOfActions = builder.moveToElement(txtUsername).click().sendKeys("Hello")
				.keyDown(txtUsername, Keys.SHIFT).doubleClick(txtUsername).contextClick().build();
		
		seriesOfActions.perform();	
	}

}
