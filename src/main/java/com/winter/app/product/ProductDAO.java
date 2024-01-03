package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.summer.app.util.DBConnector;

public class ProductDAO {
	
	//c리스트 r추가 u수정하기 d삭제하기 
	public int delete() {
		return 0;
		
	}
	public int update() {
		return 0;
		
	}
	public int add() {
		return 0;
		
	}
	public ProductDTO detail() {
		return null;
		
	}
	public void list(){
		Connection con = DBConnector.getConnector();
		String sql = "SELET * FROM PRODUCT";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		
		
		List<ProductDTO> ar = List<ProductDTO>;
		
	}
	
	
	
	
}
