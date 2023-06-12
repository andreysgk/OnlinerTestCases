import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Base{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By fastSearchLocator = By.className("fast-search__input");
    private final By iframeSearchLocator = By.className("modal-iframe");
    private final By firstProductLocator = By.xpath("//ul[@class='search__results']");
    public MainPage enterValidValue(String value){
        driver.findElement(fastSearchLocator).sendKeys(value);
        return this;
    }

    public MainPage iframeSearch(){
        WebElement element = driver.findElement(iframeSearchLocator);
        driver.switchTo().frame(element);
        return this;
    }
    public MainPage clickOnProduct(){
        waitVisibility(firstProductLocator);
        driver.findElement(firstProductLocator).click();
        return this;
    }



}
