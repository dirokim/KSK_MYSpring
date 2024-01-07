package com.winter.app.product;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/product/*")
public class ProductController {
	
	@Autowired
	private ProductDAO productDAO;	
	@Autowired
	private ProductService productService;
	
	
	
	
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(ProductDTO productDTO,Model model) throws Exception {
		int result = productService.getAdd(productDTO);
	
		 String msg = "추가 실패";
		 if(result>0) {
			 msg="추가 성공";
		 }
		 model.addAttribute("msg",msg);
		 model.addAttribute("path", "./list");
		 return "commons/result";
	}
	
	@RequestMapping(value="detail",method=RequestMethod.POST)
	public void detail( )throws Exception {
		
	}
	
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String detail(Long productNum,Model model) throws Exception {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductNum(productNum);
		productDTO = productService.getDetail(productDTO);
		model.addAttribute("dto",productDTO);
		return "product/detail";	
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView list() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> ar = productService.getList();
		
		mv.addObject("list",ar);
		mv.setViewName("product/list");
		return mv;
	}
}
