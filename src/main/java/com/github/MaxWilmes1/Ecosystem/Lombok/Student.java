package com.github.MaxWilmes1.Ecosystem.Lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String address;
    private double grade;

}
