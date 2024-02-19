import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class selenium_basic_command {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		//Set implicit wait of 10 seconds
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();
		
		
		 //This will scroll the page till the element is found
		WebElement Element =  driver.findElement(By.id("fname"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
		
		String sample_string = driver.findElement(By.id("idOfDiv")).getText();
		System.out.println(sample_string);
		
		Thread.sleep(3000);
		
//		driver.findElement(By.linkText("This is a link")).click();
//		Thread.sleep(3000);
		//driver.findElement(By.id("dismiss-button")).click();
		 driver.findElement(By.id("fname")).sendKeys("lakhayu");
		Thread.sleep(3000);
		driver.findElement(By.id("idOfButton")).click();
		
		
		//driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("male")).click();
		Thread.sleep(3000);
		
		// Automation
		driver.findElement(By.className("Automation")).click();
		Thread.sleep(3000);
		
		//Using Select class for for selecting value from dropdown
		Select dropdown = new Select (driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");
		  js.executeScript("arguments[0].scrollIntoView();", dropdown);
		  Thread.sleep(3000);
		  
		  Thread.sleep(50000);
			
			//Close the browser
			driver.close();
		
	}

}
