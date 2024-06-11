package Baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass_dominos2 {
public static WebDriver driver;
	
	public static void url(WebDriver driver, String A) {
		driver.get(A);
	}
	public static void toClick(WebElement B) {
		B.click();
	}
	public static void toSendValue(WebElement C, String D) {
		C.sendKeys(D);
	}
	public static void toAlert(WebDriver driver) {
		Alert a1= driver.switchTo().alert();
		a1.accept();
	}
	public static void toDismiss(WebDriver driver) {
		Alert a2= driver.switchTo().alert();
		a2.dismiss();
	}
	public static void actionClass(WebDriver driver, WebElement f) {
		Actions A1 = new Actions(driver);
		driver.findElement((By) f);
		A1.moveToElement(f).perform();
	}
	public static void doubleClick(WebDriver driver, WebElement h) {
		Actions A2 = new Actions(driver);
		driver.findElement((By) h);
		A2.doubleClick(h).perform();
	}
	public static void contextClick(WebDriver driver, WebElement j) {
		Actions A3 = new Actions(driver);
		driver.findElement((By) j);
		A3.contextClick(j).perform();
	}
	public static void TakingScreenshot(WebDriver driver, String k) throws IOException {
		TakesScreenshot SCN = (TakesScreenshot)driver;
		File src1 = SCN.getScreenshotAs(OutputType.FILE);
		File des1 = new File(k);
		FileUtils.copyFile(src1, des1);
	}
	public static void toScroll(WebDriver driver, WebElement g) {
		WebElement scroll = driver.findElement((By) g);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("argumets[0].scrollIntoView",scroll );
	}
	
	public static void toSelect(WebElement q, int c) {
		Select drop = new Select(q);
		drop.selectByIndex(c);
		
	}
	public static void toSelect( WebElement q, String v) {
		Select drop = new Select(q);
		drop.selectByVisibleText(v);
		
	}

}
