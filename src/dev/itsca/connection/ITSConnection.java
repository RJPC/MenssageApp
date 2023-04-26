package dev.itsca.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ITSConnection {

	private static final String URL = "jdbc:postgresql://localhost:5432/MenssageApp";
	private static final String USER = "postgres";
	private static final String PASSWORD = "postgres";
	private static Connection conn = null;

	public static boolean connect() {

		try {

			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			if (conn != null)
				System.out.println("Connected");

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static void disconnect() {
		System.out.println("Disconnected");
		conn = null;
	}

}