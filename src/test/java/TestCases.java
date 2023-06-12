
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestCases extends BaseTest{
    @Test
    @DisplayName("Search products")
    public void searchProduct(){
        pageManager.mainPageTest.enterValidValue("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)")
                .iframeSearch()
                .clickOnProduct();
            Assertions.assertEquals("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)",pageManager.catalogPageTest.getNameProduct());
    }

    @Test
    @DisplayName("Adding the product into the cart from product’s page")
    public void AddingProductIntoTheCart(){
        pageManager.mainPageTest.enterValidValue("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)")
                .iframeSearch()
                .clickOnProduct();
            Assertions.assertEquals("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)",pageManager.catalogPageTest.getNameProduct());
            Assertions.assertEquals("Характеристики", pageManager.catalogPageTest.checkModuleDescription());
        pageManager.catalogPageTest.firstButtonAddToCart(0);
            Assertions.assertEquals("Продолжить покупки", pageManager.catalogPageTest.getNameButtonContinueShopping());
            Assertions.assertEquals("Перейти в корзину", pageManager.catalogPageTest.getNameButtonGoToCart());
            Assertions.assertEquals("Товар добавлен в корзину", pageManager.catalogPageTest.getNameProductAddedToCart());
            Assertions.assertEquals("1", pageManager.catalogPageTest.getIconValueOfCountShoppingCart());
    }

    @Test
    public void AddedProductIsDisplayedInTheCart(){
        pageManager.mainPageTest.enterValidValue("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)")
                .iframeSearch()
                .clickOnProduct();
            Assertions.assertEquals("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)",pageManager.catalogPageTest.getNameProduct());
        pageManager.catalogPageTest.firstButtonAddToCart(0);
            Assertions.assertEquals("Товар добавлен в корзину", pageManager.catalogPageTest.getNameProductAddedToCart());
            Assertions.assertEquals("1", pageManager.catalogPageTest.getIconValueOfCountShoppingCart());
        pageManager.catalogPageTest.clickButtonGoToCart();
            Assertions.assertEquals("Корзина", pageManager.cartPageTest.getNameTittleCart());
            Assertions.assertEquals("Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)", pageManager.cartPageTest.getNameAddedProduct());
    }

    @Test
    public void RemovingProductFromTheCart(){
        pageManager.mainPageTest.enterValidValue("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)")
                .iframeSearch()
                .clickOnProduct();
        pageManager.catalogPageTest.firstButtonAddToCart(0)
                .clickButtonGoToCart();
            Assertions.assertEquals("Корзина", pageManager.cartPageTest.getNameTittleCart());
            Assertions.assertEquals("Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)", pageManager.cartPageTest.getNameAddedProduct());
        pageManager.cartPageTest.cursorOverTheProduct()
                .deleteIconButton()
                .closeButton();
            Assertions.assertEquals("Ваша корзина пуста", pageManager.cartPageTest.messageYourShoppingCartIsEmpty());
    }

}
