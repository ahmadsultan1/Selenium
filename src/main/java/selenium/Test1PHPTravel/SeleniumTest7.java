package selenium.Test1PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest7 {
	static WebDriver driver;
	
	public static void main(String [] args){
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
	
		WebElement WE1 = driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/a"));
		WE1.click();
		WebElement WE2 = driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]/a"));
		WE2.click();
	
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/div/div[1]/input")).sendKeys("thisEmail@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/div/div[2]/input")).sendKeys("Pa$$word123");
		
		
		WebElement WE3 = driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/button"));
		WE3.click();
		
		
		Select sel3 = new Select(driver.findElement(By.xpath("html/body/div[3]/div[3]/div/div[1]/ul/li[2]/a")));
		sel3.selectByValue("#profile");
//		WebElement WE4 = driver.findElement(By.xpath("html/body/div[3]/div[3]/div/div[3]"));
//		WE4.click();
//		WebElement WE5 = driver.findElement(By.xpath("html/body/div[3]/div[3]/div/div[1]/ul/li[2]/a"));
//		WE5.click();
		
		Select sel4 = new Select(driver.findElement(By.xpath("html/body/div[3]/div[3]/div")));
		sel4.selectByValue("html/body/div[3]/div[3]/div");
		
		driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Password123");
		driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[2]/div[2]/div[3]/div[2]/input")).sendKeys("Password123");
		driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[3]/div[2]/div[1]/div[2]/input")).sendKeys("house");
		driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[3]/div[2]/div[2]/div[2]/input")).sendKeys("street");
		driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[3]/div[2]/div[3]/div[2]/input")).sendKeys("city");
		driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[3]/div[2]/div[4]/div[2]/input")).sendKeys("region");
		driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[3]/div[2]/div[5]/div[2]/input")).sendKeys("postCode");
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[3]/div[2]/div[5]/div[2]/input")));
		sel1.selectByValue("GB");
		
		WebElement WE6 = driver.findElement(By.xpath(".//*[@id='profilefrm']/div/div[3]/div[3]/button"));
		WE6.click();
	}

}