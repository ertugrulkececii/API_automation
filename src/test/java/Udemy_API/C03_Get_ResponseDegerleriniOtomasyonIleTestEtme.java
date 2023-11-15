package Udemy_API;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C03_Get_ResponseDegerleriniOtomasyonIleTestEtme {

    @Test
    public void test02(){
        /*
        https://restful-booker.herokuapp.com/booking/10 url'ine
         bi Get reuest gonderdigimizde donen Response'un, status code'nun 200,
         ve content type'innin application/json; charset=utf-8,
         ve Server isimli Header'in degerinin Cowboy,
         ve status Lin'in HTTp/1.1 200 OK
          test ediniz
         */
        //1- end point ve request body olustur

        String url="https://restful-booker.herokuapp.com/booking/10";
        //2- Expected body olustur
        //buna gerek oktur cunku soruda body olustur ve istenen yeri test edin denmiyor
        //3-Request gonderip, donen responseí kaydet
        Response response= given().when().get(url);

        //4- Assertion
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server", "Cowboy")
                .statusLine("HTTP/1.1 200 OK");





    }
}
