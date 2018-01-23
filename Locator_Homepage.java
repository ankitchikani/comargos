package page_object;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locator_Homepage extends BaseTest_Argos
{
    public void doSearch(String searchTerm){
        driver.findElement(By.cssSelector("input[id=\"searchTerm\"]")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector(".argos-header__search-button")).click();
    }
    public void projectElements(String str){
        //driver.findElement(By.cssSelector("a[href=\"/browse/technology/c:29949/\"]")).click();
        //System.out.println(str);
        /*driver.findElement(By.cssSelector("a[href=\"/browse/technology/televisions-and-accessories/hdmi-cables-and-optical-cables/c:30103/\"]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div/div[4]/div/div[4]/div[1]/div[1]/div/div[1]/div[1]/div/div[4]/div/div/ul/li[4]/label")).click();
*/
        WebElement element = driver.findElement(By.cssSelector("a[href=\"/browse/technology/c:29949/\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.cssSelector("a[href=\"/browse/technology/televisions-and-accessories/c:29955/\"]")).click();
        String actual= driver.getCurrentUrl();
        Assert.assertTrue(actual.endsWith("televisions-and-accessories/c:29955/"));


    }
}
