package selenium.Test1PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest6 {
	// this test is not working at the profile edit part, go over it at the end.
	static WebDriver driver;
	
	public static void main(String [] args){
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
	
		WebElement WE1 = driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/a"));
		WE1.click();
		WebElement WE2 = driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a"));
		WE2.click();
		
		driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys("Ahmad");
		driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[4]/input")).sendKeys("Sultan");
		driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[5]/input")).sendKeys("07887711226");
		driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[6]/input")).sendKeys("thisEmail@hotmail.com");
		driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[7]/input")).sendKeys("Pa$$word123");
		driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[8]/input")).sendKeys("Pa$$word123");
		
		WebElement WE3 = driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[9]/button"));
		WE3.click();
	}
	
}
