package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;
import service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("findByUsername.do")
	public void checkname(HttpServletRequest req, HttpServletResponse resp,User user,String name)
			throws ServletException, IOException {
		 user = userService.findByUsername(name);
		 
		if(user==null){
			resp.getWriter().print("用户名可以使用");
		}else{
			resp.getWriter().print("用户名已存在请重新输入");
		}
	}
	ModelAndView mav = new ModelAndView();
	@RequestMapping("personalregister.do")
	public ModelAndView register1(User user,HttpSession session){
		
		mav.setViewName("/personal/index");
		userService.AddUser(user);
		session.setAttribute("user", user);
		return mav;
	}
	@RequestMapping("logout.do")
	public ModelAndView userlogout(HttpSession session){
		session.invalidate();
		mav.setViewName("index");
		return mav;
	}
	@RequestMapping("userlogin.do")
	public ModelAndView userlogin (User user,HttpSession session){
		mav = userService.login(user,session);
		return mav;
	}
	@RequestMapping("usercenter.action")
	public ModelAndView usercenter(){
		mav.setViewName("/personal/index");
		return mav;
	}
	
	@RequestMapping("personaladdresume.action")
	public ModelAndView personaladdresume(){
		mav.setViewName("/personal/resume_1");
		return mav;
	}
	
	
}
















