package cn.edu.hcnu.bean;

import java.util.Set;

/**
 * 订单信息
 * **/
public class Order {
    private String id;//订单编号
    private float airportTax;//机场税
    private float ryf;//燃油费
    private float jpjg;//机票价格
    private float hkzhx;//航空综合险
    private float jpgqx;//机票改签险
    private float yhj;//优惠劵
    private float hszj;//含税总价
    private Set<Customer> customerSet;//预定机票乘客

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getAirportTax() {
        return airportTax;
    }

    public void setAirportTax(float airportTax) {
        this.airportTax = airportTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJpgqx() {
        return jpgqx;
    }

    public void setJpgqx(float jpgqx) {
        this.jpgqx = jpgqx;
    }

    public float getYhj() {
        return yhj;
    }

    public void setYhj(float yhj) {
        this.yhj = yhj;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }
}
