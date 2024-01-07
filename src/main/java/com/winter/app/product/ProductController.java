package com.winter.app.product;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/product/*")
public class ProductController {
	
	@Autowired
	private ProductDAO productDAO;	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String detail(ProductDTO productDTO,Model model) throws Exception {

		ProductDTO productDTO = new ProductDTO();
		
		productDTO.setProductNum(productDTO);
		productDTO = productService.getDetail(productDTO);
		
		
		model.addAttribute("detail",productDTO);
		return "product/detail";	
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String list(Model model) throws Exception {

		List<ProductDTO> ar = productService.getList();
		
		model.addAttribute("list",ar);
		return "product/list";
	}
}
