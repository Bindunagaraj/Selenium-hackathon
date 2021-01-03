package Hackathon.Salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase28 {

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
		m.dropDown(driver,"//select[@id='fcf']",4);
		Thread.sleep(3000);
		m.byXpath(driver, "//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]");
		Thread.sleep(3000);
		driver.close();
		

	}

}
