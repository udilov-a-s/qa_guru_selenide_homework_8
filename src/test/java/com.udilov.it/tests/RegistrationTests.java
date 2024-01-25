package com.udilov.it.tests;

import org.junit.jupiter.api.Test;
import com.udilov.it.pages.RegistrationPage;
import com.udilov.it.testdata.TestDataForRegistrationTests;

public class RegistrationTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestDataForRegistrationTests testDataForRegistrationTests = new TestDataForRegistrationTests();

    @Test
    void fullRegistrationTest() {

        registrationPage.openPage()
                .setFirstName(testDataForRegistrationTests.firstName)
                .setLastName(testDataForRegistrationTests.lastName)
                .setEmail(testDataForRegistrationTests.email)
                .setGender(testDataForRegistrationTests.gender)
                .setUserNumber(testDataForRegistrationTests.mobileNumber)
                .setDateOfBirth(testDataForRegistrationTests.birthDay, testDataForRegistrationTests.birthMonth,
                        testDataForRegistrationTests.birthYear)
                .setSubjects(testDataForRegistrationTests.subjects)
                .setHobbies(testDataForRegistrationTests.hobbies)
                .setPicture(testDataForRegistrationTests.picture)
                .setAddress(testDataForRegistrationTests.currentAddress)
                .setState(testDataForRegistrationTests.state)
                .setCity(testDataForRegistrationTests.city)
                .submitForm()
                .checkResult("Student Name", testDataForRegistrationTests.firstName + " "
                        + testDataForRegistrationTests.lastName)
                .checkResult("Student Email", testDataForRegistrationTests.email)
                .checkResult("Gender", testDataForRegistrationTests.gender)
                .checkResult("Mobile", testDataForRegistrationTests.mobileNumber)
                .checkResult("Date of Birth", testDataForRegistrationTests.birthDay + " "
                        + testDataForRegistrationTests.birthMonth + "," + testDataForRegistrationTests.birthYear)
                .checkResult("Subjects", testDataForRegistrationTests.subjects)
                .checkResult("Hobbies", testDataForRegistrationTests.hobbies)
                .checkResult("Picture", testDataForRegistrationTests.picture)
                .checkResult("Address", testDataForRegistrationTests.currentAddress)
                .checkResult("State and City", testDataForRegistrationTests.state + " "
                        + testDataForRegistrationTests.city);
    }

    @Test
    void minimalRegistrationTest() {

        registrationPage.openPage()
                .setFirstName(testDataForRegistrationTests.firstName)
                .setLastName(testDataForRegistrationTests.lastName)
                .setGender(testDataForRegistrationTests.gender)
                .setUserNumber(testDataForRegistrationTests.mobileNumber)
                .submitForm()
                .checkResult("Student Name", testDataForRegistrationTests.firstName + " "
                        + testDataForRegistrationTests.lastName)
                .checkResult("Gender", testDataForRegistrationTests.gender)
                .checkResult("Mobile", testDataForRegistrationTests.mobileNumber);
    }

    @Test
    void emptyRegistrationTest() {

        registrationPage.openPage()
                .submitForm()
                .checkValidation();
    }
}