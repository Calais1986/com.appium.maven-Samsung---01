package testcases.samsung;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Security_snoopsnitch_based {

    public static String test(AndroidDriver driver) {

        try {
            String kobitonSessionId = driver.getSessionId().toString();
            System.out.println(kobitonSessionId);


            try {
                driver.findElement(new AppiumBy.ByAccessibilityId("SnoopSnitch")).click();
            } catch (Exception e) {
                driver.findElement(new AppiumBy.ByAccessibilityId("SnoopSnitch, 1 notification")).click();
            }

            WebElement el1 =  driver.findElement(By.id("de.srlabs.snoopsnitch:id/sumResultChart"));
            el1.click();
            Thread.sleep(2000);
            WebElement el2 =  driver.findElement(By.id("de.srlabs.snoopsnitch:id/btnDoIt"));
            el2.click();
            //driver.findElementByAccessibilityId("Start test").click();
            List<WebElement> elements = driver.findElements(By.id("de.srlabs.snoopsnitch:id/sumResultChart"));
            List<WebElement> listoftext= driver.findElements(By.xpath("//android.widget.TextView[//*]"));
            do {

                Thread.sleep(5000);

                if ( driver.findElement(By.id("de.srlabs.snoopsnitch:id/btnDoIt")).isDisplayed()) {

                    System.out.println("teste a correr");
                }
                listoftext= driver.findElements(By.xpath("//android.widget.TextView[//*]"));
                //elements = driver.findElements(By.id("de.srlabs.snoopsnitch:id/sumResultChart"));
            } while(listoftext.contains("Stop test"));/*while ( elements.isEmpty());*/

            /* to delete
            listoftext= driver.findElements(By.xpath("//android.widget.TextView[//*]"));
            for(int i=0;i<listoftext.size();i++) {
                if (listoftext.get(i).getText() != null) {
                    String SeenText = listoftext.get(i).getText();
                    System.out.println(SeenText);
                }
            }
            *///end to delete
            Thread.sleep(1000*30*1);
            return "OK";

        } catch (Exception e) {
            e.printStackTrace();
            return "NOK";
        }
    }
}
