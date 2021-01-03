package Hackathon.Salesforce;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.byXpath(driver,"//input[@id='username']"); 
		m.sendKeys(driver.findElement(By.xpath("//input[@id='username']")),"bindu93@gmail.com");  
		m.byXpath(driver,"//input[@id='password']");
		m.sendKeys(driver.findElement(By.xpath("//input[@id='password']")),"Sujan@123");
		m.byXpath(driver, "//label[contains(text(),'Remember me')]");
		m.byXpath(driver, "//input[@id='Login']");
		Thread.sleep(3000);
		m.byXpath(driver,"//span[@id='userNavLabel']");
		WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(e).click().build().perform();
		Thread.sleep(5000);
		driver.close();
	}

}
