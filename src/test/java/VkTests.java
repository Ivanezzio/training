package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("vk_tests")

public class VkTests  {
    @Test
    void vkLoginTest() {
        Configuration. holdBrowserOpen = true;

        open("https://vk.com/");
        $(byId("index_email")).setValue("allcats@ggmail.com");
        $(byId("index_pass")).setValue("11111111");
        $(byId("index_login_button")).click();
        $(byId("recaptcha-anchor")).click();


    }
}


