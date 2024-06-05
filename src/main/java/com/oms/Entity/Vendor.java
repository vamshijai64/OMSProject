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
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vid;
	private String vname;
	private String vpan;
	private String vtan;
	private String vloc;
	private String vdept;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "vidvpid", joinColumns = {@JoinColumn(name = "vid")}, inverseJoinColumns = {
			@JoinColumn(name = "vpid")
	})
	private List<Vendor_Product> vp;
}
