package com.khadar.controller;

import java.util.Scanner;

import com.khadar.entity.KhadarUser;
import com.khadar.service.KhadarService;
import com.khadar.service.KhadarServiceInterface;

public class KhadarController implements KhadarControllerInterface {

	public void createProfileController() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		System.out.println("Enter Email: ");
		String email = sc.next();
		
		System.out.println("Enter Address: ");
		String address = sc.next();
		
		KhadarUser ku = new KhadarUser();
		ku.setName(name);
		ku.setPassword(password);
		ku.setEmail(email);
		ku.setAddress(address);
		
		KhadarServiceInterface ks = new KhadarService();
		int i = ks.createProfileService(ku);
		
		if(i>0) {
			System.out.println("Your Profile is Created "+name);
		}
		
		else {
			System.out.println("Your Profile is not Created");
		}

	}

	public void viewProfileController() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email: ");
		String email = sc.next();
		
		KhadarUser ku = new KhadarUser();
		ku.setEmail(email);
		
		KhadarServiceInterface ks = new KhadarService();
		KhadarUser i = ks.viewProfileService(ku);
		
		if(i!=null) {
			
			System.out.println("Your Name is "+i.getName());
			System.out.println("Your Password is "+i.getPassword());
			System.out.println("Your Email is "+i.getEmail());
			System.out.println("Your Address is "+i.getAddress());
			
		}
		
		else {
			System.out.println("Sorry...... Cannot View Profile");
		}
		
	}

}
