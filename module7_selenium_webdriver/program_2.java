package am_assignments;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class program_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//https://demo.guru99.com/test/newtours/register.php
			//select name = country
		
		String baseUrl = "https://demo.guru99.com/test/newtours/register.php";					
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\library\\chromedriver-win64\\chromedriver.exe");					
	     WebDriver driver = new ChromeDriver();		
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
	     Thread.sleep(1000);
	     WebElement d= driver.findElement(By.xpath("//select[@name='country']"));

	      //object of Select class
	      Select s=new Select(d);
	      
	      //get options of dropdown in list
	      List<WebElement> t =s.getOptions();
  // System.out.println("Options are: " + s.getOptions());
//	      
//	      for (WebElement i: t){
//	         // System.out.println(i.getText());
//	    	  
//	    	  
//	    	  
//	       }
	      s.selectByVisibleText("YEMEN");
	      
	      
   
	}



}
