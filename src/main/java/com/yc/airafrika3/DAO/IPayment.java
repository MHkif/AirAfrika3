package com.yc.airafrika3.DAO;

import com.yc.airafrika3.Entity.Payment;

import java.sql.SQLException;

public interface IPayment extends DAO<Payment>{
    Payment save(Payment payment) throws SQLException;
}
