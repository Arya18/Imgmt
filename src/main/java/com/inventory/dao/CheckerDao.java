package com.inventory.dao;

import java.util.List;

import com.inventory.DTO.AdminDTO;
import com.inventory.model.Checker;

public interface CheckerDao {
	boolean addOrUpdateChecker(Checker checker);
	boolean checkUnique(String username,String email);
	boolean deleteChecker(long checkerId);
	List<Checker> checkerList(long adminId);
	Checker getCheckerById(long id);
	boolean login(AdminDTO adminDTO);
	Checker getCheckerByUsername(String username);
	boolean checkUniqueEmail(String email);
}
