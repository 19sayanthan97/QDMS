package Base;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Initialization {

	
 
	    public static WebDriver driver;
	    public static String URL = "http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/";
	     
	@BeforeSuite
	    public void main() {
	        
	        
	        //Setting system properties of ChromeDriver
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgic\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

	        
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        
	        driver.get(URL);
	    
	    }
	      public void closeChrome(){
	       //driver.quit();
	    }


	}

