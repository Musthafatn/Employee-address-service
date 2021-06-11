package com.scg.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scg.address.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

	Address findByEmpId(int id);

}
