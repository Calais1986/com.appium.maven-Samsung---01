package testcases.samsung;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;

public class MR1 {

    public static void main1() throws MalformedURLException, InterruptedException {


        AndroidDriver driver;

        driver = getAndroidDriver();
        try {

//            String marca = device.brand;
//            String modelo = device.device_model;
//            String OS = device.os + device.os_version;
//

            //AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL(kobitonServerUrl), capabilities);


            String kobitonSessionId = driver.getSessionId().toString();
            System.out.println(kobitonSessionId);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clean_phone_history.test(driver);

            String iperf = iperf_client.test(driver, kobitonSessionId);

            String ping = testcases.samsung.ping.test(driver, kobitonSessionId);

            clean_phone_history.test(driver);
















            String call_test_result = Test_outcall10.test(driver, kobitonSessionId);
            System.out.println("Call test completed");
            System.out.println(call_test_result);
                clean_phone_history.test(driver);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String conf_call_test_result = Test_calls_and_conf.test(driver);
            System.out.println("Conf call test completed");
            System.out.println(conf_call_test_result);
            clean_phone_history.test(driver);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




            String connection_5g_result = connection_5g.test(driver);
            System.out.println("5G conn test completed");
            System.out.println(connection_5g_result);
            clean_phone_history.test(driver);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String nr_speedtest_result = null;
            if (connection_5g_result.equals("OK")) {
                nr_speedtest_result = SpeedTest_5G.test(driver);
                System.out.println("5G speed test completed");
                System.out.println(nr_speedtest_result);
                clean_phone_history.test(driver);
            }
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String volte_test_result = volte_test.test(driver);
            System.out.println("VoLTE test completed");
            System.out.println(volte_test_result);
            clean_phone_history.test(driver);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //String sms_test_result = test_sms_mms.test(driver);
            String sms_test_result=("Under development");
            System.out.println("SMS test completed");
            System.out.println(sms_test_result);
            //clean_phone_history.test(driver);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            String apn_test_result = test_apn_values.test(driver);
            System.out.println("Apn test completed");
            System.out.println(apn_test_result);
            //clean_phone_history.test(driver);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



            String hotspot_test_result = HotSpot_test.test(driver);
            System.out.println("Hotspot test completed");
            System.out.println(hotspot_test_result);
            clean_phone_history.test(driver);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            String vowifi_test_result = test_vowifi_new.test(driver);
            System.out.println("Vowifi call test completed");
            System.out.println(vowifi_test_result);
            //    clean_phone_history.test(driver);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            String security_test_result = Security_snoopsnitch_based.test(driver);
            System.out.println("Snoopsnitch test complete");
            System.out.println(security_test_result);
            clean_phone_history.test(driver);

            try {
                Thread.sleep(1000 * 20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();

            Date date = new Date();
            Timestamp timestamp2 = new Timestamp(date.getTime());


            File file = new File("test_results.txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
//            br.write( "kobitonSessionId,marca,modelo,OS,call_test_result,connection_5g_result,nr_speedtest_result,volte_test_result,sms_test_result,apn_test_result,conf_call_test_result,hotspot_test_result,vowifi_test_result,security_test_result,timestamp2 \n" + kobitonSessionId + "," + "samsung" + "," + "modelo" + "," + "OS" + "," + iperf +  "," + connection_5g_result + ","
//                    + nr_speedtest_result + "," + volte_test_result + "," + sms_test_result + "," + apn_test_result + "," + conf_call_test_result +
//                    "," + hotspot_test_result + "," + vowifi_test_result + "," + security_test_result + "," + timestamp2 + "\n");
//
            br.write( "kobitonSessionId,marca,modelo,OS,iperf_test_result,connection_5g_result,nr_speedtest_result,volte_test_result,sms_test_result,apn_test_result,conf_call_test_result,hotspot_test_result,vowifi_test_result,security_test_result,timestamp2 \n" + kobitonSessionId + "," + "samsung" + "," + "modelo" + "," + "OS" + "," + iperf +  "," + connection_5g_result + ","
            + nr_speedtest_result + "," + volte_test_result + "," + sms_test_result + "," + apn_test_result + "," + conf_call_test_result +
            "," + hotspot_test_result + "," + vowifi_test_result + "," + security_test_result + "," + timestamp2 + "\n");

            br.close();


        } catch (MalformedURLException e) {
            // catch (Exception e) {
            //print element e erro no driver
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public static AndroidDriver getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "Uiautomator2");
        //capabilities.setCapability("sessionDescription", "");
        //capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        //capabilities.setCapability("captureScreenshots", true);
        //capabilities.setCapability("groupId", 12468);
        //capabilities.setCapability("deviceGroup", "ORGANIZATION");
        //capabilities.setCapability("deviceName", device.device_model);
        capabilities.setCapability("platformVersion","14");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("newCommandTimeout",120000);
        capabilities.setCapability("udid","R3CW405JAEF");
        String hub = " http://127.0.0.1:4723/wd/hub";

        AndroidDriver driver = new AndroidDriver(new URL(hub), capabilities);
        return driver;
    }
}
