import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Catalog extends Base{
    public Catalog(WebDriver driver) {
        super(driver);
    }
    private final By nameProductLocator = By.xpath("//div[@class='catalog-masthead']//h1");
    public String getNameProduct(){
        return driver.findElement(nameProductLocator).getText();

    }
}
