package com.example.demo.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiRestController {

	@GetMapping("/hi/{name}")
	public String sayHiee(@PathVariable("name") String name) {

		String hieeMsg = "Hello";
		return hieeMsg + name + "how are u";
	}

}
