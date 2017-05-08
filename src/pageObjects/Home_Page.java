package pageObjects;

/**
 * Created by prashant on 4/3/17.
 */



        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

        import highlight.highlightElement;

        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.support.ui.ExpectedConditions;


public class Home_Page {

    private static WebElement element = null;

    public static WebElement lnk_SignIn(WebDriver driver) {

   /*     element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/login']")));
*/
        element = driver.findElement(By.xpath("//a[@href='/login']"));
        highlightElement.highLightElement(driver, element);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        return element;
    }

    public static WebElement lnk_Logout(WebDriver driver) {

     /*WebElement span = (new WebDriverWait(driver,10))
             .until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/header/div/div/div[3]/div/a/span")));
*/
        WebElement span = driver.findElement(By.xpath("html/body/header/div/div/div[3]/div/a/span"));
        highlightElement.highLightElement(driver, span);
        span.click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

      /*  WebElement Logout = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='http://www.edunuts.com/logout']")));
*/

        WebElement Logout = driver.findElement(By.xpath("//a[@href='http://www.edunuts.com/logout']"));
        highlightElement.highLightElement(driver, Logout);
        Logout.click();

        return element;
    }
}