package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrongPasswordFacebook {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")));

        WebElement cookiePopup = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
        cookiePopup.click();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test.c.k.2021@gmail.com");
        Thread.sleep(100);

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("test");

        WebElement logInButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
        logInButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[2]/div[2]/a")));

        driver.close();
    }
}