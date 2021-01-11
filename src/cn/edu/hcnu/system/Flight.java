package cn.edu.hcnu.system;

import java.util.Date;

public class Flight {
    private String id;
    private float orderPrice;//单价
    private Date departureTime;//出发时间
    private Date arrivalimeT;//到达时间
    private String from;//出发站
    private String to;//达到站

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalimeT() {
        return arrivalimeT;
    }

    public void setArrivalimeT(Date arrivalimeT) {
        this.arrivalimeT = arrivalimeT;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
