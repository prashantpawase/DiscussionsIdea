package pageObjects;

/**
 * Created by prashant on 4/3/17.
 */



        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;

        import ErrorMsg.Error;
        import highlight.highlightElement;

        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class EditQuestions
{

    public static WebElement peditquestions(WebDriver driver)
    {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        System.out.println(driver.getTitle());

        Actions actt = new Actions(driver);

        actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement EdtQ = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='glyphicon glyphicon-edit']")));

      //  WebElement EdtQ = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-edit']"));
        highlightElement.highLightElement(driver, EdtQ);
        EdtQ.click();


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        actt.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

        String windowHandlee = driver.getWindowHandle();

        try {

            WebElement Utitle = (new WebDriverWait(driver , 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='question-title']")));


         //   WebElement Utitle = driver.findElement(By.xpath("//input[@id='question-title']"));
            highlightElement.highLightElement(driver, Utitle);
            Utitle.click();
            Utitle.clear();



            WebElement Udesc = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='question-description_ifr']")));

          //  WebElement Udesc = driver.findElement(By.xpath("//iframe[@id='question-description_ifr']"));
            highlightElement.highLightElement(driver, Udesc);
            Udesc.click();
            Udesc.sendKeys(Keys.DELETE);
            Udesc.sendKeys(Keys.CONTROL + "a");


            WebElement RTopic = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-role='remove']")));


          //  WebElement RTopic = driver.findElement(By.xpath("//span[@data-role='remove']"));
            highlightElement.highLightElement(driver, RTopic);
            RTopic.click();



            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



            Error.editQerror(driver);

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }
        catch (Exception e)
        {
            System.out.println("");
        }


        try {

            WebElement Utitle = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='question-title']")));


         //   WebElement Utitle = driver.findElement(By.xpath("//input[@id='question-title']"));
            highlightElement.highLightElement(driver, Utitle);
            Utitle.click();
            Utitle.clear();
            Utitle.sendKeys("How to start studying ?");


            WebElement Udesc = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='question-description_ifr']")));


          //  WebElement Udesc = driver.findElement(By.xpath("//iframe[@id='question-description_ifr']"));
            highlightElement.highLightElement(driver, Udesc);
            Udesc.click();
            Udesc.sendKeys(Keys.DELETE);
            Udesc.sendKeys(Keys.CONTROL + "a");
            Udesc.sendKeys("Studying discussions Questions");


            WebElement RTopic = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-role='remove']")));

         //   WebElement RTopic = driver.findElement(By.xpath("//span[@data-role='remove']"));
            highlightElement.highLightElement(driver, RTopic);
            RTopic.click();


            WebElement Utopics = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Topics (example: DU, learning, philosophy)']")));

          //  WebElement Utopics = driver.findElement(By.xpath("//input[@placeholder='Topics (example: DU, learning, philosophy)']"));
            highlightElement.highLightElement(driver, Utopics);
            Utopics.click();
            Utopics.sendKeys("management");

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


            driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div[1]/div/div/div/form/div[2]/div/ul/li[1]/a")).click();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            Error.editQerror(driver);

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }
        catch (Exception e)
        {
            System.out.println("");
        }



        return null;

    }


}
