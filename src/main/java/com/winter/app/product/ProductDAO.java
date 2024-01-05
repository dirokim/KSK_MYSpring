package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.winter.app.util.DBConnector;

public class ProductDAO {
	
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
		Connection con = DBConnector.getConnector();
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCTNUM = ?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, productDTO.getProductNum());
		
		ResultSet rs = st.executeQuery();
		
		productDTO = null;
		while(rs.next()){
			productDTO = new ProductDTO();
			productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductName(rs.getString("PRODUCTNAME"));
			productDTO.setProductContents(rs.getString("PRODUCTCONTENTS"));
			productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
			productDTO.setProductJumsu(rs.getDouble("PRODUCTJUMSU"));
		}
		
		DBConnector.disConnect(rs, st, con);
		return productDTO;
	}
	
	public ArrayList<ProductDTO> list() throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "SELET * FROM PRODUCT";
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		ArrayList<ProductDTO> ar = new ArrayList(); 
		while(rs.next()){
			ProductDTO productDTO = new ProductDTO();
			productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductName(rs.getString("PRODUCTNAME"));
			productDTO.setProductContents(rs.getString("PRODUCTCONTENTS"));
			productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
			productDTO.setProductJumsu(rs.getDouble("PRODUCTJUMSU"));
			ar.add(productDTO);
		}
		
		DBConnector.disConnect(rs, st, con);
		return ar;
	}
}
