package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\karthi\\cucumber\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/telecom/");
		
	   
	}

	@Given("The user click on add custome")
	public void x() {
		
		WebElement name = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
		name.isDisplayed();
		name.click();

	}

	/*
	 * @When("The user is filling all the details") public void
	 * the_user_is_filling_all_the_details() {
	 * 
	 * driver.findElement(By.xpath("//label[@for='done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys("karthi");
	 * driver.findElement(By.id("lname")).sendKeys("rajan");
	 * driver.findElement(By.id("email")).sendKeys("kr@gmail.com");
	 * driver.findElement(By.name("addr")).sendKeys("tanjore");
	 * driver.findElement(By.name("telephoneno")).sendKeys("123456767");
	 * 
	 * }
	 */
	@When("The user is filling all the detail")
	public void the_user_is_filling_all_the_detail(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> asList = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(asList.get(2).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(asList.get(3).get("lname"));
		driver.findElement(By.id("email")).sendKeys(asList.get(0).get("email"));
		driver.findElement(By.name("addr")).sendKeys(asList.get(2).get("address"));
		driver.findElement(By.name("telephoneno")).sendKeys(asList.get(1).get("phno"));
	 
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	}

	@Then("The user should be displayed the customer id")
	public void the_user_should_be_displayed_the_customer_id() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	   
	}

}
