package cn.edu.hcnu.system;

public class Order {
    private String id;
    private float jcs;//机场税
    private float hkzhx;//航空综合险
    private float jpgqx;//机票改签险
    private float yhj;//优惠劵

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJcs() {
        return jcs;
    }

    public void setJcs(float jcs) {
        this.jcs = jcs;
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
}
