package xmlLearning1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XmlDemo2 {
	public String url="http://182.156.251.238/SLMaruti7/Default.aspx";
	public WebDriver driver;
	public String driverPath="D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe";
	
	@BeforeTest
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver",driverPath );
	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\SELENIUM\\chrome.log");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get(url);	
	}
	
	@Test
	public void login()
	{
		driver.navigate().to("https://www.google.com/");
		System.out.println("TEST Demo2 ");
		driver.quit();
	}
}
