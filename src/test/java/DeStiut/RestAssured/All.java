package DeStiut.RestAssured;

import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class All {
    @Test
    public void sss(){
        RestAssured.baseURI = "https://reqres.in";

        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621") // cheie API aici
                .when()
                .get("/api/users?page=2")  // exemplu endpoint care necesită key
                .then()
                .statusCode(200).log().all();
    }
}
