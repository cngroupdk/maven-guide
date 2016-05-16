package dk.cngroup.javacomp;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class ExampleSeleniumTest {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
        //PhantomJsDriverManager.getInstance().setup();
    }

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        //driver = new PhantomJSDriver();
        driver.get("http://localhost:8080");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void shoudGreetAnonymous() throws InterruptedException {
        driver.findElement(By.id("btn1")).click();
        Thread.sleep(1000L);
        String display = driver.findElement(By.id("display")).getText();
        assertEquals("Generated greeting: Hello anonymous!", display);
    }

    @Test
    public void shouldGreetJohny() throws InterruptedException {
        driver.findElement(By.id("input")).sendKeys("Johny");
        driver.findElement(By.id("btn2")).click();
        Thread.sleep(1000L);
        String display = driver.findElement(By.id("display")).getText();
        assertEquals("Generated greeting: Hello Johny!", display);
    }

}
