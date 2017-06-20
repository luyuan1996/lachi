package service;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import pojo.User;

public interface UserService {
	ModelAndView mav = new ModelAndView();
	User findByUsername(String name);

	void AddUser(User user);

	ModelAndView login(User user, HttpSession session);

}
