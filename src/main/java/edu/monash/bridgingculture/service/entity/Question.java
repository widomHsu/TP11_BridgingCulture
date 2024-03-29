package edu.monash.bridgingculture.service.entity;

import lombok.Data;

// for suburb recommendation
@Data
public class Question {
    private Integer ID;
    private String questionContent;
    private String options; // separated by &
}