package interfaces;

public class Main2 {
	
	public static void main(String args[]){
		//anonymous Inner Class Implementation
		DBConnection conn0 = new DBConnection(){
			@Override
			public String getConnectionStatus() {
				return "MySQL Connected";
			}

			@Override
			public String getDBDetails() {
				return "MySQL Server";
			}
			
			@Override
			public String toString() {
				
				return this.getConnectionStatus() + " version: " + this.getDBDetails();
			}
		};
		
		System.out.println(conn0.getConnectionStatus() + " version: " + conn0.getDBDetails());
		System.out.println(conn0.getClass().getName());
		System.out.println(conn0);
		
		
		//Using external class to enforce Implementations. Like DriverManager in JDBC
		DBConnection conn = DBManager.getDB("Oracle");		
		System.out.println(conn.getConnectionStatus() + " version: " + conn.getDBDetails());
	}
}
