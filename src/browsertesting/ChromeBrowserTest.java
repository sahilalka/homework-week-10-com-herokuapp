package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the url into Browser
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
