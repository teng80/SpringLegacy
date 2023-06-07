package com.lgy.spring_test_item;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class ItemWriteService implements ItemService{

	@Override
	public void execute(Model model) {
//		Dao에 있는 String bname, String btitle, String bcontent 값들이 필요
//		model 객체에서 꺼내서 전송
		Map<String, Object> map = model.asMap();
//		request : 컨트롤러단에서 보내주는 이름
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price")) ;
		String description = request.getParameter("description");
		
		ItemDao dao = new ItemDao();
//		dao단 호출
		dao.write(name, price, description);
	}
}
