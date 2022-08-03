import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class apitest {


    @Test
    public void test01(){

        Response response = get("https://reqres.in/api/users?page=2");

        System.out.println(response.getTime());

        System.out.println(response.getStatusCode());
        //System.out.println(response.asString());


       Assert.assertEquals(response.statusCode(),200,"INVALID Status code returned");


    }

    @Test
    public void test02(){
        given().get("https://reqres.in/api/users?page=2").then()
                .statusCode(equalTo(200)).log().all();


        System.out.println("passsed");


    }

}
