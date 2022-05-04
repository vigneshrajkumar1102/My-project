package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classb {
	@Parameters({"username","password"})
	@Test
	private void test1(String s1,String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	WebElement txtusrname = driver.findElement(By.id("email"));
	txtusrname.sendKeys("greens");
	WebElement txtpasswrd = driver.findElement(By.id("pass"));
	txtpasswrd.sendKeys("greens@123");
	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	@Test
	private void test2() {
		System.out.println("class2");
	}
	@Test
	private void test4() {
		System.out.println("class4");
	}
	@Test
	private void test3() {
		System.out.println("class3");
	}
	@Test
	private void test5() {
		System.out.println("class5");
	}



}
