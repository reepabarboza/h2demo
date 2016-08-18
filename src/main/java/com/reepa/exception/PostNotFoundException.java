package com.reepa.exception;

/**
 * Created by pradeep on 18-06-2016.
 */
public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String msg) {
        super(msg);
    }
}
