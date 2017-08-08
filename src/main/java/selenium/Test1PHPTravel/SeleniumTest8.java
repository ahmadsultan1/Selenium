package selenium.Test1PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest8 {
	static WebDriver driver;
	
	public static void main(String [] args){
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
		
		WebElement WE1 = driver.findElement(By.xpath("html/body/nav[1]/div/div/div/ul/li[8]/a"));
		WE1.click();
		
//		WebElement WE7 = driver.findElement(By.xpath(".//*[@id='s2id_carlocations']/a/span[1]"));
//		WE7.click();
//		WE7.sendKeys("Muscat");
//		
//		WebElement WE8 = driver.findElement(By.xpath(".//*[@id='s2id_carlocations2']/a/span[1]"));
//		WE8.click();
//		WE8.sendKeys("Dubia");
		
		WebElement WE2 = driver.findElement(By.xpath(".//*[@id='departcar']"));
		WE2.click();
		WebElement WE3 = driver.findElement(By.xpath("html/body/div[10]/div[1]/table/tbody/tr[4]/td[1]"));
		WE3.click();
		
		WebElement WE4 = driver.findElement(By.xpath(".//*[@id='returncar']"));
		WE4.click();
		WebElement WE5 = driver.findElement(By.xpath("html/body/div[11]/div[1]/table/tbody/tr[5]/td[4]"));
		WE5.click();
		
		WebElement WE6 = driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/form/div[7]/div/button"));
		WE6.click();
	}

}
