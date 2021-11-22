package login;

import api.ApiHelper;
import basetest.BaseTest;
import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.PersonalAccountPage;

public class LoginBlockedUserTest extends BaseTest {
    private LoginPage loginPage = new LoginPage();//страница логина
    private PersonalAccountPage personalAccountPage = new PersonalAccountPage();//личный кабинет
    private User user = new User();//Юзер
    private String errorMessage = "Ошибка\n" +
            "Ошибка! Пользователь заблокирован";

    @Test
    public void loginBlockedUser() {
        loginPage
                .open()
                .setLogin(user.getLogin())
                .setPassword(user.getPassword())
                .clickSubmitButton()
                .getNotificationToast()
                .checkErrorMessage(errorMessage);
    }

    @BeforeEach
    public void addUser() {
        user.setStatus("blocked");
        ApiHelper.addUser(user);
    }
}
