package del.ac.id.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ViewPemesananRuanganController {
	 @RequestMapping("/view-pemesananruangan")
	 public String viewPemesananRuangan() {
	 return "view-pemesananruangan";
	 }
	 @RequestMapping("/add-pemesananruangan")
	 public String addPemesananRuangan() {
	 return "add-pemesananruangan";
	 }
	 @RequestMapping("/delete-pemesananruangan")
	 public String deletePemesananRuangan() {
	 return "delete-pemesananruangan";
	 }
	 @RequestMapping("/update-pemesananruangan")
	 public String updatePemesananRuangan() {
	 return "update-pemesananruangan";
	 }
}
