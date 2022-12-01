package com.uom.edu.demo.controller;

import com.uom.edu.demo.dto.StudentDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class StudentController {
    @RequestMapping("/save-student")
    public String saveStudent(@ModelAttribute StudentDto StudentDto) {

        String name = "Student Name: "+StudentDto.getFirstName()+" "+StudentDto.getLastName();
        return name;
    }

}
