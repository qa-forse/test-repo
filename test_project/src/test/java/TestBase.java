import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected ChromeDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        wait = (new WebDriverWait(driver, 7));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
