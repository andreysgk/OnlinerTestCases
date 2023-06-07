import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    protected WebDriver driver;
//    protected WebDriverWait wait;
    public Base(WebDriver driver){
        this.driver=driver;
    }
//    protected void waitVisibility(By locator){
//        wait.until(ExpectedConditions.elementToBeClickable(locator));
//    }
}
