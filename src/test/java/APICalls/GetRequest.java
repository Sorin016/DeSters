package APICalls;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import stepDefinition.AbstractStepDef;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.*;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class GetRequest extends AbstractStepDef {
    @Given("User is redirect to mainPage and use Get Request")
    public void getMeth() {
        log.info("\u001B[35mGET method was called\u001B[0m");
        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621") // cheie API aici
                .when()
                .get("/api/users?page=2")  // exemplu endpoint care necesită key
                .then()
                .statusCode(200)
                .log().all();
    }

    @And("User checks presents of the entities {int} have {string}")
    public void check(int number, String name) {
        log.info("\u001B[35mCHECK if a record exist method was called\u001B[0m");
        getMeth();
        Response getResponse = RestAssured.get(restAssuredBaseURL + "/api/users?page=2");
        getResponse
                .then()
                .body("data.find { it.id == " + number + " }.first_name",
                        equalTo(name)).log().all();
        Map<String, Object> user = getResponse.jsonPath()
                .getMap("data.find { it.id == " + number + " }");
        assertEquals(number, user.get("id"));
        assertEquals(name, user.get("first_name"));
    }

    @And("User put new name and job inside {string} have {string}")
    public void put(String name, String job) {
        log.info("\u001B[35mPUT method was called\u001B[0m");
        JSONObject request = new JSONObject();
        request.put("name", name);
        request.put("job", job);
        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621")
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(SC_OK)
                .body("name", equalTo(name))
                .body("job", equalTo(job))
                .body("updatedAt", notNullValue())
                .log().all();
    }
    @And("User post new name and job inside {string} have {string}")
    public void postRequest(String name, String job) {
        log.info("\u001B[35mPOST method was called\u001B[0m");
        JSONObject request = new JSONObject();
        request.put("name", name);
        request.put("job", job);
        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621")
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("/api/users/2")
                .then()
                .statusCode(SC_CREATED)
                .body("name", equalTo(name))
                .body("job", equalTo(job))
                .log().all();
    }
    @Then("User delete all")
    public void delete() {
        log.info("\u001B[35mDELETE method was called\u001B[0m");
        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621")
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(SC_NO_CONTENT)
                .log().all();
    }
}
