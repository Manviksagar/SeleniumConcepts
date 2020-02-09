import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionSeries {

	public static void main(String[] args) {
		String baseUrl = "http://www.facebook.com/"; 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Va185060\\Desktop\\sag\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();	
		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			.build();
			
		seriesOfActions.perform() ;
		driver.quit();

		}
}