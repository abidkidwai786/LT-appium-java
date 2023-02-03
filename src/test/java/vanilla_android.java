//package magicleapTesting;
import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
public class vanilla_android {



    public static String userName = System.getenv("LT_USERNAME");
    public static String accessKey = System.getenv("LT_ACCESS_KEY");
    public static String status = "passed";
    public static AndroidDriver driver;

    public static void main(String args[]) throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("build", "MagellanHealth script");
        capabilities.setCapability("test", "Test 1");

        capabilities.setCapability("isRealMobile", true);
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("deviceName", "Pixel.*");
        //capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("app","lt://APP10160271581663770709967902");

        //  capabilities.setCapability("deviceOrientation", "PORTRAIT");
        capabilities.setCapability("console",true);
        // capabilities.setCapability("network",true);
        capabilities.setCapability("visual",true);
        capabilities.setCapability("w3c", true);
        capabilities.setCapability("region", "US");
        driver = new AndroidDriver(new URL("http://"+userName+":"+accessKey+"@mobile-hub.lambdatest.com/wd/hub"), capabilities);

        try {




              WebDriverWait username = new WebDriverWait(driver, 30);
              username.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(@class,'android.widget.EditText')])[1]")));
              driver.findElementByXPath("(//*[contains(@class,'android.widget.EditText')])[1]").click(); // clicking on username text box to focus

            driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "shivbvjcl@gmail.com")); //option 1 to enter USERNAME(should work with iOS too)


//              driver.pressKey(new KeyEvent(AndroidKey.S));
//              driver.pressKey(new KeyEvent(AndroidKey.H));
//              driver.pressKey(new KeyEvent(AndroidKey.I));
//              driver.pressKey(new KeyEvent(AndroidKey.V));
//              driver.pressKey(new KeyEvent(AndroidKey.B));
//            driver.pressKey(new KeyEvent(AndroidKey.V));
//            driver.pressKey(new KeyEvent(AndroidKey.J));
//            driver.pressKey(new KeyEvent(AndroidKey.C));
//            driver.pressKey(new KeyEvent(AndroidKey.L));
//            driver.pressKey(new KeyEvent(AndroidKey.AT ));           // Option 2 to enter USERNAME
//            driver.pressKey(new KeyEvent(AndroidKey.G));
//            driver.pressKey(new KeyEvent(AndroidKey.M));
//            driver.pressKey(new KeyEvent(AndroidKey.A));
//            driver.pressKey(new KeyEvent(AndroidKey.I));
//            driver.pressKey(new KeyEvent(AndroidKey.L));
//            driver.pressKey(new KeyEvent(AndroidKey.PERIOD));
//            driver.pressKey(new KeyEvent(AndroidKey.C));
//            driver.pressKey(new KeyEvent(AndroidKey.O));
//            driver.pressKey(new KeyEvent(AndroidKey.M));

            WebDriverWait password = new WebDriverWait(driver, 30);
            password.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(@class,'android.widget.EditText')])[2]")));
            driver.findElementByXPath("(//*[contains(@class,'android.widget.EditText')])[2]").click(); // clicking on password text box to focus

            driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Testing123!"));  //option 1 to enter PASSWORD(should work with iOS too)


//            driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "T"));
//            driver.pressKey(new KeyEvent(AndroidKey.E));
//            driver.pressKey(new KeyEvent(AndroidKey.S));
//            driver.pressKey(new KeyEvent(AndroidKey.T));
//            driver.pressKey(new KeyEvent(AndroidKey.I));                          // option 2 to enter PASSWORD
//            driver.pressKey(new KeyEvent(AndroidKey.N));
//            driver.pressKey(new KeyEvent(AndroidKey.G));
//            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
//            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
//            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
            //driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "!"));


            WebDriverWait signin = new WebDriverWait(driver, 30);
            signin.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Sign in\"]")));
            driver.findElementByXPath("//android.widget.Button[@content-desc=\"Sign in\"]").click();  //clicking on signing button

            Thread.sleep(5000);

            WebDriverWait next = new WebDriverWait(driver, 30);
            next.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")));
            driver.findElementByXPath("//android.widget.Button[@content-desc=\"Next\"]").click(); // clicking on next button

            Thread.sleep(2000);
            driver.findElementByXPath("//android.widget.Button[@content-desc=\"Next\"]").click(); // clicking on next button

            Thread.sleep(2000);

            WebDriverWait started = new WebDriverWait(driver, 30);
            started.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Get started\"]")));
            driver.findElementByXPath("//android.widget.Button[@content-desc=\"Get started\"]").click(); //clicking on get started button
            Thread.sleep(5000);

            status="passed";
        }
        catch (java.lang.Exception e)
        {
            System.out.println(e.getMessage());
            status="failed";
        }
        driver.executeScript("lambda-status=" + status);
        driver.quit();
    }
}