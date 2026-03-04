package com.steps;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class shoppingCart {
	WebDriver dr;
	@Given("user go to the site")
	public void user_go_to_the_site() {
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		dr.manage().window().maximize();
		dr.get("https://jobserve.com/us/en/Job-Search/");
	}
	@Given("user clicks on all tab")
	public void user_clicks_on_all_tab() {
		dr.findElement(By.xpath("//input[@id='txtKey']")).sendKeys("Selenium");
		
		
	    
	}
	/*@Given("user shop by department")
	public void user_shop_by_department() {
		dr.findElement(By.xpath("//*[@id=\"hmenu-content\"]/div[12]/section/ul/li[2]/a")).click();
		
	
	}*/
	    
	/*@Given("user clicks on women clothing")
	public void user_clicks_on_women_clothing() {
		//Actions a=new Actions(dr);
		//a.moveToElement(dr.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]"))).perform();
	    //dr.findElement(By.xpath("//*[@id=\"nav-flyout-aj:https://m.media-amazon.com/images/G/01/Softlines/Store/MegaMenu/SUMMER24/Sum24FashionNavEN.json:subnav-sl-megamenu-1:0\"]/div[2]/div/div[1]/ul[1]/li[2]/a")).click();
	    dr.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys("Test");
	    
	}*/
	/*@When("user add it the cart")
	public void user_add_it_the_cart() {
		dr.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
	    
	}
	@Then("system should display success message.")
	public void system_should_display_success_message() {
		String actmsg=dr.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText();
		Assert.assertEquals(actmsg, "Added to cart");
	    
	}*/




}
