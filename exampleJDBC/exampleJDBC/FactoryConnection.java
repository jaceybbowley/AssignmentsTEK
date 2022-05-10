package exampleJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class FactoryConnection {
	private final String driverClassName = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/classicmodels";
	private final String user = "root";
	private final String pass = "CheesyMax2020@";
 
	private static FactoryConnection factoryConnection = null;
//	Driver driver = com.mysql.cj.jdbc.Driver; 
	
	
	private FactoryConnection() {
		try {
			Class.forName(driverClassName);
		}catch(ClassNotFoundException e) {
			System.out.println("Exception in FactoryConnection class");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, pass);
		return conn;
	}
	
	public static FactoryConnection getInstance() {
		if(factoryConnection == null ) {
			factoryConnection = new FactoryConnection();
		}
		return factoryConnection;
	}
}