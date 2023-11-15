package Udemy_API;

import io.restassured.response.Response;
import org.apache.http.io.SessionOutputBuffer;
import org.junit.Test;
import org.junit.jupiter.api.io.TempDir;

import static io.restassured.RestAssured.given;

public class C02_GetRequest_ResponseBilgilerininManuelOlarakKontrolEdilmesi {

    @Test
    public void test01() {

        /*
        https://restful-booker.herokuapp.com/booking/10 url'ine
         bi Get reuest gonderdigimizde donen Response'un, status code'nun 200,
         ve content type'innin application/json; charset=utf-8,
         ve Server isimli Header'in degerinin Cowboy,
         ve status Lin'in HTTp/1.1 200 OK
         ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz
         */

        // 1-gerekli body ve end point hazirla
        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2-expected body olustur
        //3-request gonder ve donen response'i kaydet
        Response response = given().when().get(url);

        System.out.println("status code :" + response.getStatusCode() +
                "\nContent type : " + response.getContentType() +
                "\nServer Header degeri :" + response.getHeader("Server") +
                "\nStatus line : " + response.getStatusLine() +
                "\nResponse suresi : " + response.getTime());
    }
}
