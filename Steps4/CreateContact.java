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

public class CreateContact extends BaseClass{

	 
	 @And("Select Contacts Button")
	public void selectContactsButton()
	{
		driver.findElement(By.linkText("Contacts")).click();
		
	}
	 @And ("Select Create Contact button")
	 public void select_Create_ContactsButton()
		{
		 driver.findElement(By.linkText("Create Contact")).click();
			
		}
	
	@And("Enter FirstName1 Field")
	public void enterFirstName1()
	{
		driver.findElement(By.id("firstNameField")).sendKeys("Ramya");
	}
	@And("Enter LastName1 Field")
	public void enterLastName1()
	{
		driver.findElement(By.id("lastNameField")).sendKeys("N");
	}
	@And("Enter the Department1 Field")
	public void enterDepartmentName1()
	{
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
	}
	@And("Enter the Email id1 Field")
	public void enterEmailid1()
	{
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ramya19.nallappan@gmail.com");
	}
	@And("Select State-Province1 as NewYork")
	public void StateProvince1()
	{
		WebElement elementState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementState);
		dd.selectByVisibleText("New York");
	}
	@When("Select Create Contact")
	public void selectCreateContactButton()
	{
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}
	@Then("Contact should be created")
	public void verifyContactCreation()
	{
		System.out.println("The title of the page is :" + driver.getTitle());
		driver.close();
	}
	
	 

}
