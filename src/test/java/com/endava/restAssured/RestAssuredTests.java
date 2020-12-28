package com.endava.restAssured;

import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class RestAssuredTests extends BaseTest {

    @Before
    public void baseSetup() {
        setUpRestAssured();
    }

    //get request
    @Test
    public void bodyContainsName() {
        Response response = given()
                .header("Content-Type", "application/json")
                .get("/api/users?page=2");

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("data[0].first_name"), "Michael");
        assertEquals(response.jsonPath().get("data[1].first_name"), "Lindsay");
    }

    @Test
    public void bodyContainsListOfUsers() {
        Response response = given()
                .header("Content-Type", "application/json")
                .get("/api/unknown");

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("data[2].name"), "true red");
        assertEquals(response.jsonPath().get("data[3].year"), Integer.valueOf("2003"));
    }

    @Test
    public void userWithSpecifiedNameNotFound() {
        Response response = given()
                .header("Content-Type", "application/json")
                .get("/api/unknown/23");

        assertEquals(response.getStatusCode(), 404);
    }

    //post request
    @Test
    public void createUser() {
        Response response = given()
                .log()
                .all()
                .body("{\n"
                        + " \"name\": \"morpheus\",\n"
                        + " \"job\": \"leader\"\n"
                        + "}")
                .post("/api/users");

        assertEquals(response.getStatusCode(), 201);
        assertEquals(response.jsonPath().get("name"), "morpheus");
        assertEquals(response.jsonPath().get("job"), "leader");
    }

    @Test
    public void registerUser() {
        Response response = given()
                .log()
                .all()
                .body("{\n"
                        + " \"email\": \"eve.holt@reqres.in\",\n"
                        + " \"password\": \"pistol\"\n"
                        + "}")
                .post("/api/register");

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("id"), Integer.valueOf("4"));
        assertEquals(response.jsonPath().get("token"), "QpwL5tke4Pnpja7X4");
    }

    //put request
    @Test
    public void updateInfoAboutUserWithTimeResponse() {
        Response response = given()
                .log()
                .all()
                .body("{\n"
                        + " \"name\": \"morpheus\",\n"
                        + " \"job\": \"zion resident\"\n"
                        + "}")
                .put("/api/users/2");

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("job"), "zion resident");
        System.out.println("Response Time : " + response.getTimeIn(TimeUnit.SECONDS));
    }

    //patch request
    @Test
    public void updateSpecifiedInfoAboutUserWith() {
        Response response = given()
                .log()
                .all()
                .body("{\n"
                        + " \"name\": \"morpheus\",\n"
                        + " \"job\": \"The master of Zion\"\n"
                        + "}")
                .patch("/api/users/2");

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("job"), "The master of Zion");
        System.out.println("Response Time : " + response.getTimeIn(TimeUnit.SECONDS));
    }

    //delete request
    @Test
    public void deleteUser() {
        given()
                .delete("/api/users/2")
                .then()
                .assertThat()
                .statusCode(204)
                .log();
    }
}
