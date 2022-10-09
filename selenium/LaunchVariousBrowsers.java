package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//WHAT'S COVERED HERE?
//Invoke sessions of various browsers and maximize browser
//Diff b/w driver.get("URL") and driver.navigate().to("URL")
//Diff b/w driver.close() and driver.quit()
//Why WebDriver driver = new ChromeDriver and why not ChromeDriver driver = new ChromeDriver()?

public class LaunchVariousBrowsers {

	public static void main(String[] args) throws InterruptedException {
		//Edge browser session creation
		//System.setProperty("webdriver.edge.driver", "C:\\Eclipse&Sel\\BrowserDrivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		//Firefox browser session creation
		//System.setProperty("webdriver.gecko.driver", "C:\\Eclipse&Sel\\BrowserDrivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Chrome browser session creation
		//C:\\Eclipse&Sel\\BrowserDrivers\\chromedriver.exe is the path of chromedriver executable file on this machine
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse&Sel\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Here, we can also use ChromeDriver driver =  new ChromeDriver. But it's preferred to create reference variable of WebDriver and cast it 
		//to ChromeDriver class cz WebDriver is the top level interface and ChromeDriver, EdgeDriver, InternetExplorerDriver, FirefoxDriver etc., 
		//are the classes that implement WebDriver interface. If we create ref. variable of ChromeDriver directly, we can't use the ref.variable for
		//cross-browser testing (with diff. browsers) as the ref.variable acts on only ChromeDriver. Refer to the following articles for more info:
		//https://monilnigdi.medium.com/why-we-write-webdriver-driver-new-chromedriver-in-selenium-23e2ef08c54c          https://stackoverflow.com/questions/70974631/what-is-the-difference-between-chromedriver-driver-new-chromedriver-and-web
		
		//driver.get("..") opens a URL. Webdriver waits until the page gets loaded completely and then passes the control to script
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		//driver.navigate().to("..") also opens a URL but doesn't wait until the page gets loaded completely
		driver.navigate().to("https://www.facebook.com");
		
		//maximizes the browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//closes the active window and quits the webdriver. If no window is open, it will throw an error.
		//driver.close();
		//Thread.sleep(2000);
		
		//closes all open windows, pop-ups and sessions, quits webdriver.
		driver.quit();
		
	}

}
