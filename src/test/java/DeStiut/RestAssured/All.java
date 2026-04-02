package DeStiut.RestAssured;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;


public class All {
    @Test
    public void connectare() {
        RestAssured.baseURI = "https://reqres.in";

        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621") // cheie API aici
                .when()
                .get("/api/users?page=2")  // exemplu endpoint care necesită key
                .then()
                .statusCode(200).log().all();
    }

    @Test
    public void verificatreaExistenteiUnuiRind() {
        RestAssured.baseURI = "https://reqres.in";

        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621") // cheie API aici
                .when()
                .get("/api/users?page=2")  // exemplu endpoint care necesită key
                .then()
                .body("data[1].id", equalTo(8))
                .statusCode(200).log().all();
    }

    @Test
    public void verificatreaExistenteiUnuiRind2() {
        RestAssured.baseURI = "https://reqres.in";

        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621") // cheie API aici
                .when()
                .get("/api/users?page=2")  // exemplu endpoint care necesită key
                .then()
                .body("data.first_name", hasItem("George"))
                .statusCode(200).log().all();

    }
    @Test
    public void post() {
        RestAssured.baseURI = "https://reqres.in";
        JSONObject request=new JSONObject();
        request.put("name","orin");
        request.put("job","banchir");
        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621") // cheie API aici
                .body(request.toJSONString())
                .contentType("application/json")
                .when()
                .post("/api/users")  // exemplu endpoint care necesită key
                .then()
                .statusCode(201).log().all();
    }
}
