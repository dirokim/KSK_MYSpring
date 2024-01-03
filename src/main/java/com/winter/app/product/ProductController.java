package com.winter.app.product;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/product/*")
public class ProductController {

	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String detail(ProductDTO productDTO) {
		
		
		
		return null;	
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String list(HttpServletRequest request) {
		ProductDAO productDAO = new ProductDAO();
		ProductDTO productDTO = new ProductDTO();
		
		productDAO.list();
		
		return null;
	}
}
