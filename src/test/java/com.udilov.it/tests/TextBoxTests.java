package com.udilov.it.tests;

import org.junit.jupiter.api.Test;
import com.udilov.it.pages.TextBoxPage;

public class TextBoxTests extends TestBase {

    String name = "Alex Udilov";
    String email = "example@examplemail.com";
    String currentAddress = "Titova 1";
    String permanentAddress = "Marksa 2";

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillTextBoxTest() {

        textBoxPage.openPage()
                .setFullNameInput(name)
                .setEmailInput(email)
                .setCurrentAddressInput(currentAddress)
                .setPermanentAddressInput(permanentAddress)
                .submitTextBox()
                .checkResult("name", name)
                .checkResult("email", email)
                .checkResult("currentAddress", currentAddress)
                .checkResult("permanentAddress", permanentAddress);
    }
}
