package cn.edu.hcnu.bll.Impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.Impl.IFlightDaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

public class IFlightServiceImpl implements IFlightService {
    private  IFlightDao iFlightDao=null;
    public IFlightServiceImpl() {
        iFlightDao= new IFlightDaoImpl();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        Set<Flight> allFlights = iFlightDao.getAllFlights();
        return allFlights;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirport(String departureAirport) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirport(String destinationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
