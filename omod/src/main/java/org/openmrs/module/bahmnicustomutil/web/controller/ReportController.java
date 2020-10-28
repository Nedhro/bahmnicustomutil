package org.openmrs.module.bahmnicustomutil.web.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;

@Controller
public class ReportController {
	
	@ResponseBody
	@RequestMapping(value = "/module/bahmnicustomutil/callMe", method = RequestMethod.GET)
	public String callMe() {
		return "Hi Atuar";
	}
	
	@ResponseBody
	@RequestMapping(value = "/module/bahmnicustomutil/getFileName", method = RequestMethod.GET)
	public String getFileName() {
		File file = null;
		try {
			file = new ClassPathResource("customer.jrxml").getFile();
		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
		String name = file.getName();
		return name;
	}
	
	@RequestMapping(value = "/module/bahmnicustomutil/index", method = RequestMethod.GET)
	public String index() {
		return "/module/bahmnicustomutil/index";
	}
}
