package Hackathon.Salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase19 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(3000);
		m.byLinkText(driver,"Opportunities");
		Thread.sleep(3000);
		m.dropDown(driver,"//select[@id='quarter_q']",0);//current fq
		m.dropDown(driver,"//select[@id='open']",1);//open apportunity
		m.byXpath(driver,"//tbody/tr[3]/td[1]/input[1]");
		//m.dropDown(driver,"//select[@id='quarter_q']",2);//Next fq
		//m.dropDown(driver,"//select[@id='open']",2);//closed apportunity
		//m.byXpath(driver,"//tbody/tr[3]/td[1]/input[1]");
		Thread.sleep(3000);
		driver.close();
		

	}

}
