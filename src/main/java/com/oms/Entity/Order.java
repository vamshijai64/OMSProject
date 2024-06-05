package com.oms.Entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer orderid;
	private Date orderdate;
	private Date orderdeliverydate;
	private Integer orderdeptid;
	private String personname;
	private String approvedmanager;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkordid")
	private List<OrderProcess> op;
}
