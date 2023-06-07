package com.lgy.spring_test_item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ItemDao {
DataSource dataSource;
	
	public ItemDao() {
//		dbcp 방식으로 oracle 연결
		try {
			Context context=new InitialContext();
//			context.xml 에 설정(server.xml 과 달리 한번 설정으로 모든 프로젝트에서 사용가능)
//			dataSource : 조회,저장,수정,삭제 쿼리에 모두 사용 가능
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void write(String name, int price, String description) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="insert into mvc_item(name, price, description) "
					+ "values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, price);
			pstmt.setString(3, description);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public ArrayList<ItemDto> contentView() {
		
		log.info("@# contentView 메소드 실행");
		
		ItemDto dto = null;
		ArrayList<ItemDto> dtos = new ArrayList<ItemDto>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="select name, price, description"
					+ " from mvc_item";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		
			log.info("@# select 보냄");
			
			while ( rs.next() ) {
				log.info("@# select 결과있음");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String description = rs.getString("description");
				
//				하나의 게시글 객체
				dto = new ItemDto(name, price, description);
				
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
}
