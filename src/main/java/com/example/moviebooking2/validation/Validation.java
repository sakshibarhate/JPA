package com.example.moviebooking2.validation;

public class Validation {

    public static boolean isEmpty(String val) {
        if (val == null || val.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
