package com.yiyi.test.Collection;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class ClassRoom {
    private Integer no;
    private Double total;

    public ClassRoom() {
    }

    public ClassRoom(Integer no, Double total) {
        this.no = no;
        this.total = total;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
