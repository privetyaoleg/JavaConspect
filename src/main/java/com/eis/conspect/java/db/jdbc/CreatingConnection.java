package com.eis.conspect.java.db.jdbc;

import org.slf4j.Logger;
import utils.logger.CustomLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;


public class CreatingConnection {

    public static Logger log = CustomLogger.getInstance();

    public static Connection getConnection(String propPath) {
        Connection connection = null;
        try {
            Properties dbProperties = readProperties(propPath);

            Class.forName("com.mysql.cj.jdbc.Driver");

            log.info("Driver loading success!");

            connection = DriverManager.getConnection(dbProperties.getProperty("url"),
                    dbProperties.getProperty("login"),
                    dbProperties.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    private static Properties readProperties(String path) throws IOException {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(in);
        return properties;
    }

}
