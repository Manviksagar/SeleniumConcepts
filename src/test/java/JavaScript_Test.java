	import org.openqa.selenium.By;		
	import org.openqa.selenium.JavascriptExecutor;		
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;		
	    		
	public class JavaScript_Test {				


	    @Test		
	    public void Login() throws InterruptedException 					
	    {		
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Va185060\\Desktop\\sag\\chromedriver.exe");					
	          WebDriver driver = new ChromeDriver();			
	        		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("http://demo.guru99.com/V4/");			
	        		
	        WebElement button =driver.findElement(By.name("btnLogin"));			
	        		
	        //Login to Guru99 		
	        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
	        driver.findElement(By.name("password")).sendKeys("amUpenu");					
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", button);
	         Thread.sleep(2000);
	        //To generate Alert window using JavascriptExecutor. Display the alert message 			
	        js.executeScript("alert('Welcome to Guru99');");  
	        
	        driver.quit();
	    		
	    }		
	}
