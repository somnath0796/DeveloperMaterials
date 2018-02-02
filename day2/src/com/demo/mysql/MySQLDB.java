package com.demo.mysql;

import interfaces.DBConnection;

public class MySQLDB implements DBConnection {

	@Override
	public String getConnectionStatus() {
		// TODO Auto-generated method stub
		return "MySQL DB Connected";
	}

	@Override
	public String getDBDetails() {
		// TODO Auto-generated method stub
		return "My SQL Server 5.8";
	}

}
