package com.yc.airafrika3.Services;

import com.yc.airafrika3.DAO.impl.AirPortDAO;
import com.yc.airafrika3.Entity.Airport;

import java.util.List;

public class AirportService implements Service<Airport> {

    final AirPortDAO airPortDAO = new AirPortDAO();
    @Override
    public Airport save(Airport airport) {
        return null;
    }

    @Override
    public Airport update(Airport airport) {
        return null;
    }

    @Override
    public boolean deactivate(Airport t) {
        return false;
    }

    @Override
    public Airport findBy(String id) {
        return airPortDAO.findBy(id);
    }

    @Override
    public List<Airport> getAll() {
       return airPortDAO.getAll();
    }
}
