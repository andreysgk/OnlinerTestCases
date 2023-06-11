import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Catalog extends Base{
    public Catalog(WebDriver driver) {
        super(driver);
    }
    private final By nameProductLocator = By.xpath("//div[@class='catalog-masthead']//h1");
    private final By checkModuleDescriptionLocator = By.xpath("//table[@class ='product-specs__table']");
    private final By addToCartButtonLocator = By.xpath("//a[@data-position-id='707:2227254001'][text()='В корзину']");
    private final By closeLocator = By.xpath("//div[@class='product-recommended__sidebar-close']");
    private final By goToCartLocator = By.xpath("//a[@class='button-style button-style_another button-style_base-alter product-recommended__button']");
    private final By continueShoppingLocator = By.xpath("//a[@class='button-style button-style_auxiliary button-style_base-alter product-recommended__button helpers_hide_tablet']");
    private final By productAddedToCartLocator = By.xpath("//div[@class='product-recommended__subheader'][1]");

    public String getNameProduct(){
        return driver.findElement(nameProductLocator).getText();
    }
    public Catalog checkModuleDescription(){
        WebElement element = driver.findElement(checkModuleDescriptionLocator);
        assert element.isDisplayed();
        return this;
    }

    public Catalog addToCartButton(){
        driver.findElement(addToCartButtonLocator).click();
        return this;
    }

    public Catalog closeTheBoxWithProduct(){
        driver.findElement(closeLocator).click();
        return this;
    }

    public String getNameButtonGoToCart(){
        waitVisibility(goToCartLocator);
        return driver.findElement(goToCartLocator).getText();
    }

    public String getNameButtonContinueShopping(){
        waitVisibility(continueShoppingLocator);
        return driver.findElement(continueShoppingLocator).getText();
    }

    public String getNameproductAddedToCart(){
        waitVisibility(productAddedToCartLocator);
        return driver.findElement(productAddedToCartLocator).getText();
    }

}
