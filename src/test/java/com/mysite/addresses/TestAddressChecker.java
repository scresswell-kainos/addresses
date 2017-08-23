package com.mysite.addresses;

import org.junit.*;

/**
 * Test all the things to do with the addressChecker class
 */

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