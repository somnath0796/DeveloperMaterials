package interfaces;

import com.demo.mysql.MySQLDB;
import com.demo.oracle.OracleDB;

public class DBManager {
	public static DBConnection getDB(String name){
		if(name.equalsIgnoreCase("oracle")){
			return new OracleDB();
		}
		else if(name.equalsIgnoreCase("mysql")){
			return new MySQLDB();
		}
		else{
			return null;
		}
	}
}
