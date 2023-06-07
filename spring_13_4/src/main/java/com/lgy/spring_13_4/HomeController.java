package com.lgy.spring_13_4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
	// 	주소?name="여기있는값을 읽음"
	public void name(@RequestParam(value =  "name", required = false) String name) {
		
		// jsp 할때  request.getParameter(""); 랑 똑같은거
	}
	
	public void name2(@RequestParam("id") String id) {
		// 위에랑 같음,  대신 값이 없으면 에러발생 ( 에러발생 유무 차이 )
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
//	@PathVariable : 경로의 값{studentId}을 받는다
//	@RequestMapping("student/{studentId}")
	@RequestMapping("student/{studentId777}")
//	public String getStudent(@PathVariable String studentId, Model model) {
	public String getStudent(@PathVariable String studentId777, Model model) {
//		model.addAttribute("studentId", studentId);
		model.addAttribute("studentId", studentId777); //이름 맞춰야함
		
		return "student/studentView";
	}
}
