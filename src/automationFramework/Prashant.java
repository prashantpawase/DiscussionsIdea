package automationFramework;

/**
 * Created by prashant on 4/3/17.
 */


//Prashant Pawase via XuBuntu
//Prashant
//Prashant Pawase via KuBuntu
//changes done from KuBuntu
        import java.util.List;
        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import appModules.SignIn_Action;
        import highlight.highlightElement;
        import pageObjects.Answers;
        import pageObjects.EditAnswers;
        import pageObjects.EditQuestions;
        import pageObjects.Home_Page;
        import pageObjects.Questions;
        import pageObjects.UDvote;
        import utility.Constant;

public class Prashant
{

    private static WebDriver driver = null;

    public static void main(String args[]) throws Exception
    {
        System.setProperty("webdriver.gecko.driver", "/home/prashant/Prashant/External-Jars/geckodriver-v0.14.0-linux64.tar.gz/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement city = driver.findElement(By.xpath("//a[@data-url='delhi']"));
        highlightElement.highLightElement(driver, city);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        city.click();

        Thread.sleep(1000);

        SignIn_Action.Execute(driver);
        System.out.println("Login Success");

        System.out.println(driver.getTitle());

        Thread.sleep(1000);


        WebElement discussions = driver.findElement(By.xpath("//a[@href='http://www.edunuts.com/discussions']"));

        Thread.sleep(1000);
        highlightElement.highLightElement(driver, discussions);
        Thread.sleep(1000);

        discussions.click();

        Thread.sleep(2000);

        try
        {
            Questions.pquestions(driver).click();

            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("");
        }



        try
        {
            driver.navigate().to("http://www.edunuts.com/discussions");

            EditQuestions.peditquestions(driver).click();

            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("");
        }

        try
        {

            Answers.panswers(driver).click();
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("");
        }

        Thread.sleep(1000);

        try
        {

            EditAnswers.peditanswers(driver).click();
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("");
        }

        try
        {
            UDvote.pUDvote(driver).click();
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("");
        }



        Thread.sleep(1000);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        Home_Page.lnk_Logout(driver);

        System.out.println(driver.getTitle());

        System.out.println("Logout Success");



        driver.close();
    }
}
