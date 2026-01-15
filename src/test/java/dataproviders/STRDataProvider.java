package dataproviders;

import org.testng.annotations.DataProvider;

public class STRDataProvider {

    @DataProvider(name = "strData")
    public static Object[][] getSTRData() {
        return new Object[][]{
            {"Branch-A", "Warehouse-B", "Part", 5},
            {"Branch-C", "Warehouse-D", "Vehicle", 1}
        };
    }
}