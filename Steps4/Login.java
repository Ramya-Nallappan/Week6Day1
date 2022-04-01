package Steps4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {

    @Given("A chrome Browser is launched")
	public  void openChromeBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		System.out.println(driver);
		driver = new ChromeDriver();
		}
    @And("Load the Leaftaps url {string}")
	public  void loadURL(String url) 
	{
		driver.get(url);

	}
    @And("Maximize the browser")
    public  void maximizeBrowser() 
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
    @And("Enter the username as {string}")
	public  void enterUsername(String username) 
	{
		driver.findElement(By.id("username")).sendKeys(username);
		

	}
    @And("Enter the password as {string}")
	public  void enterPassword(String password) 
	{
		driver.findElement(By.id("password")).sendKeys(password);

	}
    @And("Select the submit button")
	public  void clicklogin() 
	{
			driver.findElement(By.className("decorativeSubmit")).click();
			}
    @Then ("Verify the Welcomepage")
	 
	 public  void verifyWelcomePage() 
		{
			String title2 = driver.getTitle();
			System.out.println("The title of the page is" +title2);
			}
}