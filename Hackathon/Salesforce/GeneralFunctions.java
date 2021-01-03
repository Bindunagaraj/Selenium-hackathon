package Hackathon.Salesforce;

import java.beans.Visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralFunctions {

		public void launchBrowser(WebDriver driver , String URL)
		{
			driver.get(URL);
			driver.manage().window().maximize();
		}
		public void waitExplicitly(WebDriver driver1,int timeInSec ,WebElement ele)
		{  
			WebDriverWait wait=new WebDriverWait(driver1, timeInSec);
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			}
		public void logIn(WebDriver driver,String userXpath,String passwordXpath,CharSequence userkeys,CharSequence passwordKeys,String loginXpath) throws InterruptedException
	  {   
		  Thread.sleep(2000);
		  waitExplicitly(driver, 10, driver.findElement(By.xpath(userXpath)));
		  WebElement e1=driver.findElement(By.xpath(userXpath));
		  e1.sendKeys(userkeys);
		  waitExplicitly(driver, 10, driver.findElement(By.xpath(passwordXpath)));
		  WebElement e2=driver.findElement(By.xpath(passwordXpath));
		  e2.sendKeys(passwordKeys);
		  waitExplicitly(driver,10, driver.findElement(By.xpath(loginXpath)));
		  driver.findElement(By.xpath(loginXpath)).click();
		  
	  }
		public void bYId(String Id , WebDriver driver ,CharSequence keyss)
		{
			WebElement e=driver.findElement(By.id(Id));
			e.sendKeys(keyss);
			e.click();
		}
		public void byXpath(WebDriver driver,String xpath ) throws InterruptedException
		{
			Thread.sleep(2000);
			waitExplicitly(driver,20, driver.findElement(By.xpath(xpath)));
			WebElement e=driver.findElement(By.xpath(xpath));
			e.click();
			
		}
		public void byClassName(WebDriver driver,String className)
		{
			waitExplicitly(driver, 10, driver.findElement(By.className(className)));
			WebElement e=driver.findElement(By.className(className));
			e.click();
		}
		public void byLinkText(WebDriver driver,String link)
		{
			waitExplicitly(driver, 10,driver.findElement(By.linkText(link)));
			WebElement e=driver.findElement(By.linkText(link));
			e.click();
			
		}
		public void sendKeys(WebElement e, String string) {
			// TODO Auto-generated method stub
			e.sendKeys(string);
		}
		public void dropDown(WebDriver driver,String xpath,int index)
		{  
			waitExplicitly(driver,20, driver.findElement(By.xpath(xpath)));
			Select se=new Select(driver.findElement(By.xpath(xpath)));//it is select tab and has alloptions inside it
			se.selectByIndex(index);
			
		}
		public void dropDown(WebDriver driver,String xpath,String text)
		{  
			waitExplicitly(driver,20, driver.findElement(By.xpath(xpath)));
			Select se=new Select(driver.findElement(By.xpath(xpath)));//it is select tab and has alloptions inside it
			se.selectByValue(text);
			
			
		}
	 public void waitTDisplayhardTime(WebDriver driver,String xpath) throws InterruptedException
	 {   int count=0;
		 boolean res_flag=true;
	 
		 while(res_flag)
		 {
			 try {
			 if(count==10)
				 res_flag=false;
			 driver.findElement(By.xpath(xpath));
			 res_flag=false;
			 }catch(Exception e)
			 {
				 count++;
				 Thread.sleep(1000);
			 }
		 }
	 }
	
	
}
