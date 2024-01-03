package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/regions/*")
public class RegionController {
	private RegionDAO regionDAO;
	
	public RegionController() {
		this.regionDAO = new RegionDAO();
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(RegionDTO regionDTO,Model model) throws Exception{
	
	
	 int result = this.regionDAO.add(regionDTO);
	 
	 String msg ="등록 실패";
	
	 if (result>0) {
		 msg= "등록 성공";
	 }
	 
//		request.setAttribute("msg",msg);
//		request.setAttribute("path", "./list");
	 	model.addAttribute("msg",msg);
	 	model.addAttribute("psth","./list");
		return "commons/result";
	}
	
	@RequestMapping(value="add",method= RequestMethod.GET )
	public String add() throws Exception{
		
		
		
		//WEB-INF//views/.jsp
		return "regions/add";
	}
	
	@RequestMapping(value="detail",method = RequestMethod.GET)
	public String detail(Integer region_id,Model model)throws Exception{
		
		RegionDTO regionDTO = new RegionDTO();
	
		regionDTO.setRegion_id(region_id);
		regionDTO = regionDAO.getDetail(regionDTO);
		
//		request.setAttribute("dto", regionDTO);
		model.addAttribute("dto",regionDTO);
		return "regions/detail";
	}
	
	@RequestMapping(value="list",method = RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request) throws Exception {
		System.out.println("Regions_List");
		ModelAndView mv = new ModelAndView();
		
		List<RegionDTO> ar = regionDAO.getList();
		mv.addObject("list", ar);    // 리퀘스트에 담아 보낸다  내장객체
		mv.setViewName("regions/list");
		return mv;
	}
	
	
	
	
	
	
	
}
