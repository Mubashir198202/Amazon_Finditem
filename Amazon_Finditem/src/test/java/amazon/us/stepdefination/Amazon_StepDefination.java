package amazon.us.stepdefination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import amazon.us.baseclass.SupperClass;
import amazon.us.pagefactory.MasterPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon_StepDefination extends SupperClass {
	
	MasterPageFactory pf;
	
	
	
	
	@Given("^user can able to open chrome browser$")
	public void user_can_able_to_open_chrome_browser()  {
		SupperClass.initialiZation();   
	}

	@Given("^user can able to enter Amazon URL$")
	public void user_can_able_to_enter_Amazon_URL()  {
	   driver.get("https://www.amazon.com/");
	   driver.manage().window().maximize();
	}

	@Given("^user can clik on Singin button$")
	public void user_can_clik_on_Singin_button()  {
	pf = PageFactory.initElements(driver,MasterPageFactory.class); 
	pf.getAcceptsignin().click();
	}

	@Given("^user can enter username$")
	public void user_can_enter_username()  {
	 pf = PageFactory.initElements(driver,MasterPageFactory.class );
	 pf.getEnterusername().sendKeys("deynirmal976@gmail.com");
	}

	@Given("^user can on clik continue$")
	public void user_can_on_clik_continue()  {
	driver.findElement(By.xpath("(//*[@id='continue'])[2]")).click();   
	}

	@Given("^user can enter pasword$")
	public void user_can_enter_pasword()  {
   pf = PageFactory.initElements(driver,MasterPageFactory.class ); 
   pf.getEnterpassword().sendKeys("Kanchijully1971");
	}

	@Given("^user can cilk on Login Button$")
	public void user_can_cilk_on_Login_Button()  {
	driver.findElement(By.xpath("//*[@id='signInSubmit']")).click(); 
	}

	@Given("^Enter in search box product name As a IPhone$")
	public void enter_in_search_box_product_name_As_a_IPhone()  {
	WebElement enterText = pf.getEnterIphone();
	enterText.sendKeys("Iphone");
	enterText.sendKeys(Keys.ENTER);
	}

	@When("^Customer able to see list of the iPhone on screen$")
	public void customer_able_to_see_list_of_the_iPhone_on_screen()  {
	   
	}

	@When("^Customer can print the entire price$")
	public void customer_can_print_the_entire_price()  {
		List <WebElement> li= driver.findElements(By.xpath("//*[@class='a-price']"));
	  System.out.println("Total iphone count num :" + li.size());
		for(WebElement select : li) {
			String listPrice = select.getText();
			System.out.println("Iphione price list :" +listPrice);		
		}
	}

	@When("^Customer can click on third number iPhone$")
	public void customer_can_click_on_third_number_iPhone()  {
		List<WebElement>li =new ArrayList<WebElement>();
		for(int i =0; i<li.size();i++) {
			if(i>2) {
				System.out.println("Selected num : "+i);
				System.out.println("Iphone Iphone Price : "+li.get(i).getText());
				li.get(i).click();
				break;
			}
	} 
	}

	@Then("^Customer verify the price$")
	public void customer_verify_the_price()  {
	   
	}

	@Given("^Enter in search box product name As a laptop$")
	public void enter_in_search_box_product_name_As_a_laptop()  {
	    
	}

	@When("^Customer able to see list of the laptop on screen$")
	public void customer_able_to_see_list_of_the_laptop_on_screen()  {
	    
	}

	@When("^Customer can print the entire laptop price$")
	public void customer_can_print_the_entire_laptop_price()  {
	    
	}

	@When("^Customer can click on third number laptop$")
	public void customer_can_click_on_third_number_laptop()  {
	    
	}

	@Then("^Customer verify the laptop price$")
	public void customer_verify_the_laptop_price()  {
	   
	}

}
