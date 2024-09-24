package com.airindia_app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airindia_app.entity.Passanger;
import com.airindia_app.repository.PassangerRepository;
@Service
public class PassangerServiceimpl implements PassaangerService {
@Autowired
	private PassangerRepository Passrepo;
	
	
	
	@Override
	public void savedataInfo(Passanger Pass) {
		Passrepo.save(Pass);
	}



	@Override
	public List<Passanger> listallPass(Passanger pass) {
		List<Passanger>Passdata=Passrepo.findAll();
		return Passdata;
	}



	@Override
	public void deletePassbyID(long id) {
       Passrepo.deleteById(id);		
	}

}
