package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class NegativeTests extends BaseTest {

    @Test
    public void getNonExistingBook() {
        given()
        .when()
            .get("/books/99999")
        .then()
            .statusCode(404);
    }

    @Test
    public void createBookWithInvalidPayload() {
        given()
            .body("{invalidJson}")
        .when()
            .post("/books/")
        .then()
            .statusCode(422);
    }
}
