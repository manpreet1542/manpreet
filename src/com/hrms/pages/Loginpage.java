package com.hrms.pages;
import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.*;

public class Loginpage extends Baseclass {
public static void login() throws Exception
{
	driver.findElement(By.linkText("Features")).click();
	Thread.sleep(3000);;
	Reporter.log("login successfully");
	
}

}
