package com.mysite.addresses;

import org.junit.*;

/**
 * Test all the things to do with the addressChecker class
 */

public class TestAddressChecker {

    @Test
    public void testPostcodeValidator() {
        addressChecker validator = new addressChecker();
        String good = "EX1 1DA";
        Assert.assertTrue(validator.PostcodeValidator(good));

        String bad = "555 12";
        Assert.assertFalse(validator.PostcodeValidator(bad));
    }

    @Test
    public void testStreetNumberValidator() {

    }

}