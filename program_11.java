/*
 * W.A.J. Script To find the total hyperlink from this web page
http://demo.guru99.com/test/web-table-element.php

 * */
package am_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String baseUrl = "https://demo.guru99.com/test/web-table-element.php";	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Tops\\Desktop\\library\\chromedriver-win64\\chromedriver.exe");					
	    
		 WebDriver driver = new ChromeDriver();		
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
		
        // Alert Message handling
                    		
        driver.get(baseUrl);
        
        int numberOfLinks = driver.findElements(By.tagName("a")).size();
        // count no of links on page
        System.out.println("Number of links on Web Page :" +numberOfLinks );
	}

}
