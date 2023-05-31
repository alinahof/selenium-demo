package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
     //   String actualUrl = driver.getCurrentUrl();
       // System.out.println("Actual url is:" + actualUrl);
        //String expected = "https://www.instagram.com/";
        //Assert.assertEquals(actualUrl, expected);
        String expectedText = "Don't have an account?";

        Thread.sleep(1000);
        String pageSource = driver.getPageSource();  //returns source code

        Assert.assertTrue(pageSource.contains(expectedText));

        driver.quit(); //quit closes all open windows and tabs, ends browser session;
        // close closes only current window/tab



    }
}
