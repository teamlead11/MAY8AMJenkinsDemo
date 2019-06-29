package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariff {
	static WebDriver driver;
	
	

	@Given("the user is in addTrafic page")
	public void the_user_is_in_addTrafic_page() {
		
		WebElement name = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
		name.isDisplayed();
		name.click();
		
	}

	@When("the user fill all the fields {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_all_the_fields(String rent, String localmins, String intermin, String smspack,
			String minutecharges, String intercharges, String smscharges) {
		driver.findElement(By.name("rental")).sendKeys(rent);
		driver.findElement(By.id("local_minutes")).sendKeys(localmins);
		driver.findElement(By.id("inter_minutes")).sendKeys(intermin);
		driver.findElement(By.id("sms_pack")).sendKeys(smspack);
		driver.findElement(By.id("minutes_charges")).sendKeys(minutecharges);
		driver.findElement(By.id("inter_charges")).sendKeys(intercharges);
		driver.findElement(By.id("sms_charges")).sendKeys(smscharges);
	}

	@When("the user click reset button")
	public void the_user_click_reset_button() {
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
	}

	@Then("the form should be clear")
	public void the_form_should_be_clear() {
		Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
	}

}
