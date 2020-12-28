package amazon.us.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupperClass {
	
public static	WebDriver driver;
	
public static void initialiZation()	{
	
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
  driver = new ChromeDriver(); 	
 
	
}


}
