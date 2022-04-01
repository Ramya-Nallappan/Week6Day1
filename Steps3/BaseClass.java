package Steps3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {

	public static ChromeDriver driver ;
	@BeforeMethod
	public void preCondition()
    {
		
				WebDriverManager.chromedriver().setup();
				System.out.println(driver);
				driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");			
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}




/*NullPointer exception will be thrown if static keyword not used- driver initialisation is done
   in Login.java whereas it is not done in CreateLead.java
   session id will be created while running  Login.java and it is set back to null
    while running CreateLead.java
   */
