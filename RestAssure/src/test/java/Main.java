import io.restassured.RestAssured;
import org.junit.Test;

public class Main {

    @Test
    public void testGET(){
        RestAssured.
                when().get("http://example.com")
                .then().assertThat().statusCode(200);

    }
}
