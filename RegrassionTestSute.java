package myargos;

import org.junit.Test;
import page_object.BaseTest_Argos;
import page_object.Locator_Homepage;
import page_object.Locator_Technology;

public class RegrassionTestSute extends BaseTest_Argos {

    Locator_Homepage locator=new Locator_Homepage();


    /*@Test
    public void home(){
        locator.doSearch("laptop");
    }*/

    @Test
    public void Technology(){
        locator.projectElements("technology");
        new Locator_Technology().myTest();
        new Locator_Technology().CustomerRating();

    }

}
