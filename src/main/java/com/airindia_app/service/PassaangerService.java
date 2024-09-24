package com.airindia_app.service;

import java.util.List;

import com.airindia_app.entity.Passanger;

public interface PassaangerService {

	void savedataInfo(Passanger pass);

	public List<Passanger>listallPass(Passanger pass);

	void deletePassbyID(long id);

}
