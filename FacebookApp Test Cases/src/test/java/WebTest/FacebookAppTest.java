package WebTest;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FacebookAppTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", "Galaxy S6 edge");
        desiredCapabilities.setCapability("udid", "031713c4e24b2205");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");

        desiredCapabilities.setCapability("appPackage", "com.facebook.katana");
        desiredCapabilities.setCapability("appActivity", "com.facebook.katana.LoginActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
        Thread.sleep(15000);

        WebElement logInButton = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Zaloguj się\"]"));
        WebElement emailForm = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Nazwa użytkownika\"]"));
        WebElement passwordForm = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Nazwa użytkownika\"]"));

    }

}
