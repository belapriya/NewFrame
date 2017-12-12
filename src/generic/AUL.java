package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AUL {
public static String getproperty(String path,String key){
	String v="";
	Properties p=new Properties();
	try {
	p.load(new FileInputStream(path));
	    v=p.getProperty(key);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return v;
		
	}
//method to take screenshot
public static void takephoto(String folder,String testName,WebDriver driver){
	String dateTime=new Date().toString().replaceAll(":", "_");
	TakesScreenshot t=(TakesScreenshot)driver;
	File srcFile=t.getScreenshotAs(OutputType.FILE);
	String dest=folder+testName+dateTime+".png";
	try {
		FileUtils.copyFile(srcFile, new File(dest));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

