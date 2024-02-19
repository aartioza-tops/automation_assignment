import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Aarti");
		driver.findElement(By.id("lastName")).sendKeys("Oza");
		driver.findElement(By.id("userEmail")).sendKeys("aarti@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("7889455612");
		
		
		//WebElement dateInput = driver.findElement(By.id("dateOfBirthInput"));
		//dateInput.click();
		
		driver.findElement(By.id("subjectsInput")).sendKeys("java");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-1\"]")).click();
		
		//driver.findElement(By.id("hobbies-checkbox-1")).click();
		
		 WebElement browse = driver.findElement(By.id("uploadPicture"));
		   browse.sendKeys("C:\\Users\\Tops\\Downloads\\1.jpg");
		   System.out.println("File is Uploaded Successfully");
		
		   driver.findElement(By.id("currentAddress")).sendKeys("Tops technology");
		   
		   
		//driver.close();
		//driver.quit();
		
		
	}

}
