package cn.edu.hcnu.bll;



import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights() throws SQLException;
    Set<Flight> getFlightByDepartureTime(String departureTime) throws SQLException;
    Set<Flight> getFlightByDepartureAirport(String departureAirport) throws SQLException;
    Set<Flight> getFlightByDestinationAirport(String destinationAirport) throws SQLException;
    void updateFlight(Flight flight);
}
