package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import PageObjects.HomePage;
import BaseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {

	WebDriver driver;
	HomePage hp;
//	@Given("the user is on the Urban Ladder page")
//	public void the_user_is_on_the_Urban_Ladder_page() {
//		driver = new ChromeDriver();
//		driver.get("https://www.urbanladder.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
//		driver.manage().window().maximize();
//		
//	}
//	
	@When("the user gives input Bookshelves")
    public void the_user_gives_input_Bookshelves() {
	    hp = new HomePage(BaseClass.getDriver());
		hp.searchBookshelves();
		hp.searchClick();
//		driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("Bookshelves");
//		driver.findElement(By.xpath("//button[@id='search_button']")).click();
	}
	
	@And("the user clicks is redirected to new page")
	public void the_user_clicks_is_redirected_to_new_page() throws InterruptedException {
		
		 hp = new HomePage(BaseClass.getDriver());
		
		driver.findElement(By.xpath("//input[@value='In Stock Only']")).click();
		
//       hp = new HomePage(BaseClass.getDriver());
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
       hp.Close();
       Thread.sleep(3000);
       hp.movetoCategory(driver);
       Thread.sleep(3000);
       hp.SortPrice(driver);
       Thread.sleep(3000);
       hp.SlidePrice(driver);
       	
	}
//	@Then("user should be redirected to the My Account page")
//	public void user_should_be_redirected_to_the_My_Account_page() {
//		boolean status = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
//	Assert.assertEquals(status, true);
//
//	}
	
}
