package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestDto {

        private Integer id;

        @Size(min = 6, max = 45, message = "'username' can be minimum 6 character and maximum 45 characters")
        @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$", message = "username must be of 6 to 12 length with no special characters")
        private String username;

        @NotNull
        @Pattern(regexp = "^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[@#$%^&+=]).{8,20}$+")
        private String password;

        @NotNull
        @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
        @Size(min = 6, max = 45, message = "'firstname' can be minimum 6 character and maximum 45 characters")
        private String firstName;

        @NotNull
        @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
        @Size(min = 6, max = 45, message = "'lastname' can be minimum 6 character and maximum 45 characters")
        private String lastName;


        private LocalDate dateOfBirth;


        @NotNull
        @Pattern(regexp="(^$|[0-9]{10})", message = "'mobile number' can only contain number")
        @Size(min=10, max=10,message = "'mobile number' should be 10 digit")
        private String mobile;

        @NotNull
        @Email
        @Size(min = 10, max = 25, message = "'email' can be minimum 10 character and maximum 26 characters")
        private String email;
}
