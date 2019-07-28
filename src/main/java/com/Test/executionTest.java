package com.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class executionTest {

	public String serverPath = "C:\\Users\\Benjamin\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";
	public String urlPath = "http://www.google.com";
	
	public WebDriver driver;
	
	@BeforeTest
	public void config() {
		
		System.setProperty("webdriver.ie.driver", serverPath);
		
		driver = new InternetExplorerDriver();
	}
	
	@Test
	public void launchTest() {
		
		driver.navigate().to(urlPath);
	}
	
	@AfterTest
	public void end() {
		
		driver.quit();
	}
}
