package com.oms.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productid;
	private String productname;
	private Integer minquantity;
	private Integer maxquantity;
	private String productstore;
	private String productmanager;
	private String producttype;
	private Double productprice;
	private Double pgst;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "vedpro", joinColumns = {@JoinColumn(name = "fkvid")}, inverseJoinColumns = {
			@JoinColumn(name = "fkpid")
	})
	private List<Vendor> vendor;
}
