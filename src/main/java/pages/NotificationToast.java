package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

/**
 * Тост с уведомлением
 */
public class NotificationToast {
    public NotificationToast checkErrorMessage(String errorMessage) {
      $("[data-test-id='error-notification']").shouldHave(Condition.text(errorMessage));
        return this;
    }
}
