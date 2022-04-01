package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SDcompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swaathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devaraj");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RAM");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSC");
		driver.findElement(By.name("description")).sendKeys("IT department");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("devarajsw@gmail.com");
		WebElement dropStat= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select source=new Select(dropStat); 
		source.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("the title is:"+driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("nothing to say");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("the title is:"+driver.getTitle());
		
		
		
		//driver.findElement(By.linkText("Duplicate Lead")).click();
		//driver.findElement(By.id("createLeadForm_companyName")).clear();
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DOLOLO");
		
		
		
	}

}
