package UseOfData;

import org.testng.annotations.Test;
import dataproviders.STRDataProvider;
 
public class UseProviderData {
 
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
        System.out.println(source + " -> " + source);
        System.out.println(source + " -> " + productType);
        System.out.println(source + " -> " + qty);
        
    }
}