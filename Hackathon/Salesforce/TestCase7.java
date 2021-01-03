package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(1000);
		m.byXpath(driver,"//span[@id='userNavLabel']");
		WebElement mySettings=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		Actions action=new Actions(driver);
		action.moveToElement(mySettings).click().build().perform();
		Thread.sleep(5000);
		m.byXpath(driver,"//span[@id='PersonalInfo_font']");
		m.byXpath(driver, "//span[@id='LoginHistory_font']");
		m.byXpath(driver,"//a[contains(text(),'Download login history for last six months, includ')]");
		//till downloading the login history
		m.byXpath(driver, "//span[@id='DisplayAndLayout_font']");
		m.byXpath(driver, "//span[@id='CustomizeTabs_font']");
		m.byXpath(driver, "//tbody/tr[1]/td[1]/label[1]");
		Thread.sleep(5000);
		m.dropDown(driver,"//select[@id='p4']",8);//see there is osme error here
		m.byXpath(driver,"//label[contains(text(),'Available Tabs')]");
		Thread.sleep(3000);
		WebElement reports=driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
		m.waitExplicitly(driver, 10,reports);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",reports);
		reports.click();
		Thread.sleep(3000);
		m.byXpath(driver,"//tbody/tr[1]/td[2]/div[2]/a[1]/img[1]");
		m.byXpath(driver,"//tbody/tr[1]/td[2]/input[1]");
		//display and layout is finished here
		m.byXpath(driver, "//span[@id='EmailSetup_font']");
		m.byXpath(driver,"//span[@id='EmailSettings_font']");
		WebElement emailName=driver.findElement(By.xpath("//input[@id='sender_name']"));
		m.waitExplicitly(driver, 10,emailName);
		emailName.clear();
		emailName.sendKeys("BinduNagaraj");
		WebElement emailAddress=driver.findElement(By.xpath("//input[@id='sender_email']"));
		m.waitExplicitly(driver, 10,emailAddress);
		emailAddress.clear();
		emailAddress.sendKeys("bhavanasujan123@gmail.com");
		WebElement button=driver.findElement(By.xpath("//label[text()='Yes']"));
		if(!(button.isSelected())){
			button.click();
		}
		m.byXpath(driver, "//tbody/tr[1]/td[2]/input[1]");
		//email field part is over
		
		m.byXpath(driver,"//span[@id='CalendarAndReminders_font']");
		m.byXpath(driver,"//span[@id='Reminders_font']");
		m.byXpath(driver,"//input[@id='testbtn']");
		//calender part is over
	
		

	}

}
