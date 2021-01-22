package del.ac.id.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ViewPulsaController {
	@RequestMapping("/view-detailpulsa")
	public ModelAndView viewPulsa() {
		ModelAndView mv = new ModelAndView("detailpulsa");
		return mv;
	}
}
