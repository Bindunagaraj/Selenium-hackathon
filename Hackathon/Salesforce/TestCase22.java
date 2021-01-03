package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase22 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(3000);
		m.byLinkText(driver,"Leads"); 
		Thread.sleep(3000);
		m.dropDown(driver,"//select[@id='fcf']",3);
		Thread.sleep(5000);
		m.byXpath(driver,"//input[@value=' Go! ']");
		Thread.sleep(5000);
		m.dropDown(driver,"//select[@id='00B4x000007asrO_listSelect']",1);
		Thread.sleep(3000);
		m.byXpath(driver, "//span[@id='userNavLabel']");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions action= new Actions(driver);
		action.moveToElement(ele).click().perform();
		Thread.sleep(3000);
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(3000);
		m.byLinkText(driver,"Leads");
		Thread.sleep(3000);
		m.byXpath(driver,"//input[@value=' Go! ']");
		m.byLinkText(driver,"Leads");
		Thread.sleep(3000);
		driver.close();
		

	}

}
