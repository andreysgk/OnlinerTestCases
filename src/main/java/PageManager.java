import org.openqa.selenium.WebDriver;

public class PageManager {
    public MainPage mainPageTest;
    public CatalogPage catalogPageTest;
    public CartPage cartPageTest;
    public PageManager(WebDriver driver){
        mainPageTest = new MainPage(driver);
        catalogPageTest = new CatalogPage(driver);
        cartPageTest = new CartPage(driver);
    }
}
