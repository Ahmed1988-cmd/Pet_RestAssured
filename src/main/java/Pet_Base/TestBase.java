package Pet_Base;

import org.testng.annotations.BeforeClass;
import static com.jayway.restassured.RestAssured.*;



public class TestBase
{

    @BeforeClass
    public static void init()
    {
         baseURI="https://petstore.swagger.io/v2/user";
    }

}
