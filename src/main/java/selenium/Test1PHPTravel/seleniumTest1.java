package selenium.Test1PHPTravel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumTest1 
{
	static WebDriver driver;
	
	public static void main(String [] args){
	System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	driver.get("http://www.phptravels.net/");
	driver.manage().window().maximize();
	
	//this send the keys London into the search bar
	driver.findElement(By.xpath(".//*[@id='s2id_autogen3']/a/span[2]")).click();
	driver.findElement(By.xpath(".//*[@id='select2-drop']/div/input")).sendKeys("London");
	
	
	//check-in date
	WebElement WB = driver.findElement(By.xpath(".//*[@id='dpd1']/div/input"));
	WB.click();
	WebElement WB1 = driver.findElement(By.xpath("html/body/div[13]/div[1]/table/thead/tr[1]/th[3]")); 
	WB1.click();
	WebElement WB2 = driver.findElement(By.xpath("html/body/div[13]/div[1]/table/tbody/tr[4]/td[1]"));
	WB2.click();
	
	//check-out date
	WebElement WB4 = driver.findElement(By.xpath("html/body/div[14]/div[1]/table/thead/tr[1]/th[3]"));
	WB4.click();
	WebElement WB5 = driver.findElement(By.xpath("html/body/div[14]/div[1]/table/tbody/tr[4]/td[4]"));
	WB5.click();
	
	//selecting the number of adults 
	Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='adults']")));
	sel1.selectByValue("1");
	
	//clicking search
	driver.findElement(By.xpath(".//*[@id='HOTELS']/div/form/div[6]/div/button")).click();
	
	Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='currency']")));
	sel2.selectByValue("3");
	
	WebElement WB3 = driver.findElement(By.xpath("html/body/div[5]/div[3]/div/table/tbody/tr[1]/td/div/div[2]/div/div[1]/a/button"));
	WB3.click();
	
	WebElement WB6 = driver.findElement(By.xpath(".//*[@id='ROOMS']/form[4]/div/div[2]/div[1]/button"));
	WB6.click();
	
	driver.findElement(By.xpath(".//*[@id='guestform']/div[1]/div/input")).sendKeys("Ahmad");
	driver.findElement(By.xpath(".//*[@id='guestform']/div[2]/div/input")).sendKeys("Sultan");
	driver.findElement(By.xpath(".//*[@id='guestform']/div[3]/div/input")).sendKeys("ahmad@hotmail.com");
	driver.findElement(By.xpath(".//*[@id='guestform']/div[4]/div/input")).sendKeys("ahmad@hotmail.com");
	driver.findElement(By.xpath(".//*[@id='guestform']/div[6]/div/input")).sendKeys("07822334455");
	driver.findElement(By.xpath(".//*[@id='guestform']/div[7]/div/input")).sendKeys("GUCCI manner");


	WebElement WB10 =driver.findElement(By.xpath(".//*[@id='s2id_autogen1']/a/span[1]"));
	WB10.sendKeys("United Kingdom");
	

	
	
	WebElement WB7 = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div/div[2]/div[5]/button"));
	WB7.click();
	

	Select sel3 = new Select (driver.findElement(By.xpath("html/body/div[3]/div")));
	sel3.selectByValue("btn btn-default arrivalpay");
	
//	WebElement WB8 = driver.findElement(By.xpath(".//*[@id='51']"));
//	WB8.click();
	
	WebElement WB9 = driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div/center/b"));
	WB9.click();
	}
}
