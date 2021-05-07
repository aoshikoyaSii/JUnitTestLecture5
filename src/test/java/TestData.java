import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestData {
    protected static WebDriver driver;


    @BeforeAll
    static void connect(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximaxized");
        driver = new ChromeDriver(options);
    }


    @BeforeEach
    void setup(){
        System.out.println("----> Run Before each Tests ------>");
    }
    @AfterEach
    void tearDown(){
        System.out.println("----> Run After Each Tests ---->");
    }
    @AfterAll
    static void close(){
        driver.quit();
        System.out.println("----> close DB connection ----> ");
    }

}
