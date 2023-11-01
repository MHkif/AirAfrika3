package com.yc.airafrika3.Database;

import java.sql.Connection;

public interface Database{

    public Connection getConnection();

    public void closeConnection();
}