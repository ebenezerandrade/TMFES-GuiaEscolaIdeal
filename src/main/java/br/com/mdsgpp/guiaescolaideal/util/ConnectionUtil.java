package br.com.mdsgpp.guiaescolaideal.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionUtil {
    public static void closeConnection(Connection connection) {
	try {
	    if (connection != null && !connection.isClosed()) {
		connection.close();
	    }
	} catch (SQLException e) {
	    Logger logger = LoggerFactory.getLogger(Connection.class);
	    logger.info(e.getMessage());
	}
    }
}
