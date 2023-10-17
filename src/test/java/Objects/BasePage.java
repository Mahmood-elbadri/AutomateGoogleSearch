package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


// result Table (class="aajZCb")
public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
