package airlines;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static String getCreateAirlinePayload(String id, String name,String country){
    String payload=        "{\n" +
            "    \"id\": "+id+",\n" +
            "    \"name\": \""+name+"\",\n" +
            "    \"country\": \""+country+"\",\n" +
            "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
            "    \"slogan\": \"From Sri Lanka\",\n" +
            "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
            "    \"website\": \"www.srilankaairways.com\",\n" +
            "    \"established\": \"1990\"\n" +
            "}";
    return payload;

    }

    public static Map<Object, Object> getCreateAirlinePayloadUsingMap(String name, int trips, int airline){

        Map<Object, Object> payload = new HashMap<>();
        payload.put("name", name);
        payload.put("trips", trips);
        payload.put("airline", airline);

        return payload;

    }
}
