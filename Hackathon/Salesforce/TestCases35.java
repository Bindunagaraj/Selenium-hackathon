package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases35 {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			GeneralFunctions m=new GeneralFunctions();
			m.launchBrowser(driver,"https://www.salesforce.com/");
			m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
			m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
			Thread.sleep(3000);
			m.byXpath(driver, "//iframe[@id='contactInfoContentId']");
			Thread.sleep(3000);
			WebElement ele1=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
			m.waitExplicitly(driver, 10, ele1);
			driver.switchTo().frame(ele1);
			Thread.sleep(3000);
			m.byXpath(driver,"//tbody/tr[1]/td[2]/input[1]");
			Thread.sleep(3000);
			m.byXpath(driver, "//label[contains(text(),'Selected Tabs')]");
			Thread.sleep(3000);
			m.byXpath(driver, "//tbody/tr[1]/td[3]/select[1]/option[10]");
			Thread.sleep(3000);
			m.byXpath(driver, "//tbody/tr[1]/td[2]/div[3]/a[1]/img[1]");
			Thread.sleep(3000);
			m.byXpath(driver,"//tbody/tr[1]/td[2]/input[1]");
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			m.byXpath(driver, "//span[@id='userNavLabel']");
			Thread.sleep(3000);
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).click().perform();
			Thread.sleep(3000);
			m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
			Thread.sleep(3000);
			driver.close();

	}

}
