package com.seandifusco.springpetclinic.services;

import java.util.Set;

import com.seandifusco.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
 