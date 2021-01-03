package Hackathon.Salesforce;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCAse36 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(3000);
		m.byXpath(driver, "//a[contains(text(),'Home')]");
		Thread.sleep(3000);
		m.byXpath(driver, "//a[contains(text(),'Sunday January 3, 2021')]");
		Thread.sleep(3000);
		m.byXpath(driver, "//a[contains(text(),'8:00 PM')]");
		Thread.sleep(3000);
		m.byXpath(driver, "//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]");
		Thread.sleep(3000);
		ArrayList<String> li=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(li.get(1));
		Thread.sleep(3000);
		m.byXpath(driver,"//body/div[2]/ul[1]/li[5]/a[1]");
		Thread.sleep(3000);
		driver.switchTo().window(li.get(0)); 
		m.sendKeys(driver.findElement(By.xpath("//input[@id='evt12']")),"Atlata");
		m.byXpath(driver, "//input[@id='EndDateTime']");
		m.byXpath(driver, "//tbody/tr[@id='calRow2']/td[1]");
		m.byXpath(driver, "//input[@id='EndDateTime_time']");
		WebElement ele=driver.findElement(By.xpath("//div[@id='timePickerItem_42']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);
		 ele.click();
		Thread.sleep(5000);
		m.byXpath(driver,"//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]");
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
