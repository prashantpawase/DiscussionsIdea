package pageObjects;

/**
 * Created by prashant on 4/3/17.
 */



        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

        import highlight.highlightElement;

        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn_Page
{

    private static WebElement element = null;



    public static WebElement txtbx_UserName(WebDriver driver)
    {
      /*  element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Username / Email / Mobile']")));
*/

        element = driver.findElement(By.xpath("//input[@placeholder='Username / Email / Mobile']"));
        //	highLightElement(driver,element);

        highlightElement.highLightElement(driver, element);

        return element;
    }

    public static WebElement txtbx_Password(WebDriver driver)
    {
     /*   element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Password']")));
*/

       element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        //	highLightElement(driver,element);

        highlightElement.highLightElement(driver, element);

        return element;
    }

    public static WebElement btn_LogIn(WebDriver driver)
    {

        /*element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
*/
           element = driver.findElement(By.xpath("//button[@type='submit']"));
        //	highLightElement(driver,element);

        highlightElement.highLightElement(driver, element);

        return element;
    }


/*
	// Element highlighter code
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;

	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	try
	{
	Thread.sleep(1000);
	}
	catch (InterruptedException e) {

	System.out.println(e.getMessage());
	}

	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}

*/


}
