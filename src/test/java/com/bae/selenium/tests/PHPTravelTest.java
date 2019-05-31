package com.bae.selenium.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravelTest {
	public static WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void phpTest() {
		driver.get("https://www.phptravels.net/");
		WebDriverWait waitPHP = new WebDriverWait(driver, 20);
		WebElement searchPHP = driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a"));
		searchPHP.click();
		searchPHP.sendKeys("London");
		waitPHP.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")));
		searchPHP = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div"));
		searchPHP.click();
		searchPHP = driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input"));
		searchPHP.click();
		searchPHP = driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[6]/td[4]"));
		searchPHP.click();
		searchPHP = driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[2]/td[6]"));
		searchPHP.click();
		searchPHP = driver.findElement(By.xpath("//*[@id=\"hotels\"]/form/div[5]/button"));
		searchPHP.click();

		// searchPHP =
		// driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]"));
		// searchPHP.click();
		// searchPHP.sendKeys("London");
		// waitPHP.until(ExpectedConditions
		// .visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")));
		// searchPHP =
		// driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div"));
		// searchPHP.click();
		// searchPHP = driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input"));
		// searchPHP.click();
		// searchPHP =
		// driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[6]/td[4]"));
		// searchPHP.click();
		// searchPHP =
		// driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[2]/td[6]"));
		// searchPHP.click();
		// searchPHP =
		// driver.findElement(By.xpath("//*[@id=\"hotels\"]/form/div[5]/button"));
		// searchPHP.click();

	}
}
