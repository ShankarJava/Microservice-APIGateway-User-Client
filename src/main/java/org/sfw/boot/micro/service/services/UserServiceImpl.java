package org.sfw.boot.micro.service.services;

import java.util.List;

import org.sfw.boot.micro.service.entity.User;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(new User(123L, "Shankar", 87901234), new User(124L, "Divya", 65432109));

	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserID().equals(id)).findAny().orElse(null);
	}

}
