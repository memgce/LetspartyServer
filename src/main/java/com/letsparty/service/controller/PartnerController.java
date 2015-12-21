package com.letsparty.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.letsparty.service.PartnerBean;
import com.letsparty.service.dao.PartnerDao;

@Controller
public class PartnerController {

	
	private PartnerDao partnerDao = new PartnerDao();
	@RequestMapping("/welcome")
	@ResponseBody 
	public Object getPartner(){
		System.out.println("spring mvc hello world!"); 
		/*PartnerBean partner = new PartnerBean();
		partner.setId(100);
		partner.setName("test");
		partner.setNickName("test   test");*/
		return partnerDao.getList();
	}
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("hello", "message", message);
	}
}
