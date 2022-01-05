package PetTests;
import Pet_Base.TestBase;
import Post_NewUser.CreateUser;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;


public class User_Post extends TestBase

{

    @Test
    public void CreateNewUser()
    {

        CreateUser create = new CreateUser();

        create.setId("40404");
        create.setUsername("water2");
        create.setFirstName("hello22");
        create.setLastName("Test33");
        create.setEmail("hee@gmail.com");
        create.setPassword("12345");
        create.setPhone("12345");
        create.setUserStatus("1");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(create)
                .post()
                .then()
                .statusCode(200);

    }
    }
