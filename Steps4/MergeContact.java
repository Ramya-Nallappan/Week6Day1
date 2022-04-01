package Steps4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact extends BaseClass{
	@And ("Select Merge Contacts") 
	
		public void Select_Merge_Contacts()
		{
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		}
	
	@And ("Select Widget of From Contact")
	public void Select_Widget_of_From_Contact()
	{
		driver.findElement(By.xpath("(//img[@src= '/images/fieldlookup.gif'])[1]")).click();
		//Window Handler
		Set<String> windowHandlesSet = driver.getWindowHandles();
		windowHandleList = new ArrayList<String>(windowHandlesSet);
		newWindow = windowHandleList.get(1);
		driver.switchTo().window(newWindow);
		System.out.println(driver.getCurrentUrl());
	}
	@And ("Select first resulting Lead")
	public void Select_first_resulting_Lead()
	{
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		// to go back to the base window
		driver.switchTo().window(windowHandleList.get(0));
	}
	@And ("Select Widget of To Contact")
	public void Select_Widget_of_To_Contact()
	{
		driver.findElement(By.xpath("(//img[@src= '/images/fieldlookup.gif'])[2]")).click();
		//Window Handler
		Set<String> windowHandlesSet2 = driver.getWindowHandles();
		List<String> windowHandlesList2 = new ArrayList<String> ();
		windowHandlesList2.addAll(windowHandlesSet2);
		String newWindow2 = windowHandlesList2.get(1);
		driver.switchTo().window(newWindow2);
		System.out.println(driver.getCurrentUrl());
	}
	@And ("Select Second Resulting Contact")
	public void Select_Second_Resulting_Contact()
	{
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		// to go back to the base window
		driver.switchTo().window(windowHandleList.get(0));
	}
	@When ("Select Merge button")
	public void Select_Merge_button()
	{
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	}
	@And ("Accept the Alert")
	public void Accept_Alert()
	{
		 //focus on Alert
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("The text in the alert is : " + text);
		 //Accept the Alert
		 alert.accept();
	}
	@Then ("Verify the title of the page")
	public void Verify_title()
	{
		 title = driver.getTitle();
		 System.out.println("The title of the page is : " + title);
		 driver.close();
	}

}
