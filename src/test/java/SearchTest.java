import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    public void searchTest(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        String searchText = "Google";

        open("https://www.google.com/");

        $(byName("q")).sendKeys(searchText);
        $("h3.r a").shouldHave(Condition.text(searchText));
        $(byText("Some button"));

        /*
        $("css").shouldNotBe(Condition.visible);
        List<SelenideElement>  list = $$("");

        confirm(); //javascript alert
        dismiss(); //javascript alert

        selectRadio(By.id("id"), "Mr."); //select radionbutton element

        refresh();

        WebDriverRunner.getWebDriver(); //webdriver instance from selenium
        */








    }

}
