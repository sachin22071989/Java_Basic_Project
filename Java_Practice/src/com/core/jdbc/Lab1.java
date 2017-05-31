package com.core.jdbc;

import java.sql.*;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sachin", "root", "sachin2122");
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sachin2122");
			//String sql = "insert into TECH_PASSTAB values('New Domain','new user Name','New Password',1111)";
			String sql = "insert into sachin_tab values(1111,'Ashish Kumar')";
			st = con.createStatement();
			int x = st.executeUpdate(sql);
			if (x == 1) {
				System.out.println("Record Inserted Successfully !!!");
			} else {
				System.out.println("No Record inserted... Try Again");
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				if (st != null)
					st.close();
				if (con != null)
					con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
