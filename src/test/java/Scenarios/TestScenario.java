package Scenarios;

import Objects.GooglePage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.FileReader;
import java.sql.Driver;
import java.time.Duration;

public class TestScenario {
    GooglePage google;
    WebDriver driver;
    String word;

    @BeforeMethod
    public void beforeRun() {
        driver = new FirefoxDriver();
        google = new GooglePage(driver);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com/");
        word = "Breaking Bad";
    }

    @Test
    public void searchGoogle() throws InterruptedException {
        google.searchAWord(word);
        google.waityasta();
        google.printSearchResults();

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
