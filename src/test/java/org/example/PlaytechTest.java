package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static junit.framework.TestCase.assertTrue;


public class PlaytechTest {
    private WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Test() throws IOException {
        driver.get("https://playtech.ee/");
        driver.manage().window().maximize();
        //Use coordinates to click on the tab at main task step2.
        driver.findElement(By.xpath("//a[contains(text(),'Who we are')]")).click();

        // Verify if the "Global presence" is shown on the page
        boolean isGlobalPresenceDisplayed = driver.getPageSource().contains("Global presence");

        // Bonus task 2: Export result of main task step 3 as .txt file
        File outputFile = new File("global_presenceEN.txt");
        FileWriter writer = new FileWriter(outputFile);
        if (isGlobalPresenceDisplayed) {
            writer.write("Global presence is shown on the page.");
        } else {
            writer.write("Global presence is not shown on the page.");
        }
        writer.close();

        assertTrue("Global presence is shown on the page.", isGlobalPresenceDisplayed);

    }

    @Test
    public void TestWithLanguage() throws IOException {
        driver.get("https://playtech.ee/");
        driver.manage().window().maximize();
        {
            WebElement element = driver.findElement(By.xpath("/html/body/header/div/div/div"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.xpath("//a[contains(text(),\'ET\')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Meist')]")).click();

        // Verify if the "Global presence" is shown on the page
        boolean isGlobalPresenceDisplayed = driver.getPageSource().contains("Global presence");
        // Bonus task 2: Export result of main task step 3 as .txt file
        File outputFile = new File("global_presenceET.txt");
        FileWriter writer = new FileWriter(outputFile);
        if (isGlobalPresenceDisplayed) {
            writer.write("Global presence is shown on the page.");
        } else {
            writer.write("Global presence is not shown on the page.");
        }
        writer.close();
        assertTrue("Global presence is shown on the page.", isGlobalPresenceDisplayed);


    }
}

