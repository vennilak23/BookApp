package com.books.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.books.model.User;
import com.books.service.UserService;


@Controller
@RequestMapping("auth")
public class AuthenticationController {
	
	private static final Logger LOGGER = Logger.getLogger(AuthenticationController.class);

	@Autowired
	private UserService userService;

	@GetMapping
	public String login(){
	return "user/login";	
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
		LOGGER.info("Entering Login " + username + "-" + password);

		User user = userService.findByUserNameAndPassword(username, password);
		LOGGER.info("User:" + user);
		
		if (user != null) {
			session.setAttribute("USER_LOGGED", user);
			LOGGER.info("Login Success");
			return "redirect:../book";
		} else {
			LOGGER.error("Login Failure");
			return "user/login";
		}
	}

	@GetMapping("/register")
	public String register() {
		return "user/register";
	}

	@PostMapping("/register")
	public String register(BindingResult result, @RequestParam("name") String name, @RequestParam("username") String username,
			@RequestParam("password") String password, @RequestParam("mobileNumber") String mobileNumber,
			@RequestParam("emailID") String emailID, @RequestParam("roleID") String roleID) {

		User user = new User(name, username, password, mobileNumber, emailID);
		userService.register(user);
		if(result.hasErrors())
			return "user/login";
		else
			return "redirect:../";
	}

	@GetMapping("/reset-password")
	public String resetPassword() {
		return "user/ResetPassword";
	}

	@PostMapping("/reset-password")
	public String resetPassword(@RequestParam("username") String username,
			@RequestParam("newPassword") String newPassword,
			@RequestParam("confirmNewPassword") String confirmNewPassword) {
		User user = userService.findByUserName(username);
		LOGGER.info("User:" + user);
		if (user != null)
			if (newPassword.equals(confirmNewPassword)) {
				userService.updatePassword(newPassword, username);
				return "home";
			}
		return "home";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}