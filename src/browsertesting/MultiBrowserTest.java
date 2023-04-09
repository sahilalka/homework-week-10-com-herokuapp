package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        // Get the title of the page
        System.out.println( driver.getTitle());
        System.out.println("Current URL  :  "   + driver.getCurrentUrl());

        // Get page source
        System.out.println("Page source :  "  +  driver.getPageSource());

        //Find the username field element
        driver.findElement(By.name("username")).sendKeys("prime123");

        driver.findElement(By.name(("password"))).sendKeys("prime123");
        driver.close();


    }







}


