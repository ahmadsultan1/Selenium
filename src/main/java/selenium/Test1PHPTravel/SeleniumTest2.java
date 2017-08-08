package selenium.Test1PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest2
{	
	static WebDriver driver;

	public static void main(String [] args){
	System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	driver.get("http://www.phptravels.net/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("html/body/div[4]/div[2]/div/ul/li[2]/a")).click();
	
	WebElement WE1 = driver.findElement(By.xpath(".//*[@id='flights-origin-prepop-e823caac1a24a0172d4ee792e5dad7d9']"));
	WE1.click();
	WE1.sendKeys("London");
	
	
	WebElement WE2 = driver.findElement(By.xpath(".//*[@id='flights-destination-prepop-e823caac1a24a0172d4ee792e5dad7d9']"));
	WE2.click();
	WE2.sendKeys("Glasgow");
	
	
	WebElement WE3 = (driver.findElement(By.xpath(".//*[@id='flights-dates-depart-prepop-e823caac1a24a0172d4ee792e5dad7d9']")));
	WE3.click();
	WebElement WE4 = (driver.findElement(By.xpath(".//*[@id='mewtwo-datepicker-2017-8-25']/div")));
	WE4.click();
	WebElement WE5 = (driver.findElement(By.xpath(".//*[@id='flights-dates-return-prepop-e823caac1a24a0172d4ee792e5dad7d9']")));
	WE5.click();
	WebElement WE6 = (driver.findElement(By.xpath(".//*[@id='mewtwo-datepicker-2017-8-30']/div")));
	WE6.click();
	WebElement WE7 = (driver.findElement(By.xpath(".//*[@id='flights-form-e823caac1a24a0172d4ee792e5dad7d9']/div[6]/button")));
	WE7.click();
	}
	
}
