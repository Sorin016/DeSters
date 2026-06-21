package APICalls;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.equalTo;
import static stepDefinition.AbstractStepDef.restAssuredBaseURL;

public class APICuTestNGRun {
    Response getResponse;
    Response postResponse;

    @Test
    public void connect() {
        getResponse = RestAssured.get(restAssuredBaseURL + "/api/users?page=2");
        System.out.println(getResponse.getStatusCode());
        System.out.println(getResponse.getBody().asString());
        Assert.assertEquals(getResponse.getStatusCode(), SC_OK);
    }
    @Test
    public void sss(){
        RestAssured.baseURI = "https://reqres.in";

        given()
                .header("x-api-key", "pub_0bc16bff018e99e6427b72a9e47d6e7f9e1350494a04a81c244eca10f322f621") // cheie API aici
                .when()
                .get("/api/users?page=2")  // exemplu endpoint care necesită key
                .then()
                .statusCode(200);
    }

    @Test
    public void check() {
        connect();
        getResponse.then().body("data[2].id", equalTo(9));
        getResponse.then().body("data[2].first_name", equalTo("Tobias"));
    }

    @Test
    public void checksWithAssert() {
        connect();
        getResponse.then().assertThat().body("data[2].id", equalTo(9));
        getResponse.then().body("data[2].first_name", equalTo("Tobias"));
    }

    @Test
    //insert a record
    public void post() {
        Map<String, Object> map = new HashMap<>();
        map.put("first_name", "Tobias");
        map.put("last_name", "Bias");
        JSONObject jsonRequest = new JSONObject(map);

        postResponse = given()
                .header("Content-Type", "application/json")
                .body(jsonRequest.toJSONString())
                .when()
                .post(restAssuredBaseURL + "/api/users");
        Assert.assertEquals(postResponse.getStatusCode(), SC_CREATED);
    }

    @Test
    //update the record
    public void put() {
        Map<String, Object> map = new HashMap<>();
        map.put("first_name", "Sorin");
        map.put("last_name", "Bias");
        JSONObject jsonRequest = new JSONObject(map);

        postResponse = given()
                .header("Content-Type", "application/json")
                .body(jsonRequest.toJSONString())
                .when()
                .put(restAssuredBaseURL + "/api/users/2");
        System.out.println(postResponse.getBody().asString());
        Assert.assertEquals(postResponse.getStatusCode(), SC_OK);
    }

    @Test
    public void cc() {
        Object ss[] = {"sorin", 1, LocalDate.now(), new String[]{"obiec", Arrays.toString(new String[]{"dan", "tamara"}),}};
        System.out.println(Arrays.deepToString(ss));
    }

    @Test
    public void ccs() {
        String a = "ABCD";
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--)
            b = b + a.charAt(i);
        System.out.println(b);
    }

    @Test
    public void fileSort() throws IOException {
        File file = new File("FilePentruTXT/sort.txt");
        List<String> list = FileUtils.readLines(file, "UTF-8");
        list.sort(String::compareTo);
        System.out.println(list);
    }

    @Test
    public void copyFile() throws IOException {
        File file = new File("FilePentruTXT/sort.txt");
        File fileCopy = new File("FilePentruTXT/sortCopy.txt");
        FileUtils.copyFile(file, fileCopy);
    }

    @Test
    public void copyFileToDirectory() throws IOException {
        File file = new File("FilePentruTXT/sort.txt");
        File directoryLocation = new File("FilePentruTXT/directory");
        FileUtils.copyFileToDirectory(file, directoryLocation);
    }

    @Test
    public void moveFileToDirectory() throws IOException {
        File file = new File("FilePentruTXT/fileToMove.txt");
        File directoryLocation = new File("FilePentruTXT/moveDirectory");
        FileUtils.moveFileToDirectory(file, directoryLocation, true);
    }

    //json schema validation
    @Test
    public void get() {
        given().get(restAssuredBaseURL + "/api/users?page=2")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("JSONSchema/schema.json"))
                .body("data[4].first_name", equalTo("George"));
        System.out.println(getResponse.getBody().asString());
        Assert.assertEquals(getResponse.getStatusCode(), SC_OK);
    }

    @Test
    public void afis() {
        String s = "      sorin     ";
        System.out.println("s" + s.strip() + "s");
        System.out.println("mo =+");
    }
}

