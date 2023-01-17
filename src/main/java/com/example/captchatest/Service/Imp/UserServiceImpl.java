package com.example.captchatest.Service.Imp;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.captchatest.Service.IUserService;
import com.example.captchatest.Repository.UserRepository;
import com.example.captchatest.Entity.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repo;

	@Override
	public void createUser(User user) {

		repo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public Optional<User> getOneUser(Integer id) {
		return repo.findById(id);
	}

}