package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4a {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.byXpath(driver,"//input[@id='username']"); 
		m.sendKeys(driver.findElement(By.xpath("//input[@id='username']")),"bindu93@gmail.com");
		Thread.sleep(3000);
		m.byXpath(driver,"//a[@id='forgot_password_link']");
		Thread.sleep(3000);
		m.byXpath(driver,"//input[@id='un']");
		m.sendKeys(driver.findElement(By.xpath("//input[@id='un']")),"bindu93@gmail.com");
		Thread.sleep(3000);
		m.byXpath(driver,"//input[@id='continue']");
		Thread.sleep(3000);
		m.byXpath(driver,"//a[contains(text(),'Return to Login')]");
		Thread.sleep(3000);
		driver.close();

	}

}
