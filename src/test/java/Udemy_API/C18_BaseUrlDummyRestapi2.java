package Udemy_API;

import baseUrl_udemy.BaseUrlDummyApi;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C18_BaseUrlDummyRestapi2 extends BaseUrlDummyApi {

    @Test
    public void Test01(){

        specJsonPlaceHolder.pathParams("pp1", "posts","pp2",50);

        Response response=given()
                .when().spec(specJsonPlaceHolder)
                .delete("/{pp1},{pp2}");

        // Assertion

        response.then()
                .statusCode(200)
                .body("title", Matchers.nullValue());
    }
}
