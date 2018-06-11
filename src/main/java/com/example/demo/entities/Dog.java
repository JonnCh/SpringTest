package com.example.demo.entities;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="DOGS")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;

}
