package com.hackathon.avengers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CodeSystemDto {

    @JsonProperty("code")
    private String code;

    @JsonProperty("value")
    private String value;

    public CodeSystemDto() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
