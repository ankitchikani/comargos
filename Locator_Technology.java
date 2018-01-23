package page_object;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locator_Technology extends BaseTest_Argos {
    public void myTest() {
        driver.findElement(By.cssSelector("a[href=\"/browse/technology/televisions-and-accessories/hdmi-cables-and-optical-cables/c:30103/\"]")).click();

        // TO FIND OUT PRODUCTS AE IN SPECIFIC PRICE RANGE
        // driver.findElement(By.xpath("html/body/div[1]/div/div/div[4]/div/div[4]/div[1]/div[1]/div/div[1]/div[1]/div/div[4]/div/div/ul/li[4]/label")).click();
    }

    public void CustomerRating() {
        driver.findElement(By.cssSelector("label[for=\"filter-customer-rating-5\"]")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertTrue(actual.endsWith("hdmi-cables-and-optical-cables/c:30103/customer-rating:5/"));
    }
}
