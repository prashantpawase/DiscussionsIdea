package ErrorMsg;

/**
 * Created by prashant on 4/3/17.
 */




        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.interactions.Actions;

        import highlight.highlightElement;

        import org.openqa.selenium.support.ui.ExpectedCondition;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class Error

{

    /************************************** Questions ***********************************************/

    public static WebElement Qerror(WebDriver driver)
    {

    /*    WebElement Submit = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
*/

        WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
        highlightElement.highLightElement(driver, Submit);
        Submit.click();


     /*   WebElement erromsg = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='msg']")));
*/

        WebElement erromsg =  driver.findElement(By.xpath("//span[@class='msg']"));
        highlightElement.highLightElement(driver, erromsg);
        String txt = erromsg.getText();



        if(txt.equals("question-title field is required"))
        {
            System.out.println("Keep All Fields Blank");
            System.out.println("\u001B[41mfalse\u001B[0m");
            System.out.println("\u001B[41mError Message\u001B[0m ---> " + erromsg.getText());

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }
        else if(txt.equals("Question posted successfully"))
        {
            System.out.println("\033[32;1;2mtrue");
            System.out.println("\033[32;1;2mSuccess Message\033[0m ---> " + erromsg.getText());


            Actions act = new Actions(driver);
            act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

            WebElement Verify = driver.findElement(By.xpath("//h4[@class='question-title']"));
            System.out.println(Verify.getText());

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }
        else
        {

            System.out.println("\u001B[41mfalse\u001B[0m");
            System.out.println("\u001B[41mError Message\u001B[0m ---> " + erromsg.getText());

            driver.close();

            driver.navigate().to("http://www.edunuts.com/discussions");


        }



        return null;
    }




    public static WebElement editQerror(WebDriver driver)
    {

        WebElement update = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));



    //    WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
        highlightElement.highLightElement(driver, update);
        update.click();


        WebElement erromsg = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='msg']")));

      //  WebElement erromsg =  driver.findElement(By.xpath("//span[@class='msg']"));
        highlightElement.highLightElement(driver, erromsg);
        String txt = erromsg.getText();


        if(txt.equals("question-title field is required"))
        {
            System.out.println("Keep All Fields Blank");
            System.out.println("\u001B[41mfalse\u001B[0m");
            System.out.println("\u001B[41mError Message\u001B[0m ---> " + erromsg.getText());

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }
        else if(txt.equals("Question has been updated"))
        {
            System.out.println("\033[32;1;2mtrue");
            System.out.println("\033[32;1;2mSuccess Message\033[0m ---> " + erromsg.getText());


            Actions act = new Actions(driver);
            act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            System.out.println(driver.getTitle());

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }
        else
        {

            System.out.println("\u001B[41mfalse\u001B[0m");
            System.out.println("\u001B[41mError Message\u001B[0m ---> " + erromsg.getText());

            driver.close();

            driver.navigate().to("http://www.edunuts.com/discussions");


        }

        return null;
    }


    /************************************** Questions End ***********************************************/

    public static WebElement Aerror(WebDriver driver)
    {

        WebElement update = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));


     //   WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
        highlightElement.highLightElement(driver, update);
        update.click();


        WebElement erromsg = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='msg']")));

     //   WebElement erromsg =  driver.findElement(By.xpath("//span[@class='msg']"));
        highlightElement.highLightElement(driver, erromsg);
        String txt = erromsg.getText();

        if(txt.equals("description field is required"))
        {
            System.out.println("Keep All Fields Blank");
            System.out.println("\u001B[41mfalse\u001B[0m");
            System.out.println("\u001B[41mError Message\u001B[0m ---> " + erromsg.getText());

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }
        else if(txt.equals("Answer posted successfully"))
        {
            System.out.println("\033[32;1;2mtrue");
            System.out.println("\033[32;1;2mSuccess Message\033[0m ---> " + erromsg.getText());


            Actions act = new Actions(driver);
            act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            System.out.println(driver.getTitle());

            WebElement Answer = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='row question-answer']")));


          //  WebElement Answer = driver.findElement(By.xpath("//div[@class='row question-answer']"));
            System.out.println(Answer.getText());



            driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);


        }
        else
        {

            System.out.println("\u001B[41mfalse\u001B[0m");
            System.out.println("\u001B[41mError Message\u001B[0m ---> " + erromsg.getText());

            driver.close();

            driver.navigate().to("http://www.edunuts.com/discussions");


        }

        return null;
    }



    public static WebElement editAerror(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(50 , TimeUnit.SECONDS);

        WebElement update = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));


     //   WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
        highlightElement.highLightElement(driver, update);
        update.click();


        WebElement erromsg = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='msg']")));

     //   WebElement erromsg =  driver.findElement(By.xpath("//span[@class='msg']"));
        highlightElement.highLightElement(driver, erromsg);
        String txt = erromsg.getText();

        if(txt.equals("answer-description field is required"))
        {
            System.out.println("Keep All Fields Blank");
      //      System.out.println("\033[32;1;2mfalse");
       //     System.out.println("\u001B[41mfalse\u001B[0m");
       //     System.out.println("\033[32;1;2mError Message\033[0m ---> " + erromsg.getText());

            System.out.println("\u001B[41mfalse\u001B[0m");
            System.out.println("\u001B[41mError Message\u001B[0m ---> " + erromsg.getText());


            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }

        else if(txt.equals("Your answer has been updated"))
        {
            System.out.println("\033[32;1;2mtrue");
            System.out.println("\033[32;1;2mSuccess Message\033[0m ---> " + erromsg.getText());


            Actions act = new Actions(driver);
            act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            WebElement Answer = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='row question-answer']")));


          //  WebElement Answer = driver.findElement(By.xpath("//div[@class='row question-answer']"));
            System.out.println(Answer.getText());

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }
        else
        {

            System.out.println("\u001B[41mfalse\u001B[0m");
            System.out.println("\u001B[41mError Message\u001B[0m ---> " + erromsg.getText());



            driver.navigate().to("http://www.edunuts.com/discussions");

            driver.close();

        }


        return null;
    }

    /************************************** Answers End***********************************************/


}
