import org.junit.Test;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import static com.codeborne.selenide.Selenide.*;



public class Googletest {
    @Test
    public void OpenPictures() throws MalformedURLException {
        open("https:google.com");
        $(By.name("q")).setValue("Кашин Алексей").pressEnter();
        $(By.linkText("Картинки")).click();
        $(By.cssSelector("[data-ri='2' a]")).click();

    }

}
