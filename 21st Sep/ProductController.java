package com.unext.RestCrudDemo.Controller;

import java.net.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unext.RestCrudDemo.Exception.InvalidProductIDException;
import com.unext.RestCrudDemo.Model.Product;
import com.unext.RestCrudDemo.Service.ProductService;

import jakarta.websocket.server.PathParam;
 

 @RestController
public class ProductController {
   @Autowired
   ProductService service;
    
   @GetMapping("/listall")
 //  @RequestMapping(value = "/listall", produces = { "application/xml" })
    public List<Product> list() {
        return service.listAll();
    }
  
 //@GetMapping("/getproduct/{id}")
    @RequestMapping(value = "/getproduct/{id}", method=RequestMethod.GET )
        public Product get(@PathVariable("id") int i) {
    	System.out.println(i);
    	Product product=null;
    
    	try {
       product = service.get(i);
    	}
    	catch(InvalidProductIDException e)
    	{
    		System.out.println(e);
    	}
        return product;
      
    }
  
  @RequestMapping(value = "/addproduct1", method = RequestMethod.POST)
//@PostMapping("/addproduct")
 
        public String add(@RequestBody Product product)  {
        service.add(product);
       System.out.println(product);
      return   "your product added successfully";
    }
   
  
  
  
  
    @PutMapping("/updateproduct/{id}/{name}")
    public boolean update(@PathVariable("id") int id,@PathVariable("name") String name) {
   
        if (service.updateProduct1(id,name)) {
            return true;
        } else {
            return false;
        }
    }
 
   // @DeleteMapping("/deleteproduct/{id}")
  @RequestMapping(value = "/deleteproduct/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("id") int id) {
        if (service.deleteAll(id)) {
            return true;
        } else {
            return false;
        }
    }
}