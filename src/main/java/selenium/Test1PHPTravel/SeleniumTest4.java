package selenium.Test1PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest4 {
	static WebDriver driver;
	
	public static void main(String [] args){
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
	
		WebElement WE1 = driver.findElement(By.xpath("html/body/nav[1]/div/div/div/ul/li[4]/a"));
		WE1.click();
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='currency']")));
		sel1.selectByValue("3");
		
		WebElement WE2 = driver.findElement(By.xpath("html/body/div[5]/div[3]/div/table/tbody/tr[2]/td/div/div[2]/div/div[1]/a/button"));
		WE2.click();
		
		WebElement WE3 = driver.findElement(By.xpath(".//*[@id='OVERVIEW']/div/div[2]/div[1]/div[1]/div[2]/a"));
		WE3.click();
		
		WebElement WE4 = driver.findElement(By.xpath(".//*[@id='OVERVIEW']/div/div[2]/div[2]/div[2]/div/div/form/div/div[2]/button"));
		WE4.click();
		WebElement WE5 = driver.findElement(By.xpath(".//*[@id='OVERVIEW']/div/div[2]/div[2]/div[2]/div/div/form/div/div[2]/input"));
		WE5.click();
		WebElement WE6 = driver.findElement(By.xpath("html/body/div[10]/div[1]/table/tbody/tr[4]/td[1]"));
		WE6.click();
		
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='selectedAdults']")));
		sel2.selectByValue("3");
		
		WebElement WE7 = driver.findElement(By.xpath(".//*[@id='OVERVIEW']/div/div[2]/div[2]/div[2]/div/form/div[4]/button"));
		WE7.click();
		
		driver.findElement(By.xpath(".//*[@id='guestform']/div[1]/div/input")).sendKeys("Ahmad");
		driver.findElement(By.xpath(".//*[@id='guestform']/div[2]/div/input")).sendKeys("Sultan");
		driver.findElement(By.xpath(".//*[@id='guestform']/div[3]/div/input")).sendKeys("ahmad@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='guestform']/div[4]/div/input")).sendKeys("ahmad@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='guestform']/div[6]/div/input")).sendKeys("07822334455");
		driver.findElement(By.xpath(".//*[@id='guestform']/div[7]/div/input")).sendKeys("GUCCI manner");

		WebElement WE8 =driver.findElement(By.xpath(".//*[@id='s2id_autogen1']/a/span[1]"));
		WE8.sendKeys("United Kingdom");
		
		WebElement WE9 = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div/div[2]/div[5]/button"));
		WE9.click();
		
	}

}
