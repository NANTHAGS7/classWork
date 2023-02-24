package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/")
    private String homepage() {
    	return "Welcome to this page";
    }
    
	@GetMapping("/lists")
    public List<Student> getList(){
    	List<Student> detailsList = new ArrayList<>();
    	detailsList.add(new Student(1,"name1",1));
    	detailsList.add(new Student(2,"name2",2));
    	detailsList.add(new Student(3,"name3",3));
    	detailsList.add(new Student(4,"name4",4));
    	return detailsList;
    }
}