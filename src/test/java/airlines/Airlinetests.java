package airlines;

import Utils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Airlinetests {

    @Test
    public void createAirline(){

        String endPoint ="https://api.instantwebtools.net/v1/airlines";
        String payloadBody = "{\n" +
                "    \"id\": 12,\n" +
                "    \"name\": \"Sri Lankan Airways\",\n" +
                "    \"country\": \"Sri Lanka\",\n" +
                "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                "    \"slogan\": \"From Sri Lanka\",\n" +
                "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                "    \"website\": \"www.srilankaairways.com\",\n" +
                "    \"established\": \"1990\"\n" +
                "}";


        Response response = RestUtils.performPost(endPoint, payloadBody, new HashMap<>()); // no header so pass empty body
        Assert.assertEquals(response.statusCode(), 200);

    }

    @Test
    public void createAirlinePassenger(){

        String endPoint ="https://api.instantwebtools.net/v1/passenger";

        Map<Object, Object> payloadB = Payloads.getCreateAirlinePayloadUsingMap("yogi burkul", 343, 5);

        Response response = RestUtils.performPost(endPoint,  payloadB, new HashMap<>()); // no header so pass empty body
        Assert.assertEquals(response.statusCode(), 200);

    }
}

/*
    multiple method has called number of time, value hardcoded ---,
 */
