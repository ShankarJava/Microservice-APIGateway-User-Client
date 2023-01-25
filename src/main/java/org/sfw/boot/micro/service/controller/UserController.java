package org.sfw.boot.micro.service.controller;

import java.util.List;

import org.sfw.boot.micro.service.entity.Contact;
import org.sfw.boot.micro.service.entity.User;
import org.sfw.boot.micro.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userID}")
	public User getUser(@PathVariable("userID") Long id) {
		System.out.println("UserController");
		// http://localhost:9002/contact/user/123

		User user = userService.getUser(id);
		List<Contact> contact = restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/" + user.getUserID(),
				List.class);
		user.setContacts(contact);

		return user;
	}

}
