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

public class DeleteLead extends BaseClass {
	
	@And ("Select Phone Tab and enter PhoneNumber")
	
	public void Select_PhoneTab_and_enter_PhoneNumber() 
	{
		driver.findElement(By.xpath("(//span[@class = 'x-tab-strip-text '])[2]")).click();
		driver.findElement(By.xpath("(//input[@name = 'phoneNumber'])")).sendKeys("1");
		
		
	}
		
	@And ("Select Find Lead link1")
	public void Select_FindLead_link1() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
		Thread.sleep(1500);
	}
	@And ("Capture lead ID of the first resulting Lead")
	public void Capture_lead_ID() throws InterruptedException
	{
		text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("lead ID of First Resulting lead is " + text);
		Thread.sleep(1000);
	}
	@And ("Select first resulting Lead for deletion")
			public void Select_first_resulting_Lead_for_deletion()
			{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			}
	@When ("Select Delete button")
	public void Select_Delete_button()
	{
		driver.findElement(By.linkText("Delete")).click();
	}
	@And ("Select Find leads link2")
	public void Select_FindLead_link2() throws InterruptedException
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And ("Enter captured lead ID")
	public void Enter_captured_leadID() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		Thread.sleep(1500);
	}
	
	@And ("Click Find leads")
	public void Click_Findleads() throws InterruptedException
	{
		driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		Thread.sleep(1500);
	}
	@Then ("verify the deletion")
	public void verify_deletion()
	{
		//Capture the text "No records to display" in String Variable.
				String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
				//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				if (text2.equals("No records to display"))
					System.out.println("Record is deleted successfully");
				else
					System.out.println("Record is not deleted");
				
				//Close the browser (Do not log out)
				driver.close();
	}
	

   	
}