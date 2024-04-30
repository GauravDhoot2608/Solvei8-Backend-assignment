package com.traini8.restapiassignment.payloads;

import com.traini8.restapiassignment.models.Address;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TrainingCenterRequest {

    @NotBlank(message = "center name must not be blank.")
    @Size(max = 40 , message = "center name contains less than 40 characters.")
    private String centerName;
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$" , message = "center code contains exactly 12 character Alphanumeric")
    private String centerCode;
    @Valid
    private Address address;
    private Integer studentCapacity;
    private List<String> coursesOffered;
    @Email(message = "email must be in valid format. eg: example@mail.com")
    private String contactEmail;

    @NotBlank(message = "contact phone must not be blank.")
    @Pattern(regexp = "^\\+?[0-9]{10}$" , message = "contact phone must have 10 integer value. eg: 9999999999")
    private String contactPhone;
}
