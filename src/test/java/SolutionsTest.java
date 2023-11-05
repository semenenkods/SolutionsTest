import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverConditions.*;

public class SolutionsTest {

    @Test
    void successfulSearchTest() throws InterruptedException {
        Configuration.browser="edge";

        open("https://github.com");
        $("[aria-label=Global]").find(byText("Solutions")).hover();
        $("[aria-labelledby='solutions-for-heading']").find(byText("Enterprise")).hover().click();
        webdriver().shouldHave(url("https://github.com/enterprise"));


}
}
