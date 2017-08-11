package pl.ordersapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.ordersapp.entity.User;
import pl.ordersapp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	//Creates Data Transfer Object - UserDTO which holds data from registration form
	@ModelAttribute("userDTO") //corresponds to commandName attribute in form
	public User constructUserDTO() {
		return new User(); // this is shortcut. normally should create class UserDTO holding data before persistance
	}
	
	@RequestMapping("/users")
	public String users(Model model) {
		model.addAttribute("users", userService.findAllUsers());
		return "users";
	}
	
	@RequestMapping("/users/{id}")
	public String detail(Model model, @PathVariable int id) {
		model.addAttribute("users", userService.findOneWithUserOrder(id));
		return "user-detail";

	}
	@RequestMapping("/register")
	public String showRegisterForm(){
		return "user-register";
	}

	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String showRegisterForm(@ModelAttribute("userDTO") User userDTO){
		userService.save(userDTO);
		return "user-register";
	}

}
