package com.main.service;

import java.util.List;

import com.main.model.Managers;

public interface ManagerService {

//	List <Managers> fetchAllManagers();
	void saveManager(Managers manager);
	Managers findManagerById(String email);
	void deleteManager(Managers manager);
	Boolean validateManager(String managerEmail, String managerPassword);
}
