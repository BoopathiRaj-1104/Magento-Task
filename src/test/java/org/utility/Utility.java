package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver;
	public static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Edge":

			driver = new EdgeDriver();
			break;
		}
	}
		
		public static void refresh() {
			driver.navigate().refresh();
		}

		public static void getUrl(String url) {
			driver.get(url);
		}

		public static void winMax() {
			driver.manage().window().maximize();
		}

		public static void sendText(WebElement element, String keysToSend) {
			element.sendKeys(keysToSend);
		}
	}


