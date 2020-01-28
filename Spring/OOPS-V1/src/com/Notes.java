package com;

public class Notes {
	
	/*
	 *         1. design packages
	 *         note: package name depends on the layers in your application
	 *         
	 *         Layers in Java Application
	 *         ----------------------------
	 *         => Persistence layer / DAO / Entity /repository (Data access object)  (should have database code business logic only)
	 *         => Service layer ( should have java business logic only) 
	 *         => Controller layer / client / request,response processing logic 
	 *         
	 *         ==============================================================
	 *         
	 *         1. Any application (web, stand alone) should invoke Controller class 
	 *         2. Controller class should create objects of service classes only. It must not create DAO objects
	 *         3. Service classes should interact with DAO classes and passes the DAO data to Controller classes
	 *         
	 *         What is a controller?
	 *         	=> Controller device which service should be executed when? 
	 *         
	 *        
	 *      ================================================================
	 * 
	 * 
	 *          I am developing product application
	 *          
	 *          package names.
	 *          -----------------------
	 *          
	 *          1. com.cts.product.dao
	 *          2. com.cts.product.service
	 *          3. com.cts.product.controller
	 *          4. com.cts.product.utils
	 *          5. com.cts.product.model // also called POJO (Plain old java object) / Bean
	 *          
	 *          //----------------------------------------------------------------------------------------
	 *          
	 *          
	 *    DAO and DTO 
	 *    ----------------
	 *    DAO uses DTO class objects to transfer data from Controller/Service layers 
	 *    
	 *    Design
	 *    ---------
	 *    1. Start from Model classes 
	 *    2. Design / Create all DAO classes and their interfaces
	 *    3. Design / Create all Service classes and their interfaces
	 *    4. Inject DAO Object into Service class by using DI principles
	 *    5. Invoke Service class methods from Controller class by creating service class objects
	 *    
	 *    
	 *    
	 *    
	 *    
	 *    
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
