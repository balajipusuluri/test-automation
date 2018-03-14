package com.selenium.seleniumtestmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browseTest {
	@Test
	public void openbrowser(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\sivaji\\Desktop\\Testingmat\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=nmOlWomzMKidX-6WnJgJ");

}

}
