package com.demo.oracle;

import interfaces.DBConnection;

public class OracleDB implements DBConnection {

	@Override
	public String getConnectionStatus() {
		// TODO Auto-generated method stub
		return "Oracle DB Connected";
	}

	@Override
	public String getDBDetails() {
		// TODO Auto-generated method stub
		return "Oracle 11g";
	}

}
