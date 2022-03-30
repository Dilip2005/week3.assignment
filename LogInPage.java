package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//WebDriverManager.chromedriver().setup();

System.setProperty("webdriver.chrome.driver","C:\\Users\\dilip\\Google\\Chrome\\webdriver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DILIP");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KUMAR");
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DILIPKUMAR");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("automation testing");
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dilipkumar@gmail.com");
	
	
	WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
	Select down = new Select (dropDown); 
	
	
          down.selectByVisibleText("New York");

driver.findElement(By.name("submitButton")).click();

System.out.println(driver.getTitle());
	}

}
