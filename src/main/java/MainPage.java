import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Base{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By fastSearchLocator = By.className("fast-search__input");
    public MainPage enterValidValue(String value){
        driver.findElement(fastSearchLocator).sendKeys(value);
        return this;
    }

}
