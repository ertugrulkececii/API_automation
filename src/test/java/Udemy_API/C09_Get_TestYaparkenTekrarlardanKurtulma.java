package Udemy_API;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C09_Get_TestYaparkenTekrarlardanKurtulma {

    @Test
    public void test01() {

        /*
        https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde
            donen Response’un,
            status code’unun 200,
            ve content type’inin application-json,
            ve response body’sindeki
            "firstname“in, "Mark",
            ve "lastname“in, "Jackson",
            ve "totalprice“in, 1000 den az oldugunu,
            ve "depositpaid“in, false,
            ve "additionalneeds“in, "Breakfast"
        oldugunu test edin
         */

        //1-end point ve reuest data hazirla
        String url = "https://restful-booker.herokuapp.com/booking/10";

        //2- expected data olustur
        //3-request gonderip donen responseí kaydet
        Response response = given().when().get(url);

        //4-Assertion
        response.prettyPrint();

        response.then().assertThat().statusCode(200).contentType(ContentType.JSON)
                .body("firstname", equalTo("Eric"),
                        "lastname", equalTo("Wilson")
                        , "totalprice", lessThan(1000)
                        , "depositpaid", equalTo(true)
                        , "additionalneeds", notNullValue());

    }
}
