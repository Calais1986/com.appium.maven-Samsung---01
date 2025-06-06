package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import io.appium.java_client.android.AndroidDriver;
public class ActionUtils {
     public static boolean isElementPresent(AndroidDriver driver, By by) {
        try {


            driver.findElement(by);

            return true;


        } catch (NoSuchElementException e) {



            return false;



        }



    }
}