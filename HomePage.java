package page_object;

import org.openqa.selenium.By;

public class HomePage extends BaseTest_Argos
{
    public String getHomePageCurrentURl()
        {
            return driver.getCurrentUrl();
        }
}
