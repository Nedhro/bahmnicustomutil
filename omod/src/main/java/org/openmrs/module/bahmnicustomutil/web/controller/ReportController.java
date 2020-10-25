package org.openmrs.module.bahmnicustomutil.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReportController {
	
	@ResponseBody
	@RequestMapping(value = "/module/bahmnicustomutil/callMe", method = RequestMethod.GET)
	public String callMe() {
		return "Hi Atuar";
	}
	
	@RequestMapping(value = "/module/bahmnicustomutil/index", method = RequestMethod.GET)
	public String index() {
		return "/module/bahmnicustomutil/index";
	}
}
