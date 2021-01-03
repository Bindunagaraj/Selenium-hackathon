package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(5000);
		m.byXpath(driver,"//body/div[@id='contentWrapper']/div[@id='AppBodyHeader']/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
		Thread.sleep(5000);
		m.byXpath(driver,"//a[contains(text(),'Create New View')]");
		m.sendKeys(driver.findElement(By.xpath("//input[@id='fname']")),"First View");
		m.sendKeys(driver.findElement(By.xpath("//input[@id='devname']")),"Bindu93Viewing");
        m.byXpath(driver,"//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]");
        Thread.sleep(3000);
        driver.close();
	}

}
