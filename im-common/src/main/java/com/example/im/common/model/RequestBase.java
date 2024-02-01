package com.example.im.common.model;

import lombok.Data;

@Data
public class RequestBase {
    private String operator;

    private Integer appId;

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }
}
