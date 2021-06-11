package com.scg.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.address.entity.Address;
import com.scg.address.repository.AddressRepository;

@RequestMapping("address")
@RestController
public class AddressController {

	@Autowired
	private AddressRepository addressRepository;

	@GetMapping("/id/{id}")
	public String getAddressByEmpId(@PathVariable final int id) {

		return addressRepository.findByEmpId(id).toString();
	}

	@PostMapping
	public Address insert(@RequestBody final Address address) {

		return addressRepository.save(address);

	}

}
