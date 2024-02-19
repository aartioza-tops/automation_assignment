
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		 //Get number of rows In table. 
		 int Row_count = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th[3]")).size();
		 System.out.println("Number Of Rows = "+Row_count);
		
		//Get number of column In table.
		 int Column_count = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[7]/td[3]")).size();
		 System.out.println("Number Of Column = "+Column_count);
		//*[@id=\"customers\"]/tbody/tr[2]/td[1]
		 
	}

}
