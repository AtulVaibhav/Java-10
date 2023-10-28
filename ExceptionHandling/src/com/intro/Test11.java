package com.intro;

import java.sql.SQLException;

//throws

public class Test11 {
    public static void m1() throws SQLException{
    	m2();
    }
    
    public static void m2() throws SQLException{
    	throw new SQLException();
    }
	public static void main(String[] args) {
		
		try {
			m1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled");
		}

	}

}
