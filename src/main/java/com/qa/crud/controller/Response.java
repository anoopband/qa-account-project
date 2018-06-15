package com.qa.crud.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty("message")
    private String message;

    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
