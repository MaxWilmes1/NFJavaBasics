package com.github.MaxWilmes1.Ecosystem.Lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    private String id;
    private CourseName name;
    private Teacher teacher;
    private List<Student> students;


}
