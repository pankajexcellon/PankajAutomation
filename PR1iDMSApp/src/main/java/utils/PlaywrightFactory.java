package utils;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    protected static Playwright playwright;
    protected static Browser browser;
    protected static BrowserContext context;
    protected static Page page;

    public static Page initBrowser() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setArgs(java.util.Arrays.asList("--start-maximized"))
        );

        // 👇 KEY LINE: disable viewport to allow maximized window
        context = browser.newContext(
                new Browser.NewContextOptions()
                        .setViewportSize(null)
        );

        page = context.newPage();
        return page;
    }

    public static void closeBrowser() {
        context.close();
        browser.close();
        playwright.close();
    }
}
