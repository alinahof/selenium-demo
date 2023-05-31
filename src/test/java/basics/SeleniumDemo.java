package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver driver =null;
        try {
             driver = new ChromeDriver();
            driver.get("https://www.duotech.io/");

            String expected = "Software QA Automation Engineer program | SDET | QA School | Software Testing";
            String actualTitle = driver.getTitle();


            Assert.assertEquals(actualTitle, expected); //actual always comes first
        } finally {


            driver.quit();
        }


     //   if(expected.equalsIgnoreCase(actualTitle)){
       //     System.out.println("Test passed");
        //}else{
          //  System.out.println("Test failed");
            //System.out.println("Expected value was "+expected);
            //System.out.println("Actual is "+actualTitle);
        //}


    }
}
