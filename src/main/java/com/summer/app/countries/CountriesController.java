package com.summer.app.countries;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="countries/*")
public class CountriesController {

	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public String list(HttpServletRequest request) throws Exception {
		System.out.println("Countries_List");
		CountryDAO countryDAO = new CountryDAO();
		List<CountryDTO> ar = countryDAO.getList();
		request.setAttribute("list", ar);
		return "Countries/list";
		
	}
}
