package Hackathon.Salesforce;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(3000);
		m.byLinkText(driver,"Opportunities");
		Thread.sleep(3000);
		m.byXpath(driver,"//tbody/tr[1]/td[2]/input[1]");
		m.sendKeys(driver.findElement(By.xpath("//input[@id='opp3']")),"Bindu");
		m.byXpath(driver,"//tbody/tr[4]/td[2]/span[1]/a[1]/img[1]");
		ArrayList<String> numberOfWindows=new ArrayList<String>(driver.getWindowHandles());// i may open any number of tabs , this is to handle them
		driver.switchTo().window(numberOfWindows.get(1));
		WebElement ele=driver.findElement(By.xpath("//frame[@name='searchFrame']"));
		m.waitExplicitly(driver, 10, ele);
		driver.switchTo().frame(ele);
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='lksrch']")),"Automation");
		Thread.sleep(3000);
		m.byXpath(driver,"//body/form[@id='theForm']/div[1]/div[2]/input[2]");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.xpath("//frame[@id='resultsFrame']"));
		driver.switchTo().frame(ele1);
		m.byXpath(driver, "//a[contains(text(),'Automation')]");
		Thread.sleep(3000);
		//m.byXpath(driver,"//select[@id='opp5']");
		//Thread.sleep(3000);
		m.dropDown(driver,"//select[@id='opp5']",4);
		Thread.sleep(3000);
		m.dropDown(driver,"//select[@id='opp6']",1);
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='opp7']")),"5000");
		Thread.sleep(10000);
		m.byXpath(driver,"driver.switchTo().defaultContent();");
		m.byXpath(driver,"//tbody/tr[@id='calRow2']/td[1]");//date
		m.dropDown(driver,"//select[@id='opp11']",2);
		Thread.sleep(3000);
		m.sendKeys(driver.findElement(By.xpath("//input[@id='opp12']")),"8");//probability
		Thread.sleep(3000);
		m.byXpath(driver,"//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]");
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
