package com.S4.HW0401.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HelloWorldResponse
{
    @JsonProperty("hello")
    private final String name;
}
