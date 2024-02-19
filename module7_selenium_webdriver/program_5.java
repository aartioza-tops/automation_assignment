package am_assignments;
import java.util.ArrayList;
import java.util.List;

//  W.A.J. Script To perform the radio button to select one by one in loop
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class program_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebElement[] radioEle;
		
		List<WebElement> radioEle =  new ArrayList<WebElement>();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
	    
		radioEle.add(driver.findElement(By.id("vfb-7-1")));
		radioEle.add(driver.findElement(By.id("vfb-7-2")));
		radioEle.add( driver.findElement(By.id("vfb-7-3")));
		
		for(int i=0;i<3;i++) {
			radioEle.get(i) .click();
			Thread.sleep(1000);
		}
		
	    
	    
	    	
	}
}
