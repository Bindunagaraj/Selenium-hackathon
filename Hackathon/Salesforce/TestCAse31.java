package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCAse31 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(3000);
		m.byLinkText(driver,"Contacts");
		Thread.sleep(3000);
		m.byXpath(driver, "//a[contains(text(),'Create New View')]");
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='fname']")),"abc");
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='devname']")),"efg");
		Thread.sleep(3000);
		m.byXpath(driver, "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]");
		Thread.sleep(3000);
		driver.close();

	}

}
