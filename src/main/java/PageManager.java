import org.openqa.selenium.WebDriver;

public class PageManager {
    public MainPage mainPageTest;
    public PageManager(WebDriver driver){
        mainPageTest = new MainPage(driver);
    }
}
