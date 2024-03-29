package com.example.demo.modal;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
    private String firstName;
    private String lastName;
    private String title;
    private String office;
    private String email;

}
