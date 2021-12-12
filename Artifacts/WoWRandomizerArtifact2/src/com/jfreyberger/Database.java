package com.jfreyberger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class Database {
	public Database() {
		Connection conn = null;
		try {
			String url = "/db/WoWDatabase.db";
			conn = DriverManager.getConnection(url);
			
			System.out.print("DB Connected");
		} catch (SQLException e) {
			throw new Error("Problem", e);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

}
