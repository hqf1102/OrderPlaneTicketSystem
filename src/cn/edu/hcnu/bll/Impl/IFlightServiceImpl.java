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
        return  iFlightDao.getAllFlights();
    }

    @Override
    public Set<Flight>getFlightByDepartureTime(String departureTime) throws SQLException {
        return iFlightDao.getFlightByDepartureTime(departureTime);
    }

    @Override
    public Set<Flight> getFlightByDepartureAirport(String departureAirport) throws SQLException {
        return iFlightDao.getFlightByDepartureAirport(departureAirport);
    }

    @Override
    public Set<Flight> getFlightByDestinationAirport(String destinationAirport) throws SQLException {
        return iFlightDao.getFlightByDestinationAirport(destinationAirport);
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
