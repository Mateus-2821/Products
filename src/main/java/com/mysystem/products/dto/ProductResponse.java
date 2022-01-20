package com.mysystem.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    @JsonProperty(value = "product_id")
    private Integer productId;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "description")
    private String description;

}
