package com.khadar.dao;

import com.khadar.entity.KhadarUser;

public interface KhadarDAOInterface {

	int createProfileDAO(KhadarUser ku);

	KhadarUser viewProfileDAO(KhadarUser ku);

}
