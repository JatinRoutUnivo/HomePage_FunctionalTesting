import org.asynchttpclient.netty.ws.NettyWebSocket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AmityWebsite_Beta\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://amityonline.com/");
		Thread.sleep(2000);
		Actions act7=new Actions(driver);
		act7.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='show more']"))).click().perform();
		Thread.sleep(2000);
driver.findElement(By.xpath("//a[normalize-space()='Bachelor of Computer Applications']")).click();
	
		
		
		
	}

}
