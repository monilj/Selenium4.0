import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class AutomationWithSelenium4 {
    @Test
    public static void relativeLocator() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(with(By.tagName("a")).toRightOf(By.linkText("Gmail"))).click();
        System.out.println("clicked");

        driver.quit();

    }
}
