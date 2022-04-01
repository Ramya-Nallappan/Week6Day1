package Steps4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass {
	

	      
    @And ("Enter FirstName in searchfield")
    public  void Enter_FirstName_searchField() 
	{
    	driver.findElement(By.xpath("(//label[@class= 'x-form-item-label'])[19]/following::input")).sendKeys("Ramya");
		

	}
    @And ("Enter LastName Field in searchfield")
    public  void Enter_LastName_searchField() 
   	{
    	driver.findElement(By.xpath("(//div[@class= 'x-form-element'])[20]//input")).sendKeys("N");

   	}
    @And ("Select Find Lead")
    public  void Select_Find_Lead() throws InterruptedException 
   	{
    	driver.findElement(By.xpath("(//button[@type= 'button'])[7]")).click();
		Thread.sleep(2000);

   	}
    @And ("Select the first resulting Lead")
    public  void Select_first_resulting_Lead() 
   	{
    	driver.findElement(By.xpath("(//a [@class= 'linktext'])[4]")).click();
		System.out.println("The title of the page is :" +driver.getTitle());

   	}
    @And ("Select edit button")
    public  void Select_edit_button() 
   	{
    	driver.findElement(By.linkText("Edit")).click();

   	}
    @And ("clear the Company Name")
    public  void Clear_Company_Name() 
   	{
    	driver.findElement(By.id("updateLeadForm_companyName")).clear();

   	}
    @And ("add the Company Name")
    public void Add_Company_Name() 
   	{

		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");;
		
		

   	}
    @And ("capture the updated Company Name")
    public void Capture_Updated_CompanyName() throws InterruptedException 
   	{
    updatedCompanyName =driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("value");
    System.out.println("The updated company name is " +updatedCompanyName );
	Thread.sleep(2000);
   	}
    @When ("select update button")
    public  void Select_update_button() 
   	{
    	driver.findElement(By.xpath("(//input[@type= 'submit'])[1]")).click();

   	}
    @Then("verify the updated Company Name")
    
    public  void verify_updated_CompanyName () 
   	{
       
		String storedCompanyName = driver.findElement(By.xpath("(//span[@class = 'tabletext'])[3]")).getText();
		System.out.println("The stored Company name is " +storedCompanyName);
		if (updatedCompanyName.contains("Google"))
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
		driver.close();

   	}
}