package com.khadar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.khadar.entity.KhadarUser;

public class KhadarDAO implements KhadarDAOInterface {

	public int createProfileDAO(KhadarUser ku) {
		
		int i = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			
			PreparedStatement ps = con.prepareStatement("insert into KhadarUser values(?,?,?,?)");
			ps.setString(1, ku.getName());
			ps.setString(2, ku.getPassword());
			ps.setString(3, ku.getEmail());
			ps.setString(4, ku.getAddress());
			
			i = ps.executeUpdate();
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
		
	}

	public KhadarUser viewProfileDAO(KhadarUser ku) {
		
		KhadarUser k = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			
			PreparedStatement ps = con.prepareStatement("select * from KhadarUser where email=?");
			ps.setString(1, ku.getEmail());
			
			ResultSet res = ps.executeQuery();
			
			if(res.next()) {
				
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				k = new KhadarUser();
				k.setName(n);
				k.setPassword(p);
				k.setEmail(e);
				k.setAddress(a);
				
			}
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return k;
		
	}

}
