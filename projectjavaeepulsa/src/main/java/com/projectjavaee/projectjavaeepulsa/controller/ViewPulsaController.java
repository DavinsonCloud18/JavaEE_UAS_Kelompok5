package com.projectjavaee.projectjavaeepulsa.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ViewPulsaController {
	@RequestMapping("/view-pulsa")
	 public String viewPulsa() {
	 return "view-pulsa";
	 }
	 @RequestMapping("/add-pulsa")
	 public String addPulsa() {
	 return "add-pulsa";
	 }
	 @RequestMapping("/delete-pulsa")
	 public String deletePulsa() {
	 return "delete-pulsa";
	 }
	 @RequestMapping("/update-pulsa")
	 public String updatePulsa() {
	 return "update-pulsa";
	 }
}
