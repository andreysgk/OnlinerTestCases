import org.openqa.selenium.WebDriver;

public class PageManager {
    public MainPage mainPageTest;
    public Catalog catalogTest;
    public PageManager(WebDriver driver){
        mainPageTest = new MainPage(driver);
        catalogTest = new Catalog(driver);
    }
}
