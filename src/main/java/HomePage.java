import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public Navbar navbar;


    public HomePage(WebDriver driver) {
        super(driver);
        navbar = new Navbar(driver);
    }

    public Navbar navbar() {
        return this.navbar;
    }
}
