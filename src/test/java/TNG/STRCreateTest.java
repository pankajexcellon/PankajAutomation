package TNG;
 
import org.testng.annotations.Test;

import dataproviders.STRDataProvider;
 
public class STRCreateTest {
 
    @Test(

        dataProvider = "strData",

        dataProviderClass = STRDataProvider.class,

        groups = {"regression"}

    )

    public void createSTRTest(

            String source,

            String destination,

            String productType,

            int qty) {
 
        System.out.println(source + " -> " + destination);

    }

}

 