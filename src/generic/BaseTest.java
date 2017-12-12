package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst {
public WebDriver driver;
static{
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	System.setProperty(GECKO_KEY,GECKO_VALUE);

}
@BeforeMethod
public void openApplication(){
	driver=new ChromeDriver();
String AUT=	AUL.getproperty(SETTING_PATH, "AUT");
driver.get(AUT);
String strITO=	AUL.getproperty(SETTING_PATH, "ITO");
long ITO=Long.parseLong(strITO);
	driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	
}
@AfterMethod
public void closeApplication(){
	driver.quit();
}
}
