package com.cts.product.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.product.entity.Product;

@Controller
public class ProductController {

	@RequestMapping("/loadProduct")
	public String loadProductForm() {

		return "productform";
	}

	// load array of content either  array or collection object
	
	@RequestMapping("/loadProducts")
	public String displayProducts(Model prodModel) {
		
		String[] products= {"Pen","Book","Laptop","Mobile","Iphone"};
		List<String> listProducts=new ArrayList<>();
		
		listProducts.add("Mac Book pro");
		listProducts.add("Dell Laptop");
		listProducts.add("Mac Book Air");
		listProducts.add("Sony laptop");
		listProducts.add("HP laptop");
		
		prodModel.addAttribute("listProds",listProducts);
		
		
		prodModel.addAttribute("prods",products); // saves into request object of /loadProducts only
		 
		
		return "products";
		
		
	}
	
	@RequestMapping("updateForm")
	public String updateProduct(Model prodModel,@ModelAttribute("prodModel") Product prod) {
		
		
	List<String> listProducts=new ArrayList<>();
		
		listProducts.add("Mac Book pro");
		listProducts.add("Dell Laptop");
		listProducts.add("Mac Book Air");
		listProducts.add("Sony laptop");
		listProducts.add("HP laptop");
		
		LocalDateTime date=LocalDateTime.now();
		prod.setDate(date);
		
		prod.setListProds(listProducts);
		
		
		prodModel.addAttribute("listProds",listProducts);// request scope 
		
		prodModel.addAttribute("prod",prod);
		
		
		
		return "updateproductForm";
	}


	@RequestMapping("handleForm")
	public void handleForm(@ModelAttribute("prod") Product prod) {
		
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yy");
	//	String date=df.format(prod.getDate());
	 
		Calendar cl=Calendar.getInstance();
		cl.set(2020,9, 12);
		
		Date d=null;
		try {
			d = df.parse("12/02/19");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String date=df.format(cl);
		
		System.out.println("--- handle Form "+prod.getDate());
		System.out.println("New: "+df.format(d));
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
	
	

	// Handle Client Form data

}
