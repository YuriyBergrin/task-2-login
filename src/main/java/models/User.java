package models;

import com.github.javafaker.Faker;
import lombok.Data;

import java.util.Locale;

/**
 * Юзер
 */
@Data
public class User {
    private String login;
    private String password;
    private String status;

    public User() {
        setFakeData();
    }

    /**
     * Задаем юзеру фейковые данные
     */
    private void setFakeData() {
        Faker faker = new Faker(new Locale("en_US."));
        login = faker.name().username();
        password = faker.internet().password();
    }
}
