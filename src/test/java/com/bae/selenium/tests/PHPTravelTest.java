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
		WebElement searchCity = driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a"));
		searchCity.click();
		searchCity.sendKeys("London");
		waitPHP.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")));
		searchCity = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div"));
		searchCity.click();
		// WebElement setStartDate

	}
}
