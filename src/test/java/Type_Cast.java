import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Type_Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rate=2;
		WebDriverManager.chromedriver().setup();
		//System.out.println(System.getProperty("java.library.path"));
		
		WebDriver driver	= new ChromeDriver();

	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).sendKeys(String.valueOf(rate));

		
		
	}

}
