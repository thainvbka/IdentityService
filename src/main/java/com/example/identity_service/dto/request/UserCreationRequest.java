package com.example.identity_service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_VALIDATION_FAILED")
    @NotBlank(message = "username must be not null")
    String username;

    @Size(min = 8, message = "PASSWORD_VALIDATION_FAILED")
    String password;
    String firstName;
    String lastName;
    LocalDate dob;


}
