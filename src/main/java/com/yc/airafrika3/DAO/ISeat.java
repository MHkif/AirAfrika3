package com.yc.airafrika3.DAO;

import com.yc.airafrika3.Entity.Seat;

import java.sql.SQLException;

public interface ISeat extends DAO<Seat>{

    Seat save(Seat seat) throws SQLException;
}
