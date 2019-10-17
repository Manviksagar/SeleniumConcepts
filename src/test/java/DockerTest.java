import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DockerTest {

	@Test
    public void firsttTest () throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = DesiredCapabilities.chrome();
			URL url=new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("https://www.google.com");
		String title = driver.getTitle();

        //Print page's title
        System.out.println("Page Title: " + title);

        //Assertion
        Assert.assertEquals(title, "Google", "Title assertion is failed!");
        driver.quit();

	}

}
