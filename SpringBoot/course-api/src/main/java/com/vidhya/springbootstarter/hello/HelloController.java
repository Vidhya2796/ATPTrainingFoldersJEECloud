package com.vidhya.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
		
		@RequestMapping("hell")
		public String sayHello() {
			return "Hello Vidhya";
		}
}
