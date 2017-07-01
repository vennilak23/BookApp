package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.model.User;
import com.books.repository.UserRepository;



@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findByUserNameAndPassword(String userName, String password) {
		return userRepository.findByUserNameAndPassword(userName, password, 'A');
	}
	
	public User findByUserName(String userName){
		return userRepository.findByUserName(userName);
	}

	public User register(User user){
		return userRepository.save(user);
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	public User updatePassword(String newPassword, String username) {
		return userRepository.updatePassword(newPassword, username, 'A');
		
	}

}
