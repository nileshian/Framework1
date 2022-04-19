package smoke;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		//this comment is added for git verification
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://automationstepbystep.com/");
//	    driver.manage().window().setSize(new Dimension(1382, 754));
	    driver.manage().window().fullscreen();
//	    Thread.sleep(20000);
	    
	 // Locating the Main Menu (Parent element)
	    WebElement mainMenu = driver.findElement(By.linkText("JMeter"));
	    //Instantiating Actions class
	    Actions actions = new Actions(driver);
	    //Hovering on main menu
	    actions.moveToElement(mainMenu).perform();
	    // Locating the element from Sub Menu
	    WebElement subMenu = driver.findElement(By.cssSelector("#menu-item-113 > a"));
	    //To mouseover on sub menu
	    actions.moveToElement(subMenu).click().perform();

	    //build()- used to compile all the actions into a single step 
//	    actions.click().build().perform();
//	    driver.findElement(By.linkText("JMeter Beginner")).click();
	    driver.findElement(By.linkText("Home")).click();
	    driver.findElement(By.linkText("About")).click();
//	    driver.findElement(By.linkText("Home")).click();
	    driver.close();
	    driver.quit();
	    
	}

}
