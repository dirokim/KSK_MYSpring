package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;


@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSeesion;
	private final String namespace = "com.winter.app.product";
	
	
	//c리스트 r추가 u수정하기 d삭제하기 
	public int delete() {
		return 0;
		
	}
	public int update() {
		return 0;
		
	}
	public int add() throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "INSERT INTO PRODUCT VALUES(?,?,?,?,?)";
		
		
		
		return 0;
	}
	
	
	public ProductDTO detail(ProductDTO productDTO) throws Exception{
		 return  sqlSeesion.selectOne(namespace+"detail",productDTO);
	}
	
	public List<ProductDTO> list() throws Exception{
		return	 sqlSeesion.selectList(namespace+"lsit");
	}
}
