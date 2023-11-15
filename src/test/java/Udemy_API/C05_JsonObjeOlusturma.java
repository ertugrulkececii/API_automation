package Udemy_API;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.experimental.theories.ParametersSuppliedBy;

public class C05_JsonObjeOlusturma {

    @Test()
    public void test02(){

        /*
        {
        "firstname":"Jim",
        "additionalneeds":"Breakfast",
        "totaalprice":111,
        "bookingdates":
        "checkin":"2018-01-01",
        "checkout":"2019-01-01"
        },
        "depositpaid":true,
        "lastname":"Brown"
        }
         */
//Once inner Json objesini olusuturalim
        JSONObject dateJsonObject=new JSONObject();
        dateJsonObject.put("checkin", "2018-01-01");
        dateJsonObject.put("checkout","2019-01-01");

        //sonra outer json ojesini olusutrup yeri geldiginide inner objeyi koyalim

        JSONObject requestBody=new JSONObject();
        requestBody.put("firstname", "Jim");
        requestBody.put("additionalneeds", "Breakfast");
        requestBody.put("bookingdates", dateJsonObject);
        requestBody.put("totaalprice",111);
        requestBody.put("depositpaid",true);
        requestBody.put("lastname","Brown");

        System.out.println(requestBody);

    }
}
