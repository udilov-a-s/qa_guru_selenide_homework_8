package com.udilov.it.tests;

import org.junit.jupiter.api.Test;
import com.udilov.it.pages.RegistrationPage;

public class RegistrationTests extends TestBase {

    String firstName = "Alex";
    String lastName = "Udilov";
    String email = "example@examplemail.com";
    String gender = "Male";
    String mobileNumber = "9987654321";
    String day = "11";
    String month = "February";
    String year = "2020";
    String subjects = "Biology";
    String hobbies = "Sports";
    String picture = "picture.jpg";
    String currentAddress = "world";
    String state = "NCR";
    String city = "Delhi";

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fullRegistrationTest() {

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setUserNumber(mobileNumber)
                .setDateOfBirth(day, month, year)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setPicture(picture)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submitForm()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", gender)
                .checkResult("Mobile", mobileNumber)
                .checkResult("Date of Birth", day + " " + month + "," + year)
                .checkResult("Subjects", subjects)
                .checkResult("Hobbies", hobbies)
                .checkResult("Picture", picture)
                .checkResult("Address", currentAddress)
                .checkResult("State and City", state + " " + city);
    }

    @Test
    void minimalRegistrationTest() {

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setUserNumber(mobileNumber)
                .submitForm()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Gender", gender)
                .checkResult("Mobile", mobileNumber);
    }

    @Test
    void emptyRegistrationTest() {

        registrationPage.openPage()
                .submitForm()
                .checkValidation();
    }
}