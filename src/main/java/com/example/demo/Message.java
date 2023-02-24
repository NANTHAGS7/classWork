package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Message {
public String checkApi() throws JsonProcessingException{
	ApiResponse res = new ApiResponse("Hello welcome to this page");
	ObjectMapper obj = new ObjectMapper();
	return obj.writeValueAsString(res);

	}

}
