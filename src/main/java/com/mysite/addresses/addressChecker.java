package com.mysite.addresses;

public class addressChecker {

    public boolean PostcodeValidator(String postcode) {
        String regex_pattern = "(GIR 0AA)|((([A-Z-[QVX]][0-9][0-9]?)|(([A-Z-[QVX]][A-Z-[IJZ]][0-9\u200C\u200B][0-9]?)|(([A-Z-[QVX\u200C\u200B]][0-9][A-HJKSTUW])|\u200C\u200B([A-Z-[QVX]][A-Z-[IJ\u200C\u200BZ]][0-9][ABEHMNPRVWX\u200C\u200BY]))))\\s?[0-9][A-Z-[\u200C\u200BCIKMOV]]{2})";
        return postcode.matches(regex_pattern);
    }

    public boolean StreetNumberValidator(String number) {
        String regex_pattern = "[0-9]+";
        return number.matches(regex_pattern);
    }

    public boolean StreetNameValidator(String streetname) {
        String regex_pattern = "^[a-zA-Z]+$";
        return streetname.matches(regex_pattern);
    }

}
