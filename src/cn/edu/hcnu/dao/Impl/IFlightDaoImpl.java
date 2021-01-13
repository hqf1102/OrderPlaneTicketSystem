package cn.edu.hcnu.dao.Impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class IFlightDaoImpl implements IFlightDao {
    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String name="root";
        String password="1234";
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
        Connection con= DriverManager.getConnection(url,name,password);
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,flight.getId());
        ps.setString(2,flight.getFlight_id());
        ps.setString(3,flight.getAircraftModel());
        ps.setInt(4,flight.getCurrentSeats());
        ps.setString(5,flight.getDepartureAirport());
        ps.setString(6,flight.getDestinationAirport());
        ps.setString(7,flight.getDepartureTime());
        ps.executeUpdate();
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
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
