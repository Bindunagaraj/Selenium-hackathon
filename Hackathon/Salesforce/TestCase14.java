package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase14 {

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
		m.byXpath(driver,"//a[contains(text(),'Accounts with last activity > 30 days')]");
		m.dropDown(driver,"//input[@id='ext-gen20']",1);
		m.byXpath(driver,"//img[@class='x-form-trigger x-form-date-trigger'][@xpath='1']");
		m.byXpath(driver,"//img[@id='ext-gen152']");
		m.byXpath(driver,"//button[@id='ext-gen302']");
		m.byXpath(driver,"//button[@id='ext-gen49']");
		m.sendKeys(driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")),"first report");
		m.sendKeys(driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")),"unique report");
        m.byXpath(driver,"//button[@id='ext-gen299']");
        Thread.sleep(5000);
        driver.close();
	}

}
