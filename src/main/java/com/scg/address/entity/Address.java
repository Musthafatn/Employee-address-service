package com.scg.address.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "house_name")
	private String houseName;
	@Column(name = "po")
	private String po;
	@Column(name = "district")
	private String district;

}
