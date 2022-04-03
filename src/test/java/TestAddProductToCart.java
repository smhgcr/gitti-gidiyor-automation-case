import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TestAddProductToCart extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    Navbar navbar;
    CartPage cartPage;

    @Test
    @Order(1)
    public void searchAProduct() {
        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        homePage.navbar().search("bilgisayar");
    }

   /* @Test
    @Order(2)
    public void goToSelectedPagination() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.goToPagination(2);
        Assertions.assertTrue(productsPage.isOnTruePage(),
                "Not on true page");
    }
*/
    @Test
    @Order(2)
    public void selectAProduct() {
        ProductsPage productsPage = new ProductsPage(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page");
    }

    @Test
    @Order(3)
    public void writeAProductInfo() {

    }

    @Test
    @Order(4)
    public void addProductToCart() {
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        Navbar navbar = new Navbar(driver);
        productDetailPage.addToCart();
        Assertions.assertTrue(navbar.isProductCountUp(),
                "Product count did not increase");
    }

    @Test
    @Order(6)
    public void goToCart() {
        Navbar navbar = new Navbar(driver);
        navbar.gotToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),
                "Product was not add to cart");
    }

}

