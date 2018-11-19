package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class absa2 {
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium//Chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button")).click();
		
					
	}
	
	@Test
	public void adduser1()
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("FName1");
	    	       
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("LName1");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("User1");
	    
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("pass1");
	    
	    
	    WebElement customer = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input"));// select company AAA
	    System.out.println(customer.isEnabled());
	    customer.click();
	    Select customer1 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select")));
	    customer1.selectByValue("2");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("admin@mail.com");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("08255");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();	    
	    
	    

	}
	
	@Test
	public void adduser2()
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("FName2");
	    	       
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("LName2");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("User2");
	    
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("pass2");
	    
	    
	    
	    WebElement customer = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input"));// select company BBB
	    System.out.println(customer.isEnabled());
	    customer.click();
	    
	    
	    
	    Select role = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select")));
	    role.selectByValue("1");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("customer@mail.com");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("08344");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();
	}

	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
