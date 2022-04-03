import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductsPage extends BasePage {

    By productNameLocator = new By.ByCssSelector("li.dyekHG");
    By categoryOptionLocator = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div[1]");

    By paginationLocator = By.xpath("//li[contains(@data-testid,'pagination-list-item')]");
    By selectedPage = By.xpath("//li[contains(@data-testid,'pagination-list-item')]//a[contains(@class,'glRpjV')]");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(categoryOptionLocator);
    }

    public boolean isOnTruePage() {

        return false;
    }

    public void goToPagination(int selectedPageNum) {
        //  //div[contains(@class, 'gEPcey')]//nav//li[contains(@data-testid, 'pagination-list-item')][2]//a[@href]
        By paginationSelector = By.xpath("//nav//li[contains(@data-testid, 'pagination-list-item')]["+selectedPageNum+"]//a[@href]");
        click(paginationSelector);

    }

    public void selectProduct(int i) {

        getAllProducts().get(i).click();

    }

    private List<WebElement> getAllProducts() {
        return findAll(productNameLocator);
    }


}
