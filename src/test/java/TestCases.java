
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestCases extends BaseTest{
    WebDriver driver;
    @Test
    public void searchProduct(){
        pageManager.mainPageTest.enterValidValue("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)")
                .iframeSearch()
                .clickOnProduct();
        Assertions.assertEquals("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)",pageManager.catalogTest.getNameProduct());
    }

    @Test
    public void AddingProductIntoTheCart(){
        Assertions.assertEquals("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)",pageManager.catalogTest.getNameProduct());
            pageManager.catalogTest.checkModuleDescription()
                    .addToCartButton();
        Assertions.assertEquals("Продолжить покупки", pageManager.catalogTest.getNameButtonContinueShopping());
        Assertions.assertEquals("Перейти в корзину", pageManager.catalogTest.getNameButtonGoToCart());
        Assertions.assertEquals("Товар добавлен в корзину", pageManager.catalogTest.getNameproductAddedToCart());
        pageManager.catalogTest.closeTheBoxWithProduct();

    }

}
