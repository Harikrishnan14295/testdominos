package Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feauture\\Dominos.feature",glue="Stepdef")

public class Runner_dominos2 {
	
	
	public static WebDriver driver;
	@BeforeClass
	public static void start() {
		driver=new ChromeDriver();
		

	}
	

}
