package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/controller")
public class Get {
//	@GetMapping("/greeting")
//	public String getgreeting(@RequestParam("param") String param) {
//		return "test" + param;
//	}
	@GetMapping("/test")
	public String index() {
		return "hello";
	}

}
