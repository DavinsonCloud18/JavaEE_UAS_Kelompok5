package del.ac.id.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import del.ac.id.model.Produk;
import del.ac.id.service.ProdukService;

@RestController
public class ViewProdukController {
	ProdukService produkService;
	
	@RequestMapping("/admin-koperasi")
	public ModelAndView viewProduk() {
		ModelAndView mv = new ModelAndView("Koperasi");
		return mv;
	}
	@RequestMapping("/edit-produk/{id}")
	public ModelAndView editProduk(@PathVariable Integer id) {
		ModelAndView mv = new ModelAndView("Edit_ProdukKoperasi");
		Produk produk = produkService.getProduk(id);
		mv.addObject("produk",produk);
		return mv;
	}
	@RequestMapping(value="/add-produk-koperasi")
		public ModelAndView registrationSubmit(@ModelAttribute Produk produk, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
		System.out.println("Error");
		}
		ModelAndView mv = new ModelAndView("Koperasi");
		model.addAttribute("produk", produk);
		produkService.saveProduk(produk);
		return mv;
	}
	@RequestMapping("/user-kantin")
	public ModelAndView viewProdukKantin() {
		ModelAndView mv = new ModelAndView("Kantinku");
		return mv;
	}
}
