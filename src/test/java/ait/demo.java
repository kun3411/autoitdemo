package ait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://omayo.blogspot.com/");
		
		Actions a = new Actions(d);
		//WebDriverWait wait = new WebDriverWait(d,30);
		//WebElement we = d.findElement(By.id("uploadfile"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadfile")));
		//Time.sleep();
		Thread.sleep(3000);
		a.moveToElement(d.findElement(By.id("uploadfile"))).click().build().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Autoitdemo\\autoitfolder\\browsingesxcelfile.exe");
		

	}

}
