package com.xyz.java8.lambda;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Persion {
    private int id;
    private String name;
    private String address;
}
