package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

		@Value("${name.value}")
		private String valuecont;
		
		@GetMapping("/message")
		public String show() {
			return valuecont;
		}
}
