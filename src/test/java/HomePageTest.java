import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private static final String GOOGLE_URL = "http://www.google.com";

    @Test
    public void checkHomePage() {
        driver.get(GOOGLE_URL);
        WebElement element = driver.findElement(By.name("q"));
        Assert.assertTrue(element.isEnabled());
    }

    @Test
    public void CheckHomePageSearch() {
        driver.get(GOOGLE_URL);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("I am rock");
        element.submit();
    }
}
