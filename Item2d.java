package com.mycompany.ex02;

import java.io.Serializable;

public class Item2d implements Serializable {
    private double x;
    private double y;

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
