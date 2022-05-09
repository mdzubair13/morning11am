package org.sample;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zubee\\ClassWorkSpace\\Selenium11am\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Actions a= new Actions(driver);
		
		
		WebElement txtuser = driver.findElement(By.id("email"));
		a.keyDown(Keys.SHIFT).perform();;
		a.sendKeys("greens").perform();
		a.keyUp(Keys.SHIFT).perform();
		
//		txtuser.sendKeys("greens");
//		
//		
//		
				a.doubleClick(txtuser).perform();
                 a.contextClick().perform();;
//		
//	
//		
//		
//		
                 	a.keyDown(txtuser,Keys.DOWN).build().perform();
                 	a.keyUp(txtuser, Keys.DOWN).build().perform();
//		
//		
//		a.keyDown(Keys.ENTER).perform();;
//		a.keyUp(Keys.ENTER).perform();;
//		
//		a.keyDown(Keys.TAB).perform();
//		a.keyUp(Keys.TAB).perform();
//		
//		
//		
	}
	

}
