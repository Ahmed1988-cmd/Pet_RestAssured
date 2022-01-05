package PetTests;

import Pet_Base.TestBase;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

public class User_Get extends TestBase

{

    @Test
    public void GetUser()
    {

     Response response =  given()
                .when()
                .get("/water2");

     System.out.println(response.body().prettyPrint());

        given()
                .when()
                .get("/water2")
                .then()
                .statusCode(200);

    }

}
