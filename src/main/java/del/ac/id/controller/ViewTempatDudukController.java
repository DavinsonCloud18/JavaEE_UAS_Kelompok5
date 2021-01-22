package del.ac.id.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ViewTempatDudukController {
	@RequestMapping("/view-tempat-duduk")
	public ModelAndView viewTempatDuduk() {
		ModelAndView mv = new ModelAndView("TempatDuduk");
		return mv;
	}
}
