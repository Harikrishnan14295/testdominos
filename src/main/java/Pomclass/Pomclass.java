package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {
	
public static WebDriver driver;
	
	@FindBy(xpath="//button[normalize-space()='ORDER ONLINE NOW']")
	public WebElement order;
	
	@FindBy(xpath="//input[@placeholder='Enter Area / Locality']")
	private WebElement address;
	
	@FindBy(xpath="//span[text()='locateme']")
	private WebElement locate;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement Sendvalues;
	
	@FindBy(xpath="//div[@class='sc-jhAzac hSPGLn']")
	private WebElement vegpizza;
	
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//button[@data-label='addTocart']")
	private WebElement gourmet;
	
	@FindBy(xpath="//span[normalize-space()='ADD']")
	private WebElement addcheese;
	
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//button[@data-label='addTocart']")
	private WebElement margherita;
	
	@FindBy(xpath="//span[normalize-space()='ADD']")
	private WebElement addcheese1;
	
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//span[contains(text(),'ADD TO CART')]")
	private WebElement peppypaneer;
	
	@FindBy(xpath="//span[normalize-space()='ADD']")
	private WebElement addcheese2;
	
	@FindBy(xpath="//span[text()='BEVERAGES']")
	private WebElement beverages;
	
	@FindBy(xpath="//div[@data-label='Pepsi 475ml']//button[@data-label='addTocart']")
	private WebElement pepsi;
			
	@FindBy(xpath="//div[@class=\"injectStyles-sc-1jy9bcf-0 kXLEtP\"][1]")
	private WebElement removepizza;
	
	@FindBy(xpath="//body/div[@id='__next']/div/div[@class='sc-gPEVay ivkyrt']/div/div[@class='mn-cnt']/div[@class='sc-jbKcbu ixOXQV']/div[@class='menu-cnt']/div[@class='menu-right']/div[@class='sc-eqIVtm dWoFoS']/div[contains(@class,'cnt')]/div[@class='crt-itms']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement removepepsi;
	
	@FindBy(xpath="//span[text()='CHECKOUT']")
	private WebElement checkout;
	
	
	public WebElement getOrder() {
		return order;
	}
	
	public WebElement getAddress() {
		return getAddress();
	}

	public WebElement Sendvalues() {
		return Sendvalues();
	}
	public WebElement getLocate() {
		return getLocate();
	}

	public WebElement getVegpizza() {
		return vegpizza;
	}
	public WebElement getGourmet() {
		return gourmet;
	}
	public WebElement getAddcheese() {
		return addcheese;
	}
	public WebElement getMargherita() {
		return margherita;
	}
	public WebElement getAddcheese1() {
		return addcheese1;
	}
	public WebElement getPeppypaneer() {
		return peppypaneer;
	}
	public WebElement getAddcheese2() {
		return addcheese2;
	}
	public WebElement getBeverages() {
		return beverages;
	}
	public WebElement getPepsi() {
		return pepsi;
	}
	public WebElement getRemovepizza() {
		return removepizza;
	}
	public WebElement getRemovepepsi() {
		return removepepsi;
	}
	public WebElement getCheckout() {
		return checkout;
	}

	public Pomclass(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	

}
