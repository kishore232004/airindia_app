package com.airindia_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.airindia_app.entity.Passanger;
import com.airindia_app.service.PassaangerService;

@Controller
public class PassangerController {
	@Autowired
	private PassaangerService Passerve;
	@RequestMapping("/show")
	public String show() {
		return"show";
	}
	
	//http://localhost:8080/show
	@RequestMapping("/savePass")
	public String savedata(Passanger Pass) {
		Passerve.savedataInfo(Pass);
		return"show";
		
	}
	//http://localhost:8080/listall
	@RequestMapping("/listall")
	public String listallPassanger(Passanger pass,ModelMap model) {
		List<Passanger> Passdata = Passerve.listallPass(pass);
		model.addAttribute("Passdata", Passdata);
		return "listall";
		
	}
	//deletepass
	@RequestMapping("/deletepass")
	public String deletepass(@RequestParam("id")long id,ModelMap model,Passanger pass) {
		Passerve.deletePassbyID(id);
	
	List<Passanger> Passdata = Passerve.listallPass(pass);
	model.addAttribute("Passdata", Passdata);
	return "listall";
	}

}
