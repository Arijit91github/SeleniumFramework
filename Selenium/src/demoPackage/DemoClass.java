package demoPackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoClass {
	
static WebDriver driver;
	public static void main(String[] args) {
		
		launchBrowser();

	}
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn automaton\\Workspace\\Eclipse_photon\\Selenium\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.netflix.com/title/80025678");
	WebElement signin= driver.findElement(By.xpath("//div[@id=\"appMountPoint\"]/div/div[2]/div/div[2]/button"));
	 //
	 Set<String> set=driver.getWindowHandles();
	 Iterator<String> itr=set.iterator();
	 while(itr.hasNext()) {
	 

		String Parentwindow = itr.next();
		String Childwindow=itr.next();
		driver.switchTo().window(Childwindow);
	 
		
	}
	 }
	}


