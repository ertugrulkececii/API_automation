package baseUrl_udemy;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import java.util.HashMap;
import java.util.Map;

public class BaseUrlJsonPlaceholder {

    protected RequestSpecification specJsonPlaceHolder;

    @Before
    public void setUp(){
        specJsonPlaceHolder=new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com").build();
    }


}
