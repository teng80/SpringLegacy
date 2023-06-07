package com.lgy.spring_test_item;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	
		ItemService itemService;
	
		@RequestMapping("/content_view")
		public String content_view(Model model) {
			log.info("@# content_view");
			
			new ItemContentService().execute(model);
		
			return "content_view";
		}
		
		@RequestMapping("/itemWrite") 
		public String itemWrite(HttpServletRequest request, Model model) {
			log.info("@# itemWrite");
			
			model.addAttribute("request", request);
			
			return "itemWrite";
		}
		
		@RequestMapping("/writeResult") 
		public String writeResult(HttpServletRequest request, Model model) {
			log.info("@# writeResult");
			
			model.addAttribute("request", request);
			itemService = new ItemWriteService();
			itemService.execute(model);
					
			
			return "writeResult";
		}
		

}
