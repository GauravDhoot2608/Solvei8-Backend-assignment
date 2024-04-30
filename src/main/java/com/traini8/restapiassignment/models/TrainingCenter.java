package com.traini8.restapiassignment.models;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "training-centers")
public class TrainingCenter {

    @Id
    private String id;
    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    private String centerCode;

    @NotNull
    private Address address;

    @NotNull
    @Min(0)
    private int studentCapacity;
    private List<String> coursesOffered;
    private long createdOn;
    @Email
    private String contactEmail;

    @NotBlank
    @Pattern(regexp = "^\\+?[0-9]{10}$")
    private String contactPhone;
}
