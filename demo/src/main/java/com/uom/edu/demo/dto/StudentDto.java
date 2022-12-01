package com.uom.edu.demo.dto;

public class StudentDto {
    private Integer id;
    private String firstName;
    private String lastName;

    public StudentDto(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public StudentDto(){}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



}
