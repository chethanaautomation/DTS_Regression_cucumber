package StepsDefeniation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
public WebDriver driver;

	@Given("User openin Application")
	
	public void user_openin_application() {
		 System.setProperty("webdriver.Chrome.driver", "C://Users//DELL//Downloads//chromedriver-win64//chromedriver-win64.exe");
		 driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	            // Navigate to Google
	            driver.get("https://www.mflbooking.in/");
	            driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	
	@When("user Login to Application with username {string} and Password {string}")
	public void user_login_to_application_with_username_and_password(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		// System.out.println(username+"and is pwd"+password);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@class='btn btn-default orange_btn'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("Home page should be display")
	public void home_page_should_be_display() {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.findElement(By.xpath("(//div[@class='subBrandTitle'])[1]")).getText();
	Assert.assertEquals("SEASON", title);
	}
	@Then("close window")
	public void close_window() {
		 driver.quit();
	}
	@When("click on profile icon")
	public void click_on_profile_icon() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("(//span[@class='header-Nameblk'])[1]")).click();
	}

	@When("click on logout")
	public void click_on_logout() {
	driver.findElement(By.xpath("(//span[@class='account-info'])[3]")).click();
	}

	@Then("Logout verification")
	public void logout_verification() {
	String logouttext =driver.findElement(By.xpath("(//p[@class='form_title h4'])[1]")).getText();
	  System.out.print(logouttext);
	}
	@When("click on Allensolly jeans")
	public void click_on_allensolly_jeans() {
	  driver.findElement(By.xpath("//div[@id='tab-2']//div[@class='subBrandBlock season']//div[1]//a[1]//div[1]//div[1]//img[1]")).click();
	}

	@When("click on Jeans PLP")
	public void click_on_jeans_plp() {
		  driver.findElement(By.xpath("//div[@title='SHIRT']")).click();
	}

	@When("verfied the page")
	public void verfied_the_page() {
		String  PLPverification =driver.findElement(By.xpath("//span[@class='categoryTitle font-18']")).getText();
		Assert.assertEquals("SHIRT", PLPverification);
	}
	@Given("wait for impliticlityon")
	public void wait_for_impliticlityon() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	@When("PLP size select")
	public void plp_size_select() {
		driver.findElement(By.xpath("//input[@id='size_277517_ALSFACUF494092_39_8909068864031'][not(contains(@id, 'size_277517_ALSFACUF494092_36_8909068864017'))]")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
	}

	@When("click on add to cart")
	public void click_on_add_to_cart() {
		driver.findElement(By.xpath("//button[@id='done_277517']")).click();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("go to cart")
	public void go_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.findElement(By.xpath("//span[@class='header-iconCart']//*[name()='svg']")).click();
		//throw new io.cucumber.java.PendingException();
	}

	@When("click on place order")
	public void click_on_place_order() {
		driver.findElement(By.xpath("//button[@class='font-12 font-bold footerSubmitBtn orange_btn pull-right']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("place order continue")
	public void place_order_continue() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//a[@class='continueBtn btn btn-success']")).click();
	}

	@When("Thank you for your order")
	public void thank_you_for_your_order() {
	    // Write code here that turns the phrase above into concrete actions
	   
		String thanks=driver.findElement(By.xpath("//h2[@class='text-center font-30']")).getText();
		Assert.assertEquals("Thank you for your orde", thanks);
		
		//throw new io.cucumber.java.PendingException();
	}

	
}
