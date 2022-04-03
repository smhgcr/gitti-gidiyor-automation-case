import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.DirContext;

public class Navbar extends BasePage {

    By searchBoxLocator =  By.xpath("//input[@type='text']");
    By searchButtonLocator = By.xpath("//button[contains(@data-cy,'search-find-button')]");

    By cartCountIconLocator = new By.ByCssSelector("span.basket-item-count");
    By cartContainerLocator = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a");


    public Navbar(WebDriver driver) {
        super(driver);
    }

    public void search(String text){
        type(searchBoxLocator, text);
        click(searchButtonLocator);
    }


    public boolean isProductCountUp() {

        return getCartCount()>0;
    }

    public boolean checkIfProductAdded() {
        return false;
    }

    public void gotToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountIconLocator).getText();
        return Integer.parseInt(count);
    }
}
