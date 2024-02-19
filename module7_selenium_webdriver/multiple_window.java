import java.util.Iterator;		
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentHandles = driver.getWindowHandle();
		System.out.println("parent window -" + parentHandles);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle:handles) {
			System.out.println(handle);
			if(!handle.equals(parentHandles)) {
				driver.switchTo().window(handle);
				
			}
		}
		
		
	}

}
