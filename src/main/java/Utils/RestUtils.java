package Utils;

import com.aventstack.extentreports.util.Assert;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.Map;

public class RestUtils {

    public static Response performPost(String endpoint, String requestPayload, Map<String, String> headers) {

        Response response = RestAssured.given().baseUri(endpoint)
                .contentType(ContentType.ANY.JSON)
                .headers(headers)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();
    
        return response;
    }


    public static Response performPost(String endpoint, Map<Object, Object> requestPayload, Map<String, String> headers) {

        Response response = RestAssured.given().baseUri(endpoint)
                .contentType(ContentType.ANY.JSON)
                .headers(headers)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();

        return response;
    }
}
