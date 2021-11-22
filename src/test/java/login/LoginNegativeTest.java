package login;

import api.ApiHelper;
import basetest.BaseTest;
import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.PersonalAccountPage;

public class LoginNegativeTest extends BaseTest {
    private LoginPage loginPage = new LoginPage();//страница логина
    private PersonalAccountPage personalAccountPage = new PersonalAccountPage();//личный кабинет
    private User user = new User();//Юзер
    private String errorMessage = "Ошибка\n" +
            "Ошибка! Неверно указан логин или пароль";

    @Test
    public void loginWithInvalidData() {
        loginPage
                .open()
                .setLogin("tester")
                .setPassword(user.getPassword())
                .clickSubmitButton()
                .getNotificationToast()
                .checkErrorMessage(errorMessage);
        loginPage
                .setLogin(user.getLogin())
                .setPassword("qwerty")
                .clickSubmitButton()
                .getNotificationToast()
                .checkErrorMessage(errorMessage);
    }

    @BeforeEach
    public void addUser() {
        user.setStatus("active");
        ApiHelper.addUser(user);
    }
}
