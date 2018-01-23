package page_object;
import java.lang.String;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest_Argos {
    public static WebDriver driver;
    public static WebElement element;
    String openbrowser = "ChromeDriver";

    @Before

    public void browser() {

        switch (openbrowser) {
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ChromeDriver":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "IEbrowser":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                System.out.println("if you want to change browser type then go to BaseTest_Argos class and change from there.");
                driver = new FirefoxDriver();
        }
            driver.get("http://www.argos.co.uk/");
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        @After
        public void Close_Browser () {

           // driver.quit();
        }

    }

