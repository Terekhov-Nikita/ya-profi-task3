package com.example.task2.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    private int number;

    private Long categoryId;

    private String name;

    private String description;

}
