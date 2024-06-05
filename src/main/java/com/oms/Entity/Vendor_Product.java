package com.oms.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendor_Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vid;
	private String vproduct;
	private Double vprice;
	private Integer vquantity;
	private Double freightcharges;
	private String vreplacement;
	private String vterms;
	
	

}
