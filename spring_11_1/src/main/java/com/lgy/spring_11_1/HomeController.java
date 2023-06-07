package com.lgy.spring_11_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	url 의 http://localhost:8181/spring_11_1/ 에서 요청을 받음(get 방식)
//	@RequestMapping : url 주소의 프로젝트 뒷부분 해당
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; //home.jsp
	}

	
	// 기본주소:  http://아이피주소:톰캣포트번호/패키지이름
	// 추가주소: value=값에 적은거,    /user/login
	// 최종주소 = 기본주소(http://아이피주소:톰캣포트번호/패키지이름) + 추가주소니까(/user/login)
	// 결론: http://아이피주소:톰캣포트번호/패키지이름/user/login
	
//	@RequestMapping("/user/login")
//	public String home() {
//		return "로그인 페이지로 쓸 jsp 이름을 여기다 쓰면 됨"; 
//	}

	//		<beans:property name="prefix" value="/WEB-INF/views/" />
	//      <beans:property name="suffix" value=".jsp" />

	//      /WEB-INF/views/로그인 페이지로 쓸 jsp 이름을 여기다 쓰면 됨.JSP
	
	
	
}
