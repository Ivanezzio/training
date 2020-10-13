package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import helpers.PropertiesHelper;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;




public class TestBase {

    public static PropertiesHelper config;


    @BeforeAll
    public static void beforeAll() {
        config = ConfigFactory.newInstance().create(PropertiesHelper.class, System.getProperties());
       // addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        //Configuration.browser = CustomWebDriver.class.getName();
        Configuration.baseUrl = config.webUrl();
    }

}