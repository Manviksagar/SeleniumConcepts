import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import io.github.bonigarcia.wdm.WebDriverManager;	

public class Phantom {				
		public static void main(String[] args) throws InterruptedException {
//        	        File file = new File("C:\\Users\\Va185060\\Desktop\\sag\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");				
                    //System.setProperty("phantomjs.binary.path", "C:\\Users\\Va185060\\Desktop\\sag\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
					WebDriverManager.phantomjs().setup();
                    WebDriver driver = new PhantomJSDriver();	
                    Thread.sleep(3000);
                    driver.get("http://www.google.com");         
                    WebElement element = driver.findElement(By.name("q"));	
                    element.sendKeys("Guru99");					
                    element.submit();         			
                    System.out.println("Page title is: " + driver.getTitle());		
                    driver.quit();			
           }		
}