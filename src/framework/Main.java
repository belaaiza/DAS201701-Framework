package framework;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			//Database.insertUser("Brilha", "8910");
			//Database.updateResource(2, "novo2", "descricao2");
			//Database.updateUser(3, "novoBrilha", "1234");
			Database.viewTableUser();
			Database.viewTableResource();
			//Database.insert(connection, "DAS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
