package com.example.pc.forwardcam_new;

/**
 * Created by khsbs on 2017-09-08.
 */

public class ServerResponse {

    private String result;
    private String message;
    private int value;
    private User user;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public int getValue() { return value; }

    public User getUser() {
        return user;
    }
}