package com.inventory.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.common.dao.PreLoginDao;
import com.inventory.model.Admin;
import com.inventory.model.Checker;
import com.inventory.model.Maker;
import com.inventory.model.SalesPerson;

@Service
@Transactional(rollbackFor=Exception.class)
public class PreLoginService {
	@Autowired PreLoginDao preLoginDao;

	public Admin checkAdminDetails(String email, String password) {
		return preLoginDao.checkAdminDetails(email,password);
	}

	public Checker checkCheckerDetails(String email, String password) {
		return preLoginDao.checkCheckerDetails(email,password);
	}

	public Maker checkMakerDetails(String email, String password) {
		return preLoginDao.checkMakerDetails(email,password);
	}

	public SalesPerson checkSalesPersonDetails(String email,
			String password) {
		return preLoginDao.checkSalesPersonDetails(email,password);
	}

	
}
