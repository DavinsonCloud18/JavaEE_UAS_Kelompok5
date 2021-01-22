package del.ac.id.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ViewRuanganController {
	@RequestMapping("/user-detail-ruangan")
	public ModelAndView viewDetailRuangan() {
		ModelAndView mv = new ModelAndView("detailruangan");
		return mv;
	}
}
