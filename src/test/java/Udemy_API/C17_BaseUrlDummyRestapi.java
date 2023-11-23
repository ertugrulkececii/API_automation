package Udemy_API;

import baseUrl_udemy.BaseUrlDummyApi;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C17_BaseUrlDummyRestapi extends BaseUrlDummyApi {


    @Test
    public void test01(){


        // 1- end point ve request body olustur

        specJsonPlaceHolder.pathParam("pp1", "posts");

        // 2-Expected data olustur
        // 3-request gonder ve response u kaydet

        Response response=given().when().spec(specJsonPlaceHolder).get("/{pp1}");


        response.then().assertThat()
                .statusCode(200)
                .body("title", Matchers.hasSize(100));
    }

    @Test
    public void test02(){


        specJsonPlaceHolder.pathParams("pp1","posts","pp2",44);

        // 2-Expected data olustur
        // 3-request gonder ve response u kaydet
        Response response=given()
                .when().spec(specJsonPlaceHolder)
                .get("/{pp1}/{pp2}");

        response
                .then()
                .assertThat()
                .statusCode(200)
                .body("title",Matchers.equalTo("optio dolor molestias sit"));

    }
}
