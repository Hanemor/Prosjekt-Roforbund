package com.utover;

import java.sql.*;

public class UtoverDao {

    public  static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/Roprosjekt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "adminroot";

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            ResultSet rs = myStmt.executeQuery("SELECT * FROM Roprosjekt.utover;");

            while(rs.next()){
                System.out.print("UtøverID: " + rs.getInt(1)+ "\n");
                System.out.print("KjønnID: " + rs.getInt(2) + "\n");
                System.out.print("klubbID: " + rs.getInt(3) + "\n");
                System.out.print("klasseID: " + rs.getInt(4)+ "\n");
                System.out.print("Fornavn: " + rs.getString(5)+ "\n");
                System.out.print("Etternavn: " + rs.getString(6)+ "\n");
                System.out.print("Fødselsår: " + rs.getInt(7)+ "\n");

                System.out.print("\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}