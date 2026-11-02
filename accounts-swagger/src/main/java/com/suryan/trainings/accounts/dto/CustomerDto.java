package com.suryan.trainings.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {
    @NotEmpty(message = "Customer name shouln't be Empty String")
    @Size(min = 5, max = 50, message = "Customer name length should in between 5-50 characters")
    private String name;
    private String email;
    @Pattern(regexp="(^$|[0-9]{10})", message ="MobileNumber must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
