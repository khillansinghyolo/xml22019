package xmlLearning1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class xmlDemo1 {
	public String url="https://www.google.com/";
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
	public void login() throws Exception
	{driver.navigate().to("http://182.156.251.238/SLMaruti7/Default.aspx?ClientId=1");
	driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@id='Password']/following::a[1]")).click();
	System.out.println("login page open successfully ");
	
	driver.findElement(By.xpath("//div[@id='QLGrpId7']/child::a[1]")).click();
	driver.findElement(By.xpath("//li[@id='QLid23']/child::a[1]")).click();
	Thread.sleep(3000);

	//WebDriverWait wait= new WebDriverWait(driver,5);
	//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='PageNumber']/following::a[2]")))).click();;
	driver.findElement(By.xpath("//input[@id='PageNumber']/following::a[2]")).click();
	
	driver.findElement(By.xpath("//input[@id='KnowledgeAssetType']/following::input[1]")).sendKeys("Notification of upcoming Course ");
	System.out.println("enter value is text field successfully");
	Select select1=new Select(driver.findElement(By.xpath("//select[@id='ContentType']")));
	select1.selectByVisibleText("Spaced Learning Notification");
	
	//driver.findElement(By.xpath("//div[@id='pw']/descendant::input[1]")).click();
	driver.findElement(By.xpath("//div[@id='div_']/following::button[1]")).click();
	System.out.println("Notification successfully created");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//div[@id='QLGrpId7']/child::a[1]")).click();
	//driver.findElement(By.xpath("//li[@id='QLid23']/child::a[1]")).click();
	driver.findElement(By.xpath("//input[@id = 'SearchText_1']")).sendKeys("Notification of upcoming Course");
	driver.findElement(By.xpath("//input[@id = 'SearchText_1']/following::button[1]")).click();
	driver.findElement(By.xpath("//td[@id='searchResultCell0_5']/descendant::i[1]")).click();
	driver.findElement(By.xpath("//div[@id='divStatus']/following::button[3]")).click();
	driver.findElement(By.xpath("//input[@id='SelectImage']")).sendKeys("C:\\Users\\khillanv\\Pictures\\softskill.png");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[@id='NotificationTextError']/following::button[1]")).click();
	System.out.println("Course is final successfully ");
	
	driver.findElement(By.xpath("//input[@id = 'SearchText_1']")).sendKeys("Notification of upcoming Course");
	driver.findElement(By.xpath("//input[@id = 'SearchText_1']/following::button[1]")).click();

	
	driver.findElement(By.xpath("//tr[@id='SearchResultRow0']/descendant::input[1]")).click();
	driver.findElement(By.xpath("//tr[@id='SearchResultRow1']/descendant::input[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//tr[@id='SearchResultRow2']/following::button[1]")).click();
	System.out.println("successfully Deleted");
	
	
	
}
@AfterTest
public void tearDown()
{
	driver.quit();
}



		}

