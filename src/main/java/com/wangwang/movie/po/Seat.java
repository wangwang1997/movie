package com.wangwang.movie.po;


public class Seat {

    private Integer num;//标号
    private Integer row;//行
    private Integer column;//列
    private Boolean selled=false;

    public Seat() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Boolean getSelled() {
        return selled;
    }

    public void setSelled(Boolean selled) {
        this.selled = selled;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "num=" + num +
                ", row=" + row +
                ", column=" + column +
                ", selled=" + selled +
                '}';
    }
}
