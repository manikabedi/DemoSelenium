package demo.edureka.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikabedi\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("manikabedi@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		String expected_title = "gmail";
		
		if (title.equalsIgnoreCase(expected_title))
		{
			System.out.println("Test SUCCESS");
		}
		else
		{
			System.out.println("Test FAILED");
		}
		
	}

}
