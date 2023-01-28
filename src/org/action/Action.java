package org.action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("WebDRiver.ChromeDriver","E:\\Action\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.xpath("(//a[@class='gb_j'])[2]"));
		Actions action = new Actions(driver);
		action.contextClick(mail).perform();
		
		Robot r = new Robot();
		for(int i = 0; i<3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.navigate().back();
		
		
		
		
		
	}

}
