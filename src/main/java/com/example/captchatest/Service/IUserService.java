package com.example.captchatest.Service;

import com.example.captchatest.Entity.User;
import java.util.List;
import java.util.Optional;

public interface IUserService {

	void createUser(User user);

	List<User> getAllUsers();

	Optional<User> getOneUser(Integer Id);

}
