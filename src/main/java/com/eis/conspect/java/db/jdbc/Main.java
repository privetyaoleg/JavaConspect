package com.eis.conspect.java.db.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = CreatingConnection.getConnection("src/by/htp/jdbc/source/props.properties");
        //ProcessingRequest.simpleStatement(connection, "SELECT * FROM test_table");
        ProcessingRequest.getInfoById(connection, "1");

    }

}
