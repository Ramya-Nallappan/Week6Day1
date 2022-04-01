package Steps3;

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

public class CreateLead extends BaseClass {

    @Given("Select the {string} link")
    public  void selectCRMSFAlink(String crmsfavalue) 
	{
		driver.findElement(By.linkText(crmsfavalue)).click();

	}
	 
    @And ("Enter the Company Name")
    public void enterCompnayName()
    {
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    }
    
	@And("Enter FirstName Field")
	public void enterFirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
	}
	@And("Enter LastName Field")
	public void enterLastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
	}
	@And("Enter the Department Field")
	public void enterDepartmentName()
	{
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	}
	@And("Enter the Email id Field")
	public void enterEmailid()
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramya19.nallappan@gmail.com");
	}
	@And("Select State-Province as NewYork")
	public void StateProvince()
	{
		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementState);
		dd.selectByVisibleText("New York");
	}
	@When("Select Create Lead")
	public void selectCreateContactButton()
	{
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}
	@Then("Lead should be created")
	public void verifyContactCreation()
	{
		System.out.println("The title of the page is :" + driver.getTitle());
	}
	
	 

}
