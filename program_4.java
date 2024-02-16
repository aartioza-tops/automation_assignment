//  W.A.J.script to register your self in Gmail.
package am_assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Tops\\\\Desktop\\\\library\\\\chromedriver-win64\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/u/0/&dsh=S-586578908:1708072709449367&emr=1&flowEntry=SignUp&flowName=GlifWebSignIn&followup=https://mail.google.com/mail/u/0/&ifkv=ATuJsjyFwZ7r8qVtz51_2ECiaj3Z1e-o4r41EIBv8Ocet74tUpo1DzYbSUF318RWdqO4PODUNW7VEw&osid=1&service=mail&theme=glif&TL=ADg0xR2BHnLrfe0r2EGYNwirqFOY8P8Fdzax8WXER0MRxwZ2DUFQMPBvy2HYis6f");
		driver.manage().window().maximize();
		
		
		
	}

}
