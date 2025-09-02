package utils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class TokenManager {
    private static String token;

    public static String getToken() {
        if (token == null) {
            token = generateToken();
        }
        return token;
    }

    private static String generateToken() {
        return given()
                .contentType(ContentType.JSON)
                .body("{\"username\":\"admin\",\"password\":\"admin123\"}")
                .when()
                .post("http://localhost:8000/auth/login")
                .then()
                .statusCode(200)
                .extract()
                .path("access_token"); // adjust to actual JSON response
    }
}
