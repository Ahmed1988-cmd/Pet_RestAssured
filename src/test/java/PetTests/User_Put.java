package PetTests;
import Pet_Base.TestBase;
import Post_NewUser.CreateUser;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;



public class User_Put extends TestBase

{


    @Test
    public void UpdateUserName()
    {

        CreateUser create = new CreateUser();

        create.setId("40404");
        create.setUsername("water2");
        create.setFirstName("testingmylive");
        create.setLastName("alyyy");
        create.setEmail("mesh@gmail.com.com");
        create.setPassword("123456");
        create.setPhone("9090");
        create.setUserStatus("1");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(create)
                .put("/40404")
                .then()
                .statusCode(200);

    }

    }

