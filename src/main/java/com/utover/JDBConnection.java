/*package com.utover;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnection {
    public Connection conect() throws SQLException {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/Roprosjekt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "adminroot";
        try {
            con = DriverManager.getConnection(url, user, password);
            if (con == null){
                System.out.print("Connection cannot be established");
            }
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    return null;
    }
}

    private Connection connection;

    public Connection createConnection(){
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Roprosjekt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "adminroot");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.connection;
    }
    */
