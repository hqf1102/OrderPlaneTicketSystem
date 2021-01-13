package cn.edu.hcnu.dao.Impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
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
    public Set<Flight> getAllFlights() throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String name="root";
        String password="1234";
        String sql="SELECT * FROM flight";
        Connection con= DriverManager.getConnection(url,name,password);
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        Set<Flight> flightSet=new HashSet<Flight>();
        while(rs.next()){
           String id=rs.getString("ID");
           String flight_id=rs.getString("FLIGHT_ID");//航班号
          int currentSeats=rs.getInt("TOTAL_SEATS_NUM");//当前座位数
            String aircraftModel=rs.getString("PLANE_TYPE");//飞机型号
          String  departureTime=rs.getString("DEPARTURE_TIME");//出发时间
          String departureAirport=rs.getString("DEPARTURE_AIRPORT");//出发站
            String destinationAirport=rs.getString("DESTINATION_AIRPORT");//达到站
            Flight flight = new Flight(id, flight_id, currentSeats, aircraftModel, departureTime, departureAirport, destinationAirport);
           flightSet.add(flight);
        }
        return flightSet;
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
    public void updateFlight(Flight flight) { }
}
