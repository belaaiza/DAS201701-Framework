package framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	public static Connection createConn(){
		String url = "jdbc:mysql://localhost:3306/DAS";
		String username = "root";
		String password = "root";

		System.out.println("Connecting database...");

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
		    System.out.println("Database connected!");
		    return connection;
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
	}
	
	public static void insertUser(String name, String registration){
		Connection con = createConn();
		Statement stmt = null;
		String query = "INSERT INTO user(name, registration) "
				+ "VALUES ('"+ name +"', '"+ registration+"')";
		
		try {
			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertResource(String name, String description){
		Connection con = createConn();
		Statement stmt = null;
		String query = "INSERT INTO resource(name, description) "
				+ "VALUES ('"+ name +"', '"+ description+"')";
		
		try {
			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void viewTableUser()
		    throws SQLException {
		Connection con = createConn();
		Statement stmt = null;
		String query = "select * from user";

	    try {
	        stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        System.out.println("------------------------------------------------------------");
	        System.out.println("Users: \n");
	        while (rs.next()) {
	        	int id = rs.getInt("iduser");
	        	String name = rs.getString("name");
	        	String registration = rs.getString("registration");
	        	
	        	System.out.println("Id: " + id);
	            System.out.println("Name: " + name);
	            System.out.println("Registration: " + registration + "\n");
	        }
	        System.out.println("------------------------------------------------------------");
	    } catch (SQLException e ) {
	        System.out.println("Erro de sintaxe");
	    } finally {
	        if (stmt != null) { stmt.close(); }
	    }
	}
	
	public static void viewTableResource()
		    throws SQLException {
		Connection con = createConn();
		Statement stmt = null;
		String query = "select * from resource";

	    try {
	        stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        System.out.println("------------------------------------------------------------");
	        System.out.println("Resources: \n");
	        while (rs.next()) {
	        	int id = rs.getInt("idResource");
	        	String name = rs.getString("name");
	        	String description = rs.getString("description");
	        	
	        	System.out.println("Id: " + id);
	            System.out.println("Name: " + name);
	            System.out.println("Description: " + description + "\n");
	        }
	        System.out.println("------------------------------------------------------------");
	    } catch (SQLException e ) {
	        System.out.println("Erro de sintaxe");
	    } finally {
	        if (stmt != null) { stmt.close(); }
	    }
	}
	
	public static void updateUser(int idUser, String name, String registration) {
		Connection con = createConn();
		Statement stmt = null;
		String query = "UPDATE user SET name='"+ name +"', registration='"+ registration +"' "
				+ "WHERE iduser = " + idUser;
		
		try {
			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateResource(int idResource, String name, String description) {
		Connection con = createConn();
		Statement stmt = null;
		String query = "UPDATE resource SET name='"+ name +"', description='"+ description +"' "
				+ "WHERE idResource = " + idResource;
		
		try {
			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteUser(int idUser) {
		Connection con = createConn();
		Statement stmt = null;
		String query = "DELETE FROM user WHERE iduser = " + idUser;
		
		try {
			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteResource(int idResource) {
		Connection con = createConn();
		Statement stmt = null;
		String query = "DELETE FROM resource WHERE idResource = " + idResource;
		
		try {
			stmt = con.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
