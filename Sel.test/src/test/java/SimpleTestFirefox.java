import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;


public class SimpleTestFirefox {

    private final static String URL_TEST = "https://duckduckgo.com/";
    private final static String SEARCH_NAME = "Иванов Иван Иванович";

    @Test
    public void testDuck(){
        Configuration.browser = "firefox";
        open(URL_TEST);
        $x( "//input[@name='q']").setValue(SEARCH_NAME).pressEnter();
        $x("//a[@data-zci-link='images']").click();
        $x("//div[contains(@class, 'detail')][3]//img").click();
        try {
            $(By.xpath("//div[@class='detail__wrap']//div[contains(@style, 'scale')]//a[contains(@class, 'media__img-link')]")).download();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
