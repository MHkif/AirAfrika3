package com.yc.airafrika3.Services;

import com.yc.airafrika3.DAO.impl.AdminDAO;
import com.yc.airafrika3.Entity.Admin;

import java.util.Objects;

public class AdminService {
    private final AdminDAO adminDAO = new AdminDAO();

    public Admin login(String email, String password)  {
        Admin admin = adminDAO.login(email, password);
        return Objects.nonNull(admin) ? admin : null;
    }

}