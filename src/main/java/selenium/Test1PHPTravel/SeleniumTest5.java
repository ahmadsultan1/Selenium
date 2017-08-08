package selenium.Test1PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest5 {
	static WebDriver driver;
	
	public static void main(String [] args){
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
		
		WebElement WE1 = (driver.findElement(By.xpath("html/body/nav[1]/div/div/div/ul/li[5]/a")));
		WE1.click();
		
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='currency']")));
		sel2.selectByValue("3");
		
		WebElement WE3 = driver.findElement(By.xpath("html/body/div[5]/div[4]/div/table/tbody/tr[1]/td/div/div[2]/div/div[1]/a/button"));
		WE3.click();
		
		WebElement WE4 = driver.findElement(By.xpath("html/body/div[6]/div/form/fieldset/div[1]/input"));
		WE4.sendKeys("sultan");
		
		WebElement WE5 = driver.findElement(By.xpath("html/body/div[6]/div/form/fieldset/div[2]/input"));
		WE5.sendKeys("077885599663");
		
		WebElement WE6 = driver.findElement(By.xpath("html/body/div[6]/div/form/fieldset/div[4]/textarea"));
		WE6.sendKeys("Notes");
		
		WebElement WE7 = driver.findElement(By.xpath("html/body/div[6]/div/form/fieldset/div[6]/input[3]"));
		WE7.click();
		
		
	}

}
