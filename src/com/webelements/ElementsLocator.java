package com.webelements;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\18178\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");

		// Inspecting Search box with different attributes.
		// By ID
		driver.findElement(By.id("search-inp")).sendKeys("Selenium");

		// By CssSelector
		driver.findElement(By.cssSelector("#search-inp")).sendKeys("Selenium");

		// By Xpath
		driver.findElement(By.xpath("//*[@id=\'search-inp\']")).sendKeys("Selenium");

		// Inspected Log In Button with Link text
		driver.findElement(By.linkText("Log In")).click();

		// Inspected Log In Button with partial Link Text
		driver.findElement(By.partialLinkText("Log")).click();

		WebElement SearchBarid = driver.findElement(By.id("search-inp"));
		System.out.println(SearchBarid.getAttribute("id"));
		WebElement SearchBarClass = driver.findElement(By.className("trackButton"));
		System.out.println(SearchBarClass.getAttribute("className"));
		WebElement SearchBarName = driver.findElement(By.name("user_v1[query]"));
		System.out.println(SearchBarName.getAttribute("name"));

	}
}