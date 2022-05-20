package com.khadar.service;

import com.khadar.entity.KhadarUser;

public interface KhadarServiceInterface {

	int createProfileService(KhadarUser ku);

	KhadarUser viewProfileService(KhadarUser ku);

}
