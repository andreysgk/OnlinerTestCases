import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchProductsTest extends BaseTest{
    @Test
    public void searchProduct(){
        pageManager.mainPageTest.enterValidValue("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)")
                .iframeSearch()
                .clickOnProduct();
        Assertions.assertEquals("Смартфон Samsung Galaxy A52 SM-A525F/DS 4GB/128GB (черный)",pageManager.catalogTest.getNameProduct());
    }

}
