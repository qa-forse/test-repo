package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.name("username");
    By password = By.name("password");
    By loginBtn = By.cssSelector("[data-qa-tag = 'login-submit-button']");
    By profileIcon = By.className("h-accautWrap");
    By userId = By.xpath("//*[@class='ac-dropdown__userRestInfo']//dd[1]");

    //       driver.findElement(By.name("username")).sendKeys("sukhar.maksym+3@pdffiller.team");
//        driver.findElement(By.name("password")).sendKeys("sukhar.maksym+3@pdffiller.team");
//        driver.findElement(By.cssSelector("[data-qa-tag = 'login-submit-button']")).click();
//        actions.moveToElement(driver.findElement(By.className("h-accautWrap"))).perform();
//    String userId = driver.findElement(By.xpath("//*[@class='ac-dropdown__userRestInfo']//dd[1]")).getText();

}
