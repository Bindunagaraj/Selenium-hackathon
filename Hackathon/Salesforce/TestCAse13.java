package Hackathon.Salesforce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCAse13 {

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
		//ArrayList<String> numberOfwindows=new ArrayList<String>(driver.getWindowHandles());// i may open any number of tabs , this is to handle them
		//driver.switchTo().window(numberOfwindows.get(1));
		//driver.findElement(By.xpath("//input[@value='No Thanks']")).click();
		//driver.close();
		//driver.switchTo().window(numberOfwindows.get(0));
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		m.waitExplicitly(driver, 10,ele );
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);
		 ele.click();
		Thread.sleep(5000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='srch']")),"Automation");
		Thread.sleep(2000);
		m.byXpath(driver,"//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/input[2]");
		Thread.sleep(2000);
		m.byXpath(driver, "//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/div[1]/input[1]");
		Thread.sleep(2000);
		m.byXpath(driver,"//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/div[1]/input[2]");
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();

	}

}
