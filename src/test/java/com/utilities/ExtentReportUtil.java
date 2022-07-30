package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil {
	ExtentReports report;
	ExtentSparkReporter spark;
	
	public ExtentReports extentReport() throws IOException {
		
		report = new ExtentReports();
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		String timestamp = sdf.format(dt);
		spark = new ExtentSparkReporter(new File("./ExtentReport/ExtentReports "+timestamp+".html"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Tide Automation");
		spark.config().setReportName("Shraddha Lohar");
		report.attachReporter(spark);
		return report;
	}
}
