package pageObjects;

/**
 * Created by prashant on 4/3/17.
 */



        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

        import ErrorMsg.Error;
        import highlight.highlightElement;

        import org.openqa.selenium.interactions.Actions;

        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditAnswers
{

    public static WebElement peditanswers(WebDriver driver)
    {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        System.out.println(driver.getTitle());

        Actions actt = new Actions(driver);

        actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

     /*   WebElement EdtA = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='glyphicon glyphicon-edit']")));
*/

        WebElement EdtA = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-edit']"));
        highlightElement.highLightElement(driver, EdtA);
        EdtA.click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        actt.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

        String windowHandlee = driver.getWindowHandle();

        try {

          /* WebElement Ans = (new WebDriverWait(driver,10))
                   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='answer-description_ifr']")));
*/

            WebElement Ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
            highlightElement.highLightElement(driver, Ans);
            Ans.click();
            Ans.sendKeys(Keys.CONTROL + "a");
            Ans.sendKeys(Keys.DELETE);
            Ans.sendKeys("");


            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            Error.editAerror(driver);

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }
        catch(Exception e)
        {
            System.out.println("");
        }


        try {
/*

            WebElement Ans = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='answer-description_ifr']")));
*/

            WebElement Ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
            highlightElement.highLightElement(driver, Ans);
            Ans.click();
            Ans.sendKeys(Keys.CONTROL + "a");
            Ans.sendKeys(Keys.DELETE);
            Ans.sendKeys("Answer Editing For Questions in Discussions");


            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            Error.editAerror(driver);

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }
        catch(Exception e)
        {
            System.out.println("");
        }


        return null;

    }

}
