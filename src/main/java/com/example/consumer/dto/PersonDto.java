package com.example.consumer.dto;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Data
public class PersonDto {
    private String name;
    private String surname;
    private String middlename;
    private LocalDate birthdate;
}
