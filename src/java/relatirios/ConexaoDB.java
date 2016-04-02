/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatirios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author desenvolvimento
 */
public class ConexaoDB {

    private Connection cx = null;

    public ConexaoDB() {
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (cx == null) {
            Class.forName("com.mysql.jdbc.Driver");
            cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/explica", "root", "root");
        }
        return cx;
    }

    public Statement getStatement() throws SQLException, ClassNotFoundException {
        return getConnection().createStatement();
    }

    public PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException {
        return getConnection().prepareStatement(sql);

    }

    public void closeAll() throws SQLException {
        if (cx != null) {
            cx.close();
        }
    }
}
