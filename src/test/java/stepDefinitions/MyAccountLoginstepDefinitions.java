package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyAccountLoginstepDefinitions {
	public WebDriver driver=null;
	
	@Given("^open browser$")
	public void open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@And("^Enter the url \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
		driver.get(url);
	}

	@And("^Click on My Account Menu$")
	public void click_on_My_Account_Menu() throws Throwable {
	   
		driver.findElement(By.linkText("My Account")).click();
	}
	
	/*@And("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("pavanoltraining");           //1
	    driver.findElement(By.id("password")).sendKeys("Test@selenium123");
	}*/
	
	/*@And("^Enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_registered_username_and_password(String user, String pwd) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(user);           //2
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}*/
	
	/*@And("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
		List <List <String>> data=credentials.raw();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	
	}*/
	//login with datatable with header Map table
	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
		List<java.util.Map<String, String>> data=credentials.asMaps(String.class,String.class);
		driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
	}
	
	
	
	

	
	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}
	
	
	@Then("^user must successfully login to the webpage$")
	public void user_must_successfully_login_to_the_web_page() throws Throwable {
	  String capText= driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
	  Assert.assertEquals(true,capText.contains("pavanoltraining"));
	  driver.close();
	
	}
	
	
	/*@Then("^verify login$")
	public void verify_login() throws Throwable {
		String capText=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li/strong")).getText();
		if(capText.contains("ERROR")) // Test for invalid inputs
		{
			Assert.assertTrue("Invalid input - Error Page", true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}*/
		

			
}

