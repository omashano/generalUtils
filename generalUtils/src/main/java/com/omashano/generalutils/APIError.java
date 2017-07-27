package com.omashano.generalutils;

public class APIError {

    private int code;
    private String message;

    public APIError () {
        code = 0;
        message = "";
    }

    public int status () {
        return code;
    }

    public String message () {
        return message;
    }

}
