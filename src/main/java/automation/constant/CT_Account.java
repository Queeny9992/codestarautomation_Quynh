package automation.constant;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

public class CT_Account {

	public static String webURL = "https://rise.fairsketch.com/signin";	
	public static By TEXTBOX_EMAIL = By.id("email");
	public static By TEXTBOX_PASS = By.id("password");
	public static By BTN_LOGIN = By.xpath("//button[@type='submit' and text()='Sign in']");
}
	