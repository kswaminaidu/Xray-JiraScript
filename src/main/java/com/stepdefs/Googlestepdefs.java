package com.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java8.En;

public class Googlestepdefs implements En {
	public WebDriver driver;
	public String path ="./src/test/resources/geckodriver.exe";
	
	public Googlestepdefs() {
		
		Given("url of google {string}", (String url) -> {
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
			driver.navigate().to(url);
		});
		
		/*When("text to search {string}", (String name) -> {
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(name);
		});
		
		When("click on search", () -> {
			driver.findElement(By.xpath("(//center/input[@name='btnK'])[1]")).click();
		});
		
		Then("validate page title", () -> {
			driver.getTitle().contains("Google");
		});*/
		
		When("text to search {string}", (String string) -> {
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(string);
		});

		When("click on search", () -> {
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		});

		Then("validate page title", () -> {
			driver.getTitle().contains("Google");
			driver.quit();
		});

	}
	
}
