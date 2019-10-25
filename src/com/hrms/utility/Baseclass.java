package com.hrms.utility;

import org.openqa.selenium.WebDriver;

public class Baseclass {
public static WebDriver driver;
public static void open()
{
	System.setProperty("webdriver.chrome.driver","‪E:\\chromedriver.exe");
	driver.navigate().to("https://www.orangehrm.com");
	}
public static void close()
{
	driver.close();
}
}
