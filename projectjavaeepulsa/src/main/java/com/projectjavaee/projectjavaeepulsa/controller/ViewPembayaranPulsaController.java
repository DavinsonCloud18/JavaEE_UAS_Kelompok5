package com.projectjavaee.projectjavaeepulsa.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ViewPembayaranPulsaController {
	
	@RequestMapping("/view-pembayaranpulsa")
	 public String viewPembayaranPulsa() {
	 return "view-pembayaranpulsa";
	 }
	 @RequestMapping("/add-pembayaranpulsa")
	 public String addPembayaranPulsa() {
	 return "add-pembayaranpulsa";
	 }
	 @RequestMapping("/delete-pembayaranpulsa")
	 public String deletePembayaranPulsa() {
	 return "delete-pembayaranpulsa";
	 }
	 @RequestMapping("/update-pembayaranpulsa")
	 public String updatePembayaranPulsa() {
	 return "update-pembayaranpulsa";
	 }
}
