package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase34 {

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
		WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'bindu Nagaraj')]"));
		ele1.click();
		Thread.sleep(3000);
		m.byXpath(driver, "//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]");
		WebElement iFrame=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		m.waitExplicitly(driver, 10, iFrame);
		driver.switchTo().frame(iFrame);
		m.byXpath(driver, "//a[contains(text(),'About')]");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.clear();
		lastname.sendKeys("abc");
		Thread.sleep(3000);
		m.byXpath(driver,"//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.close();

	}

}
