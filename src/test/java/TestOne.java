import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestOne extends TestData{

    //    assertion test check
    @Test
    @Order(1)
    void Sum(){
        int actualResult = 2 + 3;
        Assertions.assertEquals(5,actualResult);
    }

    @Test
    @Order(2)
    void checkName(){
        String strOne = "Selenium";
        String strTwo = "selenium";
        assertNotEquals(strOne, strTwo);
    }

    @Test
    @Order(3)
    void validateList(){
        int actualResult = 2 + 3;
        String message = "Yes they are not equal";
        assertNotEquals(4, actualResult, message);
    }


    @Test
    @Order(4)
    void OpenBrowser(){
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php");
    }

    @Test
    @Order(5)
    void checkPageTitle(){
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        String pageTitle = driver.getTitle();
        assertEquals("My Store",pageTitle);
    }

}
