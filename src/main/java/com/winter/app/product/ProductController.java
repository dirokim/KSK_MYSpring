

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
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
	
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String detail(HttpServletRequest request,Model model) throws Exception {
		ProductDAO productDAO = new ProductDAO();
		ProductDTO productDTO = new ProductDTO();
		String num = request.getParameter("productNum");
		productDTO.setProductNum(Long.parseLong(num));
		productDTO = productDAO.detail(productDTO);
		
		
		model.addAttribute("detail",productDTO);
		return "product/detail";	
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String list(Model model) throws Exception {
		ProductDAO productDAO = new ProductDAO();
		ProductDTO productDTO = new ProductDTO();
		List<ProductDTO> ar = productDAO.list();
		model.addAttribute("list",ar);
		

		return "product/list";

	}
}
