package com.siit.springhomework.exception;

import org.springframework.core.NestedRuntimeException;

public class SingerNotFoundException extends NestedRuntimeException {

    public SingerNotFoundException(String message) {
        super(message);
    }
}
