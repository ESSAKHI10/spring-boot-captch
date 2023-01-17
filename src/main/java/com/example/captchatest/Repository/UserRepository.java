package com.example.captchatest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.captchatest.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}