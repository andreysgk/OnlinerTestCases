
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestCases extends BaseTest{
    WebDriver driver;
    @Test
    @DisplayName("Search products")
    public void searchProduct(){
        pageManager.mainPageTest.enterValidValue("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)")
                .iframeSearch()
                .clickOnProduct();
            Assertions.assertEquals("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)",pageManager.catalogTest.getNameProduct());
    }

    @Test
    @DisplayName("Adding the product into the cart from product’s page")
    public void AddingProductIntoTheCart(){
        pageManager.mainPageTest.enterValidValue("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)")
                .iframeSearch()
                .clickOnProduct();
            Assertions.assertEquals("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)",pageManager.catalogTest.getNameProduct());
            Assertions.assertEquals("Характеристики", pageManager.catalogTest.checkModuleDescription());
        pageManager.catalogTest.addToCartButton();
            Assertions.assertEquals("Продолжить покупки", pageManager.catalogTest.getNameButtonContinueShopping());
            Assertions.assertEquals("Перейти в корзину", pageManager.catalogTest.getNameButtonGoToCart());
            Assertions.assertEquals("Товар добавлен в корзину", pageManager.catalogTest.getNameproductAddedToCart());
        pageManager.catalogTest.closeTheBoxWithProduct();
            Assertions.assertEquals("1", pageManager.catalogTest.getIconValueOfCountShoppingCart());

    }

}
