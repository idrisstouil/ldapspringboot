package com.ldap.ldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homeressource {
@GetMapping("/")
public String index() {
	return "home page";
}
}
