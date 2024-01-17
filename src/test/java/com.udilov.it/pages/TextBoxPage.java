package com.udilov.it.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    public TextBoxPage openPage() {

        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    private final SelenideElement fullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit");

    public TextBoxPage checkResult(String id, String value) {

        $("#output #" + id).shouldHave(text(value));
        return this;
    }

    public TextBoxPage setFullNameInput(String value) {

        fullNameInput.setValue(value);
        return this;
    }

    public TextBoxPage setEmailInput(String value) {

        emailInput.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddressInput(String value) {

        currentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddressInput(String value) {

        permanentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage submitTextBox() {

        submitButton.click();
        return this;
    }
}
