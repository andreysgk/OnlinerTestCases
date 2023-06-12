import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPage extends Base{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    private final By titleCartLocator = By.xpath("//div[contains(@class,'cart-form__title')]");
    private final By addedProductLocator = By.xpath("//div[@class='cart-form__offers-flex']//a[contains(text(),'Samsung Galaxy')]");
    private final By deleteIconLocator = By.xpath("//a[contains(@class,'button_remove')]");
    private final By closeButtonLocator = By.xpath("//a[contains(@class,'cart-form__link_small')][contains(text(),'Закрыть')]");
    private final By yourShoppingCartIsEmptyLocator = By.xpath("//div[@class='cart-message__title cart-message__title_big']");

    public String getNameTittleCart(){
        waitVisibility(titleCartLocator);
        return driver.findElement(titleCartLocator).getText();
    }

    public String getNameAddedProduct(){
        waitVisibility(addedProductLocator);
        return driver.findElement(addedProductLocator).getText();
    }

    public CartPage cursorOverTheProduct(){
        WebElement element = driver.findElement(addedProductLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        return this;
    }

    public CartPage deleteIconButton(){
        waitVisibility(deleteIconLocator);
        driver.findElement(deleteIconLocator).click();
        return this;
    }

    public CartPage closeButton(){
        waitVisibility(closeButtonLocator);
        driver.findElement(closeButtonLocator).click();
        return this;
    }

    public String messageYourShoppingCartIsEmpty(){
        waitVisibility(yourShoppingCartIsEmptyLocator);
        return driver.findElement(yourShoppingCartIsEmptyLocator).getText();
    }
}
