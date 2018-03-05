package com.demo.test.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class weibotest {
	public static void main(String [] args){
		System.setProperty("webdriver.chrome.driver", "D:/工具/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.weibo.com");
		driver.findElement(By.id("loginname")).clear();
		driver.findElement(By.id("loginname")).sendKeys("janyzhen15@163.com");
		driver.findElement(By.xpath("//input[@class ='W_input' and @name= 'password']")).clear();
		driver.findElement(By.xpath("//input[@class ='W_input' and @name= 'password']")).sendKeys("Zong");
		driver.findElement(By.xpath(".//*[@id='pl_login_form']/div/div[3]/div[6]/a")).click();
		driver.get("http://www.baidu.com/");

		driver.findElement(By.id("kw")).sendKeys("selenium java");
		driver.findElement(By.id("su")).click();
		driver.close();
		
		
		
	}
	

}
