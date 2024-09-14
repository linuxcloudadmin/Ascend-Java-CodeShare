package com.SpringJDBC.GroceryStore.Utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringJDBC.GroceryStore.Model.Product;



public class ProductMapper implements RowMapper {


	 public Product mapRow(ResultSet rs, int rowNum) throws SQLException {  
	 Product prod = new Product();  
	 prod.setPid(rs.getInt("pid"));
	 prod.setPname(rs.getString("pname"));
	 prod.setMfgdate(rs.getDate("mfgdate"));
	 prod.setExpdate(rs.getDate("expdate"));
	 prod.setCost(rs.getInt("cost"));
	  return prod;  
	 }  
	} 

