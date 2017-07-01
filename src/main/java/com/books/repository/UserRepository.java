package com.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.books.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "select * from user where username=?1 and password=?2 and active=?3", nativeQuery = true)
	public User findByUserNameAndPassword(String userName, String password, char active);
	
	@Query(value = "select * from user where username=?1", nativeQuery = true)
	public User findByUserName(String userName);
	
	@Query(value = "update user set password = ?1 where username = ?2 and active = ?3", nativeQuery = true)
	public User updatePassword(String newPassword, String username, char active);
}