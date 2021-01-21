package com.example.projectjavaeepaket.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ViewJasaPengirimanController {

	@RequestMapping("/view-jasapengiriman")
	 public String viewJasaPengiriman() {
	 return "view-jasapengiriman";
	 }
	 @RequestMapping("/add-jasapengiriman")
	 public String addJasaPengiriman() {
	 return "add-jasapengiriman";
	 }
	 @RequestMapping("/delete-jasapengiriman")
	 public String deleteJasaPengiriman() {
	 return "delete-jasapengiriman";
	 }
	 @RequestMapping("/update-jasapengiriman")
	 public String updateJasaPengiriman() {
	 return "update-jasapengiriman";
	 }
}
