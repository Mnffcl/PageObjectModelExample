package Eclipse_To_Git;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Eclipse_To_Git {
	
	
	@Test
	public void login() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		driver.findElement(By.id("username")).sendKeys("manivannans992@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Manivan@321#");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
	}

}

