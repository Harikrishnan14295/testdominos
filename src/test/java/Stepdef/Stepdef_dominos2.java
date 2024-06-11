package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.Baseclass_dominos2;
import Pomclass.Pomclass;
import Runner.Runner_dominos2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_dominos2 extends Baseclass_dominos2{
	
	WebDriver driver=Runner_dominos2.driver;
	
	Pomclass Doms=new Pomclass(driver);
	
	

@Given("Launch the URL and maximize")
public void launch_the_url_and_maximize() {
	url(driver, "https://www.dominos.co.in/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    
}
@When("Click order online")
public void click_order_online() {
	toClick(Doms.getOrder());
	
   
}
@Then("click address and give address")
public void click_address_and_give_address() {
	   
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    toClick(Doms.getAddress());
	//   driver.findElement(By.xpath("//input[@placeholder='Enter Area / Locality']")).sendKeys("westmambalam");
	   WebElement search = driver.findElement(By.xpath("//input[@placeholder='Enter your delivery address']"));
	   search.sendKeys("westmambalam , chennai");
	   search.click();
    
}
@Then("Click Locate me")
public void click_locate_me() {
//	toClick(Doms.getLocate());
    
}
@Then("navigate to order online Page")
public void navigate_to_order_online_page() {
	url(driver, "https://pizzaonline.dominos.co.in/menu?src=brand");
		driver.manage().deleteAllCookies();
	
   
}
@Then("click add to cart for peppy panneer")
public void click_add_to_cart_for_peppy_panneer() {
	toClick(Doms.getPeppypaneer());
	toClick(Doms.getAddcheese());
   
}
@Then("Click add to cart for Veg pizza")
public void click_add_to_cart_for_veg_pizza() {
	toClick(Doms.getVegpizza());
	toClick(Doms.getAddcheese1());
   
}
@Then("click add cart for magherita")
public void click_add_cart_for_magherita() {
	toClick(Doms.getMargherita());
	toClick(Doms.getAddcheese2());
    
}
@Then("click Beverages")
public void click_beverages() {
	toClick(Doms.getBeverages());
	
    
}
@Then("navigate to beverages page")
public void navigate_to_beverages_page() {
	
	for (int i = 1; i < 13 ; i++) {
		Doms.getPepsi().click();;
	}
    
}
@Then("click needed quantity")
public void click_needed_quantity() {
	Doms.getRemovepepsi().click();
	Doms.getRemovepizza().click();
	
   
}
@Then("click checkout")
public void click_checkout() {
	Doms.getCheckout().click();
   
}	

}
