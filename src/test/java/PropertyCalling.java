
import java.io.FileInputStream;		
import java.io.FileNotFoundException;		
import java.io.IOException;		
import java.util.Properties;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class PropertyCalling {				

public static void main(String[] args) throws IOException, InterruptedException {										
	
// Create WebDriver Instance		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Va185060\\Desktop\\sag\\chromedriver.exe");					
    WebDriver driver = new ChromeDriver();				
    driver.get("http://demo.guru99.com/test/guru99home/");					
    driver.manage().window().maximize();			
// Load the properties File		
    Thread.sleep(3000);
    Properties obj = new Properties();					
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");									
    obj.load(objfile);					
// Nagigate to link Mobile Testing and Back		
    driver.findElement(By.xpath(obj.getProperty("MobileTesting"))).click();							
    driver.navigate().back();			
// Enter Data into Form		
    driver.findElement(By.id(obj.getProperty("EmailTextBox"))).sendKeys("testguru99@gmail.com");									
    driver.findElement(By.id(obj.getProperty("SignUpButton"))).click();							
  }		

}		
