import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogPage extends Base{
    public CatalogPage(WebDriver driver) {
        super(driver);
    }
    private final By nameProductLocator = By.xpath("//div[@class='catalog-masthead']//h1");
    private final By checkModuleDescriptionLocator = By.xpath("//h3[@class ='product-specs__title']");
    private final By closeLocator = By.xpath("//div[@class='product-recommended__sidebar-close']");
    private final By goToCartLocator = By.xpath("//a[@class='button-style button-style_another button-style_base-alter product-recommended__button']");
    private final By continueShoppingLocator = By.xpath("//a[@class='button-style button-style_auxiliary button-style_base-alter product-recommended__button helpers_hide_tablet']");
    private final By productAddedToCartLocator = By.xpath("//div[@class='product-recommended__subheader'][1]");
    private final By autoBarLocator =By.xpath("//div[@class='auth-bar__counter']");
    private final By listButtonAddToCartLocator = By.xpath("//div[@class='product-aside__control product-aside__control_condensed-additional']/a[2]");

    public String getNameProduct(){
        return driver.findElement(nameProductLocator).getText();
    }
    public String checkModuleDescription(){
        return driver.findElement(checkModuleDescriptionLocator).getText();
    }
    public CatalogPage firstButtonAddToCart(int numberButton){
        waitVisibility(listButtonAddToCartLocator);
        List<WebElement> list = driver.findElements(listButtonAddToCartLocator);
        list.get(numberButton).click();
        return this;
    }

    public CatalogPage closeTheBoxWithProduct(){
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

    public String getNameProductAddedToCart(){
        waitVisibility(productAddedToCartLocator);
        return driver.findElement(productAddedToCartLocator).getText();
    }

    public String getIconValueOfCountShoppingCart(){
        waitVisibility(autoBarLocator);
        return driver.findElement(autoBarLocator).getText();
    }

    public CatalogPage clickButtonGoToCart(){
        waitVisibility(goToCartLocator);
        driver.findElement(goToCartLocator).click();
        return this;
    }

}
