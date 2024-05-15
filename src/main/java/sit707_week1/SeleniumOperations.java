package sit707_week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Ahsan Habib
 */
public class SeleniumOperations {
	
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean loginPageTest(String email, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		driver.manage().window().maximize();
//		sleep(5);
		
		driver.get("https://www.bunnings.com.au/login");

		sleep(2);
		
		WebElement element_email = driver.findElement(By.id("okta-signin-username"));
		element_email.sendKeys(email);
		
		WebElement element_password = driver.findElement(By.id("okta-signin-password"));
		element_password.sendKeys(password);
		
		WebElement element_submit = driver.findElement(By.id("okta-signin-submit"));
		element_submit.click();
		
		sleep(5);
		
		boolean isLogin;
		
		if(driver.getCurrentUrl().equals("https://www.bunnings.com.au/")) {
			isLogin = true;
		}else {
			isLogin = false;
		}
		driver.close();	
		return isLogin;
	}
}
