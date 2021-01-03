package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase33 {

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
		Thread.sleep(3000);
		m.byXpath(driver, "//span[@id='userNavLabel']");
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"))).click().build().perform();
		Thread.sleep(3000);
		WebElement ele12=driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
		//Thread.sleep(3000);
		//System.out.println(ele1.getText());
	   // System.out.println(ele12.getText());
	//	if(str1.equals(str2))
	//	System.out.println("yes both home page name and profile ahs same name and test is passed");
	//	else
	//		System.out.println("No , they are not equal , test fail");
		Thread.sleep(3000);
		driver.close();

	}

}
