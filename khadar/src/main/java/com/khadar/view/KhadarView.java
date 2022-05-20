package com.khadar.view;

import java.util.Scanner;

import com.khadar.controller.KhadarController;
import com.khadar.controller.KhadarControllerInterface;

public class KhadarView {

	public static void main(String[] args) {
		
		String s = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(s.equals("y")) {
			
			System.out.println("********** Main Menu **********");
			
			System.out.println("Press 1 to create profile");
			System.out.println("Press 2 to View profile");
			
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			KhadarControllerInterface kc = new KhadarController();
			
			switch(ch) {
			
				case 1:
					kc.createProfileController();
					break;
				
				case 2:
					kc.viewProfileController();
					break;
					
				default:
					System.out.println("Wrong Choice");
				
			}
		
			System.out.println("********************");
			System.out.println("Press y to continue");
			s = sc.next();
			
		}
		
	}

}
