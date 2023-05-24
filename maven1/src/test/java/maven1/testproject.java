package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testproject {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://demo4.tvenka.com/");
		
		driver.findElement(By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input\"]")).sendKeys("support");
		
		driver.findElement(By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained jss154 MuiButton-containedPrimary MuiButton-fullWidth\"]")).click();
		
		Thread.sleep(5000);
	}

}
