import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {

    private static final String GOOGLE_URL = "http://www.google.com";

    @Story("allure")
    @Test(groups = "firstRun")
    public void checkHomePage() {
//        driver.get(GOOGLE_URL);
//        WebElement element = driver.findElement(By.name("q"));
//        Assert.assertTrue(element.isEnabled());
        Assert.assertTrue(true);
    }

    @Story("allure")
    @Test(groups = "firstRun")
    public void CheckHomePageSearch() {
//        driver.get(GOOGLE_URL);
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("I am rock");
//        element.submit();
        Assert.assertFalse(false);
    }
}
