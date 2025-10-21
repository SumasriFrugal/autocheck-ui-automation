package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;

    protected String UserName = "suhail+1@frugaltestingin.com";
    protected String Password = "Autochek@123";
    protected String URL = "https://dealerplus.staging.myautochek.com/auth/sign-in";

    public void SetUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }
}
