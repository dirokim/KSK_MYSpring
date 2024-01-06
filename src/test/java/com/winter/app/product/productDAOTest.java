package com.winter.app.product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class productDAOTest extends MyTest {
	
	@Autowired
	private ProductDAO productDAO;
	
	public void getListTest() throws Exception {
		List<ProductDTO> ar = productDAO.list();
		assertEquals(0,ar);
		
	}
	
	
}
