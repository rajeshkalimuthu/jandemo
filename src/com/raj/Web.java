package com.raj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class Web {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\rajesh\\SeliniumTraining\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		 WebElement e=driver.findElement(By.xpath("//div[@class='exehdJ']"));
		Actions a =new Actions(driver);
		a.moveToElement(e).build().perform();
		
		
	}	


}
