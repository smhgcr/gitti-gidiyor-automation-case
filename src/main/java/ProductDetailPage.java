import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator = By.xpath("//*[@id=\"sp-addbasket-button\"]/form");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        find(addToCartButtonLocator);
    }

}
