package com.lgy.spring_test_item;

import java.util.ArrayList;
import org.springframework.ui.Model;


public class ItemContentService implements ItemService{
	@Override
	public void execute(Model model) {
		
		//dao 호출
		ItemDao dao = new ItemDao();
//		게시글 하나의 내용을 BDto 객체로 받음(bid(글번호)를 넘겨서 select 쿼리 처리)
//		ItemDto dto = dao.contentView(name);
		ArrayList<ItemDto> dto = dao.contentView();
//		dto 객체를 모델에 추가(뷰에서 꺼내 사용할 수 있음)
		model.addAttribute("content_view", dto);
	}
}
