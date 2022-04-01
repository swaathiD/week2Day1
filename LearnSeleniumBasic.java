package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SDcompany");
driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("TELC");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swaathi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devaraj");
WebElement dropDown =driver.findElement(By.id("createLeadForm_dataSourceId"));
Select source=new Select(dropDown);
source.selectByVisibleText("Conference");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nilan");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ramkumar");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSC");
driver.findElement(By.name("description")).sendKeys("computer science");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("swaathidevaraj@gmail.com");
WebElement dropState=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select state=new Select(dropState);

state.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();
System.out.println("the title is:"+driver.getTitle());

	}

}
