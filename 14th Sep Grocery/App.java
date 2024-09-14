package com.SpringJDBC.GroceryStore;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringJDBC.GroceryStore.GroceryImpl.ProductImpl;
import com.SpringJDBC.GroceryStore.Model.Product;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ProductImpl p = (ProductImpl) context.getBean("productdao");
      	Scanner s=new Scanner(System.in);
    	System.out.println("Enter 1.for Admin");
    	System.out.println("enter 2. for customer");
    	int choice=s.nextInt();
    	if(choice==1)
    	 {
    		System.out.println("Want to add product to grocery store or pull out expired items");
        	System.out.println("Enter 1: for adding" );
        	System.out.println("Enter 2: for expired items" );
        	
        	int digit=s.nextInt();
        	if(digit==1)
        	{   System.out.println("***** Inserting Product********");
                 System.out.println("enter product id");
                 int id=s.nextInt();
                 System.out.println("enter product name");
                 String pname=s.next();
                 System.out.println("enter manufacturing date(dd-mm-yyyy)");
                 String mdate=s.next();
                 System.out.println("enter expiry date(dd-mm-yyyy)");
                 String edate=s.next();
                 System.out.println("enter cost");
                 int cost=s.nextInt();
                int k= p.insert(id,pname,mdate,edate,cost);
    System.out.println(k +" rows inserted");
   
        	}
        	if(digit==2)
        	{
        		System.out.println("***** Products Expired********");
    	List<Product>l=p.listproducts();
    	if(l.isEmpty())
    	{
    		System.out.println("No expired product as of now");
    	}
    	else
    	{
    	    	for(Product t:l)
    	{
    		System.out.println(t);
    		System.out.println(("Want to delete product(y/n): "+t.getPname()));
    		char ch=s.next().charAt(0);
    		if(ch=='y')
    		{
    			
    			int t1=p.delete(t.getPid());
    			
    			
    		}
    	}
    	}
    	
    }
    	 }
    	if(choice ==2)
    	{
        	System.out.println("Want to add product to cart(y/n)");
        	char ch=s.next().charAt(0);
        	while(ch=='y')
        	{
        		System.out.println("enter product name");
        		String s2=s.next();
        		p.addProductToCartByProdName(s2); 
        		System.out.println("Want to continue adding product(y/n)");
        		ch=s.next().charAt(0);
        		
        	}
        	List<Product> items=p.getItems();
        	
        	double cost=0.0;
        	if(items.isEmpty())
        	{
        	System.out.println("you have no items in cart");
        	}
        	else
        	{
        	for(Product p1:items)
        	{
        		cost=cost+p1.getCost();
        		System.out.println("u have selected"+p1);
        	}
        	System.out.println("Pls pay Rs :"+cost);
        	}
    	}
        	
    	}}
    	
