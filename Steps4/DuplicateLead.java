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

public class DuplicateLead extends BaseClass {
	
	
	@And ("Select the Email Tab and enter EmailId")
	public void Select_emailTab_and_enter_EmailId() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element'])[22]/input")).sendKeys("ram");
		Thread.sleep(3000);
	}
	@And ("Select Find Lead link")
	public void Select_FindLead_link()
	{
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
	}
	@And ("Capture the name of the first resulting Lead")
	public void Capture_first_resulting_Lead() throws InterruptedException
	{
		String name = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		System.out.println("The name of the persion is " +name);
		Thread.sleep(2000);
	}
	@And ("Select the LeadID of the first resulting Lead")
	public void Select_LeadID()
	{
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
	}
	@Then ("Capture the Page title")
	public void Capture_Page_title()
	{
	title = driver.getTitle();
	}
	@Then ("Verification of the title")
	public void Verify_title()
	{
		if (title.contains("Duplicate Lead"))
			System.out.println("The title is "+ title);
			else
				System.out.println("The title is not correct");
				
			driver.close();
	}

}