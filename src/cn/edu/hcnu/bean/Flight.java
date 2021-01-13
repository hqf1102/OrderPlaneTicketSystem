package cn.edu.hcnu.bean;

/**
 * 航班信息
 * **/
public class Flight {
    private String id;
    private String flight_id;//航班号
    private int currentSeats;//当前座位数
    private String aircraftModel;//飞机型号
    private String  departureTime;//出发时间
    private String departureAirport;//出发站
    private String destinationAirport;//达到站

    public Flight(String id, String flight_id, int currentSeats, String aircraftModel, String departureTime, String departureAirport, String destinationAirport) {
        this.id = id;
        this.flight_id = flight_id;
        this.currentSeats = currentSeats;
        this.aircraftModel = aircraftModel;
        this.departureTime = departureTime;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public int getCurrentSeats() {
        return currentSeats;
    }

    public void setCurrentSeats(int currentSeats) {
        this.currentSeats = currentSeats;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flight_id='" + flight_id + '\'' +
                ", currentSeats=" + currentSeats +
                ", aircraftModel='" + aircraftModel + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                '}';
    }
}
