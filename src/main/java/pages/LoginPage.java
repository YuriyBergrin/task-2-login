package pages;

import com.codeborne.selenide.Selenide;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

/**
 * Страница логина
 */
public class LoginPage {
    @Getter
    private NotificationToast notificationToast = new NotificationToast();

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public LoginPage setLogin(String login) {
        $("[name='login']").clear();
        $("[name='login']").setValue(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        $("[name='password']").clear();
        $("[name='password']").setValue(password);
        return this;
    }

    public LoginPage clickSubmitButton() {
        $("[data-test-id='action-login']").click();
        return this;
    }
}
