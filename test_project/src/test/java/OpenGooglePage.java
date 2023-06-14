import org.testng.annotations.Test;

public class OpenGooglePage extends TestBase {

    @Test
    public void firstTest() {
        driver.get("https://www.google.com.ua");
    }
}
