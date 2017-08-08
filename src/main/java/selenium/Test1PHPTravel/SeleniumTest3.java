package selenium.Test1PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest3 {
	static WebDriver driver;
	
	public static void main(String [] args){
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
		
		WebElement WE1 = (driver.findElement(By.xpath("html/body/div[4]/div[2]/div/ul/li[3]/a")));
		WE1.click();
		
		WebElement WE2 = (driver.findElement(By.xpath(".//*[@id='s2id_autogen5']/a/span[1]")));
		WE2.click();
		WE2.sendKeys("London");
		
		WebElement WE3 = (driver.findElement(By.xpath(".//*[@id='tchkin']/div/input")));
		WE3.click();
		
		WebElement WE4 = (driver.findElement(By.xpath("html/body/div[16]/div[1]/table/thead/tr[1]/th[3]")));
		WE4.click();
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='adults']")));
		sel1.selectByValue("1");
		
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='adults']")));
		sel2.selectByValue("198");
		
		WebElement WE5 = (driver.findElement(By.xpath(".//*[@id='TOURS']/div/form/div[5]/div/button")));
		WE5.click();
	}

}
