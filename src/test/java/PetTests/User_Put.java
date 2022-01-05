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

        create.setId("404040");
        create.setUsername("username123");
        create.setFirstName("last");
        create.setLastName("last");
        create.setEmail("last@gmail.com.com");
        create.setPassword("5555");
        create.setPhone("5555");
        create.setUserStatus("1");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(create)
                .put("/404040")
                .then()
                .statusCode(200);

    }

    }

