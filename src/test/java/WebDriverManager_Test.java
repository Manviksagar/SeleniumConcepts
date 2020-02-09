import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import com.sag.pages.GooglePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();	
//        Thread.sleep(3000);
//        driver.get("http://www.google.com");         
//        WebElement element = driver.findElement(By.name("q"));	
//        element.sendKeys("Guru99");					
//        element.submit();         			
//        System.out.println("Page title is: " + driver.getTitle());		
//        driver.quit();
        //driver.get("http://www.google.com");
        GooglePage gp =new GooglePage(driver);
        gp.searchGoogle("Vidyasagar");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
        
}		

	}


