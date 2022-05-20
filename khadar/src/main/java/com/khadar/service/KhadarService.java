package com.khadar.service;

import com.khadar.dao.KhadarDAO;
import com.khadar.dao.KhadarDAOInterface;
import com.khadar.entity.KhadarUser;

public class KhadarService implements KhadarServiceInterface {

	public int createProfileService(KhadarUser ku) {
		
		KhadarDAOInterface kd = new KhadarDAO();
		int i = kd.createProfileDAO(ku);
		return i;
		
	}

	public KhadarUser viewProfileService(KhadarUser ku) {
		
		KhadarDAOInterface kd = new KhadarDAO();
		KhadarUser i = kd.viewProfileDAO(ku);
		return i;
	}

}
