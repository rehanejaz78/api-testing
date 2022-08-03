import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class POST {

    @Test
    public void test01(){

        JSONObject jsonObject = new JSONObject();

        jsonObject.put ("email", "eve.holt@reqres.in");
        jsonObject.put("password" ,"cityslicka");

       // given().header("Content-Type","application/json").contentType(ContentType.JSON) .post("https://reqres.in/api/login").then().log().status();


        int code =  RestAssured.given().auth().preemptive() .
                basic("eve.holt@reqres.in","cityslicka").when()
                .get("https://reqres.in/api/login").getStatusCode();

        System.out.println("Status code from server " +code );













    }
}
