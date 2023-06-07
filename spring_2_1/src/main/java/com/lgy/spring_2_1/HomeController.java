package com.lgy.spring_2_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
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
		
		return "home"; // home.html 을 보여줌
		// 보여줄때 home.html 에서  serverTime 를 갖고가서 쓸 수 있음
		// 이걸 model 이라고함
		
		// ${객체명.값}
		// ${serverTime}
	}
	
	
	
	@RequestMapping("/test")
	@ResponseBody
	public String TestPage() {
		
		TestProduct t = new TestProduct();
		t.set
		
		return "test";
	}
}


@Data
class TestProduct {
	
	private String name;
	private int price;
	
}
