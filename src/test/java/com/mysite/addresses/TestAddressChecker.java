package com.mysite.addresses;

import org.junit.*;

public class TestAddressChecker {

    @Test
    public void testPostcodeValidator() {
        String good = "EX1 1DA";
        String bad = "555 12";

        addressChecker validator = new addressChecker();

        Assert.assertTrue(validator.PostcodeValidator(good));
        Assert.assertFalse(validator.PostcodeValidator(bad));
    }

    @Test
    public void testStreetNumberValidator() {

    }

}