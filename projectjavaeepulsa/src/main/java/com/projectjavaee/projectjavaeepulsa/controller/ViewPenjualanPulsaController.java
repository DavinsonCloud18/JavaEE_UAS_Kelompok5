package com.projectjavaee.projectjavaeepulsa.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ViewPenjualanPulsaController {
	@RequestMapping("/view-penjualanpulsa")
	 public String viewPenjualanPulsa() {
	 return "view-penjualanpulsa";
	 }
	 @RequestMapping("/add-penjualanpulsa")
	 public String addPenjualanPulsa() {
	 return "add-penjualanpulsa";
	 }
	 @RequestMapping("/delete-penjualanpulsa")
	 public String deletePenjualanPulsa() {
	 return "delete-penjualanpulsa";
	 }
	 @RequestMapping("/update-penjualanpulsa")
	 public String updatePenjualanPulsa() {
	 return "update-penjualanpulsa";
	 }
}
