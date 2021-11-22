package login;

import api.ApiHelper;
import basetest.BaseTest;
import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.PersonalAccountPage;

public class LoginActiveUserTest extends BaseTest {
    private LoginPage loginPage = new LoginPage();//страница логина
    private PersonalAccountPage personalAccountPage = new PersonalAccountPage();//личный кабинет
    private User user = new User();//Юзер

    @Test
    public void loginActiveUser() {
        loginPage
                .open()
                .setLogin(user.getLogin())
                .setPassword(user.getPassword())
                .clickSubmitButton();
        personalAccountPage.checkPageLabelIsDisplayed();
    }

    @BeforeEach
    public void addUser() {
        user.setStatus("active");
        ApiHelper.addUser(user);
    }
}
