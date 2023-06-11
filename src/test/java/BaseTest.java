import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest{
    PageManager pageManager;
    WebDriver driver;

    @BeforeAll
    public static void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\raphi\\browsers\\chromedriver.exe");
    }
    @BeforeEach
    public void urlMain(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
//        driver.get("https://www.onliner.by/");
        driver.get("https://catalog.onliner.by/mobile/samsung/sma525fzkdser");
        driver.manage().window().maximize();
        pageManager = new PageManager(driver);
    }
}
