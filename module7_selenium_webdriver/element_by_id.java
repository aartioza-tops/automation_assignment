
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class element_by_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// u_0_0_zC
		WebElement createAccountBtn = driver.findElement(By.linkText("Create new account"));
		createAccountBtn.click();
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("efg");
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("abc@1234");
		
		
		
		
		
		
		
		
	}

}
