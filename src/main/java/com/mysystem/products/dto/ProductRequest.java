package com.mysystem.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductRequest {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "created_date_time")
    private LocalDateTime createdDateTime;
}
