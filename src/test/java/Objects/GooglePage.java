package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GooglePage extends BasePage{
    @FindBy(xpath = "//textarea[@id='APjFqb']")
    private WebElement searchBox;
    @FindBy(tagName = "li")
    private List<WebElement> searchResults;

    public GooglePage(WebDriver driver){
        super(driver);
    }
    public void searchAWord(String word) throws InterruptedException {
        searchBox.sendKeys(word);
        Thread.sleep(2_000);
    }

    public void waityasta(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(searchBox));
    }
    public void printSearchResults(){
        for(int i =0;i<searchResults.size();i++){
            System.out.println(searchResults.get(i).getText());
        }
    }
}
