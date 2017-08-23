package com.mysite.addresses;

import org.junit.*;

/**
 * Test all the things to do with the addressChecker class
 */

public class TestAddressChecker {

    @Test
    public void testValidPostcode() {
        addressChecker positiveValidator = new addressChecker();
        String goodPostcode = "EX1 1DA";
        Assert.assertTrue(positiveValidator.PostcodeValidator(goodPostcode));
    }

    @Test
    public void testInvalidPostcode() {
        addressChecker negativeValidator = new addressChecker();
        String[] badPostcodes = new String[]{"555 12"};

        for(int i=0; i< badPostcodes.length; i++){
            Assert.assertFalse(negativeValidator.PostcodeValidator(badPostcodes[i]));
        }
    }

    @Test
    public void testStreetNumberValidator() {

    }

}