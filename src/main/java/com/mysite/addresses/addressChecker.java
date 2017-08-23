/**
 * Created by Sean Cresswell
 *
 * Class to check different parts of an address are valid
 *
 */
package com.mysite.addresses;

public class addressChecker {

    public boolean PostcodeValidator(String postcode) {
        // Regex pattern we found on google for valid post code
        String regex_pattern = "(GIR 0AA)|((([A-Z-[QVX]][0-9][0-9]?)|(([A-Z-[QVX]][A-Z-[IJZ]][0-9\u200C\u200B][0-9]?)|(([A-Z-[QVX\u200C\u200B]][0-9][A-HJKSTUW])|\u200C\u200B([A-Z-[QVX]][A-Z-[IJ\u200C\u200BZ]][0-9][ABEHMNPRVWX\u200C\u200BY]))))\\s?[0-9][A-Z-[\u200C\u200BCIKMOV]]{2})";
        // return boolean after attempting to match postcode to the above pattern
        return postcode.matches(regex_pattern);
    }

    public boolean StreetNumberValidator(String street_number) {
        // Regex pattern for numbers
        String regex_pattern = "[0-9]+";
        // return boolean after attempting to match street_number to the above pattern
        return street_number.matches(regex_pattern);
    }

    public boolean StreetNameValidator(String streetname) {
        // Regex pattern for alpha characters
        String regex_pattern = "^[a-zA-Z]+$";
        // return boolean after attempting to match streetname to the above pattern
        return streetname.matches(regex_pattern);
    }

}
