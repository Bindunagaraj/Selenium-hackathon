package Hackathon.Salesforce;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase25 {

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
		m.byXpath(driver,"//tbody/tr[1]/td[2]/input[1]");
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='name_lastcon2']")),"Abcd");
		Thread.sleep(3000);
		m.byXpath(driver,"//tbody/tr[5]/td[2]/span[1]/a[1]/img[1]");
		Thread.sleep(3000);
		ArrayList<String> numberOfWindows=new ArrayList<String>(driver.getWindowHandles());// i may open any number of tabs , this is to handle them
		driver.switchTo().window(numberOfWindows.get(1));
		WebElement ele1=driver.findElement(By.xpath("//frame[@title='Search']"));
		m.waitExplicitly(driver, 10, ele1);
		driver.switchTo().frame(ele1);
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='lksrch']")),"Automation");
		Thread.sleep(3000);
		m.byXpath(driver,"//body/form[@id='theForm']/div[1]/div[2]/input[2]");
		Thread.sleep(3000);
		WebElement ele2=driver.findElement(By.xpath("//frame[@title='Results']"));
		Thread.sleep(3000);
		driver.switchTo().frame(ele2);
		Thread.sleep(3000);
		String str=driver.findElement(By.xpath("//tbody/tr[2]/th[1]")).getText();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(numberOfWindows.get(0));
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='con4']")), str);
		Thread.sleep(3000);
		m.byXpath(driver,"//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]");
		Thread.sleep(3000);
		driver.close();
	}

}
