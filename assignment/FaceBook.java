package week3.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dilip\\Google\\Chrome\\webdriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
  driver.findElement(By.name("firstname")).sendKeys("Dilip");
  driver.findElement(By.name("lastname")).sendKeys("kumaar");
  driver.findElement(By.name("reg_email__")).sendKeys("1234509876");
  driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("gsu@56lk");
  
  WebElement day = driver.findElement(By.id("day"));
  Select dropDown1= new Select(day);
  dropDown1.selectByVisibleText("20");
  
  WebElement month= driver.findElement(By.id("month"));
  Select dropDown2 = new Select(month);
  dropDown2.selectByVisibleText("May");
  
  WebElement year = driver.findElement(By.id("year"));
  Select dropDown3= new Select(year);
  dropDown3.selectByVisibleText("1998");
  
  driver.findElement(By.xpath("//label[text()='Male']")).click();
  
  driver.findElement(By.name("websubmit")).click();
  driver.getTitle();
  System.out.println("fb page created ");
  
  
   
  
  
		
	}

}
