package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.CompanyService;

@Controller
public class CompanyController {
	ModelAndView mav = new ModelAndView();
	@Autowired
	private CompanyService companyService;
	@RequestMapping("companyaddjob.action")
	public ModelAndView companyaddjob (){
		mav.setViewName("/company/job_add");
		return mav;
	}
}