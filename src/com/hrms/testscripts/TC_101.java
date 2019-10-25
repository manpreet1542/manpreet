package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.*;
import com.hrms.utility.Baseclass;

public class TC_101 {
	@Test
	public void demo() throws Exception
	{
	Baseclass.open();
	Addemp.add("hello add");
	Delemp.del();
	Loginpage.login();
	Logoutpage.logout();
	Verifypage.verify("hello verify");
	Baseclass.close();
	}
	
	

}
