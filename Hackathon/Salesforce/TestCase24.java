package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase24 {

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
		m.byXpath(driver,"//tbody/tr[1]/td[2]/input[1]");
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='name_lastlea2']")),"ABCD");
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='lea3']")),"Abcd");
		Thread.sleep(3000);
        m.dropDown(driver,"//select[@id='lea13']",1);
        Thread.sleep(3000);
        m.byXpath(driver,"//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]");
        driver.close();
	}

}
