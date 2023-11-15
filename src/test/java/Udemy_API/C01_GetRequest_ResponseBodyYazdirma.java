package Udemy_API;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class C01_GetRequest_ResponseBodyYazdirma {

   @Test
           public void get01() {
       // https://restful-booker.herokuapp.com/booking/10 url'ine
       //bi Get reuest gonderdigimizde donen Response'u yazdirin.

       // 1- Request body ve end-point hazirlama
       String url = "https://restful-booker.herokuapp.com/booking/10";

       // 2- Expected data hazirlama

       // 3- Request gonderip, donen response'i kaydetme
       Response response = given().when().get(url);
       response.prettyPrint();

   }
}
