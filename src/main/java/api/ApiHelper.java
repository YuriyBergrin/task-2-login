package api;

import models.User;

import static io.restassured.RestAssured.given;

/**
 * Помошник api
 */
public class ApiHelper extends Config {
    /**
     * Добавление юзера
     * @param user - юзер
     */
    public static void addUser(User user) {
        given()
                .spec(requestSpec)
                .body(user)
                .post("/api/system/users");
    }
}
