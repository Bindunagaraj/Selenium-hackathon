package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]")).click();
	Thread.sleep(5000);
    WebElement ele1=driver.findElement(By.xpath("//input[@id='username']"));
	ele1.sendKeys("bindu93@gmail.com");
	waitExplicitly(driver, 10,driver.findElement(By.xpath("//input[@id='password']")));
	WebElement ele2=driver.findElement(By.xpath("//input[@id='password']"));
	waitExplicitly(driver, 10,driver.findElement(By.xpath("//input[@id='Login']")));
	WebElement ele3=driver.findElement(By.xpath("//input[@id='Login']"));
	ele3.click();
	Thread.sleep(1000);
	driver.close();

	}
	public static void waitExplicitly(WebDriver driver1,int timeInSec ,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver1, timeInSec);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}   
	public static void threadSleep(int sec , WebElement ele) throws InterruptedException
	{
		if(ele.isDisplayed())
			Thread.sleep(sec);
		else
			sec=sec+1000;
	}
	

}
