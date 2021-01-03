package Hackathon.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		GeneralFunctions m=new GeneralFunctions();
		m.launchBrowser(driver,"https://www.salesforce.com/");
		m.byXpath(driver,"//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]");
		m.logIn(driver,"//input[@id='username']","//input[@id='password']","bindu93@gmail.com","Sujan@123","//input[@id='Login']");
		Thread.sleep(1000);
		m.byXpath(driver,"//span[@id='userNavLabel']");
		WebElement myProfile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		Actions action=new Actions(driver);
		action.moveToElement(myProfile).click().build().perform();
		Thread.sleep(5000);
		//give last name 
        m.byXpath(driver, "//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]");
		Thread.sleep(5000);
		WebElement iFrame=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		m.waitExplicitly(driver, 10, iFrame);
		driver.switchTo().frame(iFrame);
		m.byXpath(driver, "//a[contains(text(),'About')]");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.clear();
		lastname.sendKeys("Nagaraj");
		Thread.sleep(3000);
		m.byXpath(driver,"//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//share post
		m.byXpath(driver,"//tbody/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]");
		Thread.sleep(2000);
		WebElement overview=driver.findElement(By.xpath("//iframe[@frameborder='0']"));
		m.waitExplicitly(driver,10, overview);
		driver.switchTo().frame(overview);
		m.byXpath(driver, "//body[@contenteditable='true']");
		m.sendKeys(driver.findElement(By.xpath("//body[@contenteditable='true']")),"I am inside post");
		Thread.sleep(5000);
		
		m.byXpath(driver,"//input[@id='publishersharebutton']");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//clicking on file
		m.byXpath(driver, "//span[contains(text(),'File')]");
		m.byXpath(driver, "//a[@id='chatterUploadFileAction']");
		WebElement upload=driver.findElement(By.xpath("//input[@id='chatterFile']"));
		m.waitExplicitly(driver, 10, upload);
		upload.sendKeys("C:\\Users\\14704\\Downloads\\LoginHistory1609639081960.csv");
		m.byXpath(driver,"//input[@id='publishersharebutton']");
		System.out.println("file uploaded successfully");
		// file uploaded
		m.byXpath(driver,"//img[@class='recImage photo']");
		WebElement photo=driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		m.waitExplicitly(driver, 10, photo);
		driver.switchTo().frame(photo);
		WebElement uploadPhoto=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		uploadPhoto.sendKeys("C:\\Users\\14704\\Downloads\\IMG_0109.jpg");
		m.byXpath(driver,"//input[@id='j_id0:uploadFileForm:uploadBtn']");
		driver.switchTo().defaultContent();
		System.out.println("photo uploaded"); 
		driver.close();
		
		
	}

}
