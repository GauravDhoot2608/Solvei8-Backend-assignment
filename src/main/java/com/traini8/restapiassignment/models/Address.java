package com.traini8.restapiassignment.models;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @NotBlank(message = "detailed address must required")
    private String detailedAddress;
    @NotBlank(message = "city must required")
    private String city;
    @NotBlank(message = "state must required")
    private String state;
    @NotBlank(message = "pincode must required")
    private String pincode;
}
