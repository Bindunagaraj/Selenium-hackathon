package Hackathon.Salesforce;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(1000);
		m.byXpath(driver,"//span[@id='userNavLabel']");
		WebElement myProfile=driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
		Actions action=new Actions(driver);
		action.moveToElement(myProfile).click().build().perform();
		Thread.sleep(5000);
	    ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(windows.get(1));
	    driver.close();
	    Thread.sleep(3000);
	    driver.switchTo().window(windows.get(0));
	    driver.close();
	  

	}

}
