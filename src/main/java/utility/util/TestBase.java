package utility.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
//	static String URL = 	System.getProperty("environment");
	
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		
//		if(browserName.equals("firefox")) {
//			DesiredCapabilities cap=new DesiredCapabilities();		
//			cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//			driver = new FirefoxDriver(cap);
//	}
//		if(browserName.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
//		 ChromeOptions chromeOptions = new ChromeOptions();
//            System.out.println("test 3");
//            chromeOptions.addArguments("--headless");
//            System.out.println("test 4");
//                chromeOptions.addArguments("--verbose");
//            System.out.println("test 5");
//
//          driver = new ChromeDriver(chromeOptions);
//            System.out.println("test 6");
//          System.out.println("opening the chrome browser ");
//            System.out.println("test 7");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/2chromedriver.exe");
			driver = new ChromeDriver();


	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
//		System.out.println(System.getProperty("environment"));
//		
//		driver.get(URL);
		driver.get(prop.getProperty("URL"));
	}
	

	public void closeBrowser() {
		driver.quit();
	}
	}

