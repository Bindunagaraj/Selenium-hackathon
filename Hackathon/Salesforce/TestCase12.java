package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase12 {

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
		m.dropDown(driver,"//select[@id='fcf']",4);
		m.byXpath(driver,"//input[@value=' Go! ']");
		m.byXpath(driver,"//tbody/tr[1]/td[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/a[1]");
		WebElement ele=driver.findElement(By.xpath("//input[@id='fname']"));
		ele.clear();
		m.sendKeys(ele,"Name2");
		WebElement field=driver.findElement(By.xpath("//select[@id='fcol1']"));
		m.dropDown(driver,"//select[@id='fcol1']",1);
		m.dropDown(driver,"//select[@id='fop1']",3);
		WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
		value.clear();
		value.sendKeys("a");
		m.byXpath(driver,"//input[@value=' Save '][@data-uidsfdc='5']");
		Thread.sleep(5000);
		driver.close();
	}

}
