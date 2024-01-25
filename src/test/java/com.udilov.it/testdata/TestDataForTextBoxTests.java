package com.udilov.it.testdata;

import com.github.javafaker.Faker;

public class TestDataForTextBoxTests {

    Faker faker = new Faker();
    public String name = faker.name().fullName();
    public String email = faker.internet().emailAddress();
    public String currentAddress = faker.address().fullAddress();
    public String permanentAddress = faker.address().fullAddress();
}
