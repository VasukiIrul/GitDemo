package com.capg.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {

	
	public void test()
	{
		System.out.println("Hello");
	}
}
