package PetTests;

import Pet_Base.TestBase;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

public class User_Delete extends TestBase


{
    @Test
    public void DeleteUser()
    {
        given()
                .when()
                .delete("/water2")
                .then()
                .statusCode(200);

    }
}
