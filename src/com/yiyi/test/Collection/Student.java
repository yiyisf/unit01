package com.yiyi.test.Collection;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class Student {
    private String  name;
    private Integer no;
    private Double score;

    public Student() {
    }

    public Student(String name, Integer no, Double score) {
        this.name = name;
        this.no = no;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
