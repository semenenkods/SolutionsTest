import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class DragDropTest {
    @Test
    void dragAndDropTest() {
        Configuration.browser = "edge";
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").shouldHave(Condition.text("A"));
        $("#column-b").shouldHave(Condition.text("B"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-b").shouldHave(Condition.text("A"));
        $("#column-a").shouldHave(Condition.text("B"));

    }
}