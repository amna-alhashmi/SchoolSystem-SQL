package SchoolSystem;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectToDatabase {

	public void addFakeStudents(int numbers) {

	}

	public static boolean studentTable() {

		String url = "jdbc:mysql://localhost:3306/SchoolMgt";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Students " + "(id INTEGER not NULL, " + " fname VARCHAR(8), "
				+ " lname VARCHAR(8), " + " birthdate date, " + " PRIMARY KEY ( id ))";
		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);
			if (m >= 1) {
				System.out.println("Created table in given database...");
				return true;
			} else {
				System.out.println(" table already Created in given database...");
			}
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return false;

	}

	public static boolean subjectTable() {

		String url = "jdbc:mysql://localhost:3306/SchoolMgt";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Subjects " + "(id INTEGER not NULL, " + " title VARCHAR(8), "
				+ " desc VARCHAR(250), " + " pricePerStudent decimal, " + " PRIMARY KEY ( id ))";
		Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);
			if (m >= 1) {
				System.out.println("Created table in given database...");
				return true;
			} else {
				System.out.println(" table already Created in given database...");
			}
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);

		System.out.println("1.List Top 100 Students");
		System.out.println("2.List Top 50 Subjects");
		System.out.println("3.Add a new Student");
		System.out.println("4.Add a new Subject");
		System.out.println("5.Load 1000000 student in Students Table");
		System.out.println("6.Load 100000 subjects in Subjects Table");
		System.out.println("7.Exit App");
		String a = sa.next();
		int option = Integer.parseInt(a);
		switch (option) {     
		case 1:
			break;
		case 2:
			break;
		case 3:
			System.out.println("Add a new student:");
			String Student = sa.next();
			break;
		case 4:
			System.out.println("Add a new Subject:");
			String Subject = sa.next();
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		}
		System.out.println();

	}
}
