package com.unext.RestCrudDemo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.unext.RestCrudDemo.Exception.InvalidProductIDException;
import com.unext.RestCrudDemo.Model.Product;
 @Service
public class ProductService {
    
    private static List<Product> data = new ArrayList();
     
    static {
        data.add(new Product(1, "iPhone X", 999.99f));
        data.add(new Product(2, "XBOX 360", 329.50f));     
    }
     
    public ProductService() {
         
    }
     
  
     
    public List<Product> listAll() {
        //return new ArrayList<Product>(data);
    	return data;
    }
     
    public boolean add(Product product) {

        data.add(product);
    
        return true;
    }
     
    public Product get(int id) throws InvalidProductIDException{

    	boolean flag=false;
    	for(Product p1:data)
    	{
    		if(p1.getId()==id)
    		{ flag=true;
    			return p1;
    		
    		}
    	}
    	if(flag==false)
    	{
    		throw new InvalidProductIDException("product Id doesn't exist");
    		//return false;
    	}
    	
    	return null;
    	
    }
    	
    
     
    public boolean deleteAll(int id) {

    	List<Product> list=new ArrayList();
  	boolean flag=false;
  	for(Product l:data)//2
     {
  	   if(l.getId()==id)
   	   {
  		  // data.remove(id);
    		 list.add(l);
    		   
    	   }
           
        }
       
    flag=data.removeAll(list);
    System.out.println(flag);
    return flag;
    
    }
    
    
    
     
    public boolean updateProduct1(int  productid,String n) {
      boolean flag=false;
    	for(Product l:data)
       {
    	   if(l.getId()==productid)
    	   {
    		   l.setName(n);
    		   flag=true;
    	   }
           
        }
        return flag;
    }
}
