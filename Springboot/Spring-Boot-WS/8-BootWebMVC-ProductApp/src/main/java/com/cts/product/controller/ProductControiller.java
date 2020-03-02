package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
//@RestController
public class ProductControiller {

	@Autowired
	private ProductService ps;

	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
	@GetMapping("loadProductsForm")
	public String loadFindProductsForm() {
		return "findproductsbynameform";
	}
	
	@GetMapping("findProductsByName")
	public String findProducts(@RequestParam("productName")String productName,Model model) {
		
		List<Product> prods=ps.findProductsByName("%"+productName+"%");
		String msg="";
		if(prods.size()==0) {
			msg="No Products Found with starting "+productName;
			model.addAttribute("msg",msg);
			return "findproductsbynameform";
		}
		model.addAttribute("products",prods);
		return "products";
	}

	@GetMapping("listProducts")
	public String listProducts(Model model) {
		List<Product> prods = ps.findAll();
		model.addAttribute("products", prods);
		return "display";
	}

	@GetMapping("loadForm")
	public String loadForm() {
		return "productform";
	}

	@GetMapping("loadFindPage")
	public String findProductForm() {
		return "findproductform";
	}

	@GetMapping("findProduct")
	public ModelAndView findProduct(@RequestParam("productId") int prodId, Model model) {
		ModelAndView mav = new ModelAndView();

		Product prod = ps.findProductById(prodId);

		String errorMsg = "";
		String viewName = "product";
		if (prod == null) {
			errorMsg = "Product Id " + prodId + " Not available in Database";
			mav.addObject("msg", errorMsg);
			viewName = "findproductform";
		}
		
		mav.addObject("product", prod);
		mav.setViewName(viewName);
		return mav;
	}
	
	@GetMapping("loadUpdateForm")
	public String loadFindUpdateForm() {
		
		return "updateproduct";
	}

	
	@GetMapping("updateFinfProduct")
	public String getUpdatedProduct(@RequestParam("productId")int prodId,Model model) {
		Product prod=ps.findProductById(prodId);
		String msg="";
		if(prod==null) {
			msg="Product Id "+prodId+" Not available";
			model.addAttribute("msg",msg);
			return "updateproduct";
		}
		model.addAttribute("product",prod);
		return "productupdateform";
	}
	
	@GetMapping("updateProduct")
	public String updateproduct(@ModelAttribute Product prod) {
		System.out.println("-------- tyest");
		ps.updateProduct(prod);
		return "redirect:listProducts";
	}
	@PostMapping("saveProduct")
	public void saveProduct(@RequestParam("productId") String pid, @RequestParam("productName") String pname,
			@RequestParam("price") double price) {
		System.out.println("Prooduct Id: " + pid);
		System.out.println("Name: " + pname);
		System.out.println("Price: " + price);

	}

	@PostMapping("saveProductV1")
	public String saveProductV1(@ModelAttribute Product prod) {
		ps.saveProduct(prod);
		return "redirect:listProducts";
	}

}
