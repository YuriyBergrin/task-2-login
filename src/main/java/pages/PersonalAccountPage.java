package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Личный кабинет пользователя
 */
public class PersonalAccountPage {
    public PersonalAccountPage checkPageLabelIsDisplayed() {
        $x("//h2[contains(text(),'Личный кабинет')]").shouldBe(Condition.visible);
        return this;
    }
}
