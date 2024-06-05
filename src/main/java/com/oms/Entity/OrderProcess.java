package com.oms.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class OrderProcess {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer productid;
	private String productname;
	private Integer quantity;
	private String productdept;
	private Date productdeliverydate;
	private String producttype;
	private String proapprovedmanager;
}
