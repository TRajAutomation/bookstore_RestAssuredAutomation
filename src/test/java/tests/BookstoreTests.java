package tests;

import base.BaseTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BookstoreTests extends BaseTest {

    private static int bookId;

    @Test(priority = 1)
    public void createBook() {
        bookId =
        given()
            .contentType(ContentType.JSON)
            .body("{\"title\":\"Test Book\",\"author\":\"Author A\",\"price\":100}")
        .when()
            .post("/books/")
        .then()
            .statusCode(200)
            .body("title", equalTo("Test Book"))
            .extract().path("id");
    }

    @Test(priority = 2)
    public void readBook() {
        given()
        .when()
            .get("/books/" + bookId)
        .then()
            .statusCode(200)
            .body("id", equalTo(bookId));
    }

    @Test(priority = 3)
    public void updateBook() {
        given()
            .contentType(ContentType.JSON)
            .body("{\"title\":\"Updated Book\",\"author\":\"Author B\",\"price\":150}")
        .when()
            .put("/books/" + bookId)
        .then()
            .statusCode(200)
            .body("title", equalTo("Updated Book"));
    }

    @Test(priority = 4)
    public void deleteBook() {
        given()
        .when()
            .delete("/books/" + bookId)
        .then()
            .statusCode(200);
    }
}
