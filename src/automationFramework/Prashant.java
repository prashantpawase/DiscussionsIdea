package automationFramework;

/**
 * Created by prashant on 4/3/17.
 */


//Prashant Pawase via XuBuntu
//Prashant
//Prashant Pawase via KuBuntu
//Changes done from KuBuntu
//Switched to Intellij

        import java.util.concurrent.TimeUnit;

        import category.agriculture.Agriculture;
        import category.law.Law;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import highlight.highlightElement;
        import pageObjects.Home_Page;
        import utility.Constant;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.support.ui.ExpectedConditions;

        import appModules.SignIn_Action;
        import pageObjects.Home_Page;
        import pageObjects.Answers;
        import pageObjects.EditAnswers;
        import pageObjects.Questions;
        import pageObjects.EditQuestions;
        import pageObjects.UDvote;
        import vote.Downvote;
        import vote.Upvote;
        import org.openqa.selenium.remote.DesiredCapabilities;

public class Prashant
{

    private static WebDriver driver = null;

    public static void main(String args[]) throws Exception
    {
       /* System.setProperty("webdriver.gecko.driver", "/home/prashant/Prashant/External-Jars/geckodriver-v0.14.0-linux64.tar.gz/geckodriver.exe");
        driver = new FirefoxDriver();
*/




        System.setProperty("webdriver.chrome.driver", "/home/edn/Git-Repo/External-Jars/chromedriver");
        driver = new ChromeDriver();


        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);


/*

     System.setProperty("webdriver.gecko.driver","\\home\\edn\\Git-Repo\\External-Jars\\geckodriver-v0.16.1-linux64.tar.gz\\geckodriver.exe");
     driver = new FirefoxDriver();
*/



     Thread.sleep(1000);

        driver.get(Constant.URL);
        driver.manage().window().maximize();




        WebElement city = (new WebDriverWait(driver , 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-url='delhi']")));

     //   WebElement city = driver.findElement(By.xpath("//a[@data-url='delhi']"));
        highlightElement.highLightElement(driver, city);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        city.click();


        Thread.sleep(1000);

        SignIn_Action.Execute(driver);
        System.out.println("Login Success");

        System.out.println(driver.getTitle());

        Thread.sleep(1000);




        WebElement discussions = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='http://www.edunuts.com/discussions']")));
     //   WebElement discussions = driver.findElement(By.xpath("//a[@href='http://www.edunuts.com/discussions']"));

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
            Upvote.pUpvote(driver).click();
            Thread.sleep(1000);

        }
        catch(Exception e)
        {
            System.out.println("");
        }


        try
        {
            Downvote.pDownvote(driver).click();
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("");
        }


Thread.sleep(1000);

        try
        {

            Agriculture.agriculture(driver).click();
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("");
        }
/*
        try{
            driver.navigate().to("http://www.edunuts.com");
            Law.law(driver).click();
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("");
        }

*/
        Thread.sleep(1000);

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        Home_Page.lnk_Logout(driver);

        System.out.println(driver.getTitle());

        System.out.println("Logout Success");



        driver.close();
    }
}
