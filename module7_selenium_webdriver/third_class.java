

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class third_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\downloaded files\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); // Launching the Web browser
		driver.manage().window().maximize(); // Maximize Browser Window
		
		System.out.println("driver.getTitle()" + driver.getTitle() ); // Fetch the page Title
		
		WebElement username = driver.findElement(By.id("email"));
		
		// clear command
		username.clear();
		
		// sendKeys Command
		username.sendKeys("aarti_oza"); 
		
		
		// click command
		WebElement button = driver.findElement(By.name("login"));
		
		//button.click();
		
		// close command
		
		//driver.close();
		
		// System.exit(0);
		
		
		
		
		
		
	}

}
