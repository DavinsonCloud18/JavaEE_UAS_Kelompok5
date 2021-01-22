package com.projectjavaee.projectjavaeeruangan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ViewRuanganController {
	 @RequestMapping("/view-ruangan")
	 public String viewRuangan() {
	 return "view-ruangan";
	 }
	 @RequestMapping("/add-ruangan")
	 public String addRuangan() {
	 return "add-ruangan";
	 }
	 @RequestMapping("/delete-ruangan")
	 public String deleteRuangan() {
	 return "delete-ruangan";
	 }
	 @RequestMapping("/update-ruangan")
	 public String updateRuangan() {
	 return "update-ruangan";
	 }

}
