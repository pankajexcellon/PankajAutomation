package base;

import com.microsoft.playwright.Page;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.PlaywrightFactory;

public class BaseTest {

    protected Page page;

    @BeforeClass
    public void setup() {
        page = PlaywrightFactory.initBrowser();
    }

    @AfterClass
    public void tearDown() {
        PlaywrightFactory.closeBrowser();
    }
}
