package com.fengjing.framework.spring.dwr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DWRController {

	@RequestMapping(value="/page")
	public ModelAndView dwr(HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws Exception {
		return new ModelAndView("dwr");
	}
}
