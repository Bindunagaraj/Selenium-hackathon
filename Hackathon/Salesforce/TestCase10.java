package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase10 {

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
		m.byXpath(driver,"//tbody/tr[1]/td[2]/input[1]");//this button is not clickable
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.xpath("//input[@id='acc2']"));
		m.waitExplicitly(driver, 10,name);
		m.sendKeys(name,"Automation");
		m.dropDown(driver,"//select[@id='acc6']",6);
		m.dropDown(driver,"//select[@id='00N4x00000DcqHe']",1);
		m.byXpath(driver,"//input[@value=' Save '][@tabindex='34']");
		Thread.sleep(3000);
		driver.close();
		
	}

}
