package com.example.demo.modal;
import java.util.Date;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String className;
    private Instructor instructor;
    private Date startDate;
    private Date endDate;
    private String timeFreame;

}
