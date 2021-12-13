package com.springproj.Springboot.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long departmentID;

    @NotBlank(message = "Please Add Department Name")
    /*@Length(max =5,min = 1)
    @Size(max =10, min = 0)
    @Email
    @Positive
    @Negative
    @NegativeOrZero*/
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
