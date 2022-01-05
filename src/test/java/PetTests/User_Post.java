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

        create.setId("404040");
        create.setUsername("username123");
        create.setFirstName("username1234");
        create.setLastName("Test33");
        create.setEmail("try@gmail.com");
        create.setPassword("444");
        create.setPhone("444");
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
