package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.entity.Store;

@Controller
public class ProductController {

	@RequestMapping("/loadProduct")
	public String loadProductForm() {

		return "productform";
	}

	@RequestMapping("saveProduct")
	public void saveProduct(@RequestParam("prodId") int pid, @RequestParam("prodName") String pn,
			@RequestParam("price") double price) {
		System.out.println("---- Product Id: " + pid);
		System.out.println("prodName: " + pn);
		System.out.println("price: " + price);
	}

	@RequestMapping("saveProduct_v1")
	public void saveProduct_V1(@ModelAttribute Product prod) {

		System.out.println("saveProduct_v1 ----");
		System.out.println("Store : "+prod.getStore().getStoreLocation());
		System.out.println("id: "+prod.getProdId());
		System.out.println("Name: "+prod.getProdName());
		System.out.println("Price: "+prod.getPrice());

	}
	
	@RequestMapping("updateForm")
	public String updateProduct(Model prodModel) {
		
		
		Store store=new Store();
		store.setStoreId(1);
		store.setStoreLocation("Hyderabad");
		
		Product prod=new Product();
		prod.setProdId(10);
		prod.setProdName("Laptop");
		prod.setPrice(250000);
		
		prod.setStore(store); // has 'A'
		
		prodModel.addAttribute("product", prod); // request Scope
		
		
		return "updateproductForm";
	}

	@RequestMapping("/d1")
	public void f1() {
		System.out.println("----- f1 method of PoductControler class executed......");
	}

	// Display data in JSP with Model interface
	@RequestMapping("/d2")
	public String f2(Model model) {
		System.out.println("----- f2 method of PoductControler class executed......");

		model.addAttribute("name", "Praveen Reddy S");
		model.addAttribute("company", "Cognizant");

		return "welcome";
	}

	@RequestMapping("d3")
	public ModelAndView f3() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("name", "Ozvitha Fernz");
		mav.addObject("company", "CTS");
		return mav;
	}

	// Handle Client Form data

}
