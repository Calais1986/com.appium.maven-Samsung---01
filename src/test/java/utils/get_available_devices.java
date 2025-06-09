package utils;


import com.gargoylesoftware.htmlunit.javascript.host.Window;
import utils.Device_Capability;


import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class get_available_devices {

    public static List<Device_Capability> getDeviceInfo() {

        String kobitonServerUrl = "";


        List<List<String>> resultList = null;
        List<Device_Capability> device_capabiliies_list = new ArrayList<Device_Capability>();
        try {
            //URL obj = new URL("https://api.kobiton.com/v1/reservations/available-devices");
            Window window = new Window();
            var base64EncodedBasicAuth = window.btoa("nosterminals:ed675ee4-df86-48df-842a-96a89faeafe6");

            //URL obj = new URL("https://api.kobiton.com/v1/reservations/available-devices");
            URL obj = new URL("https://api.kobiton.com/v1/devices");
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            System.out.println(con.toString());
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Basic " + base64EncodedBasicAuth);
            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;

            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();


            List<String> device_names = new ArrayList<String>();
            List<String> os = new ArrayList<String>();
            List<String> os_version = new ArrayList<String>();
            List<String> brands = new ArrayList<String>();

            resultList = new ArrayList<>();
            resultList.add(device_names);
            resultList.add(os);
            resultList.add(os_version);
            resultList.add(brands);


            int i = 0;
            String[] output = (response.toString().split("favoriteDevices"));
            String[] devices_chunks = (output[0].split("\"Portugal - NOS - PSA\"}"));
            for (String s : devices_chunks) {
                if (s.contains("\"isOnline\":true")) {
                    //System.out.println(s.split("deviceName\":\"")[1].split("\"")[0]);

                    device_capabiliies_list.add(new Device_Capability());

                    device_capabiliies_list.get(i).device_model = s.split("displayDeviceName\":\"")[1].split("\"")[0];
                    device_capabiliies_list.get(i).brand = s.split("brandName\":\"")[1].split("\"")[0];
                    device_capabiliies_list.get(i).os = s.split("platformName\":\"")[1].split("\"")[0];
                    device_capabiliies_list.get(i).os_version = s.split("platformVersion\":\"")[1].split("\"")[0];


                    i++;



                }


            }





        }

        //brand
        //model
        //os
        //os version


        catch (MalformedURLException e) {
            // catch (Exception e) {
            //print element e erro no driver
            e.printStackTrace();


        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return device_capabiliies_list;
    }



    }

