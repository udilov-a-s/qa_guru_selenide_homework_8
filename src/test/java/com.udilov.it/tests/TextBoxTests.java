package com.udilov.it.tests;

import org.junit.jupiter.api.Test;
import com.udilov.it.pages.TextBoxPage;
import com.udilov.it.testdata.TestDataForTextBoxTests;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    TestDataForTextBoxTests testDataForTextBoxTests = new TestDataForTextBoxTests();

    @Test
    void fillTextBoxTest() {

        textBoxPage.openPage()
                .setFullNameInput(testDataForTextBoxTests.name)
                .setEmailInput(testDataForTextBoxTests.email)
                .setCurrentAddressInput(testDataForTextBoxTests.currentAddress)
                .setPermanentAddressInput(testDataForTextBoxTests.permanentAddress)
                .submitTextBox()
                .checkResult("name", testDataForTextBoxTests.name)
                .checkResult("email", testDataForTextBoxTests.email)
                .checkResult("currentAddress", testDataForTextBoxTests.currentAddress)
                .checkResult("permanentAddress", testDataForTextBoxTests.permanentAddress);
    }
}
