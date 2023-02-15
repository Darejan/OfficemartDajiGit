package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    @BeforeTest(description = "Configure and open browser before tests")
    public static void setUp(){
        Selenide.open("https://officemart.ge/");
        Configuration.browserSize = "1920x1080";
    }

    @AfterTest(description = "Clear cash and cookies after tests")
    public static void clearBrowser(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
    }
}
