package hookwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class WebDriverManager {
        public static WebDriver driver;

        public static WebDriver getDriver() {
            if (driver == null) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\java\\testeando\\webdriverexe\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            return driver;
        }


    }
