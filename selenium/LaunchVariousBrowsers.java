package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchVariousBrowsers {

	public static void main(String[] args) {
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
		
		//dirver.get("..") opens a URL. Webdriver waits until the page gets loaded completely and then passes the control to script
		driver.get("https://www.google.com");
		
		

	}

}
