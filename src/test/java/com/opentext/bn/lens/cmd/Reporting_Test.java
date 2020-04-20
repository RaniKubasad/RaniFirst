package com.opentext.bn.lens.cmd;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Reporting_Test {
	
	@Test
	public void ReportTest() {
	System.out.println("this is my first reporting ");
	
	ExtentHtmlReporter  reporter = new ExtentHtmlReporter("./Reports/Test.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	
	ExtentTest logger= extent.createTest("LoginTest");
	
	logger.log(Status.INFO,"login success");
	
	extent.flush();
	
	}
	
}
