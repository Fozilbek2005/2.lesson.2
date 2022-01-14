package com.company;

public class Triangle extends Figure {

    private int sideA;
    private int sidiB;
    private int sidiC;

    public Triangle(String name, int sideA, int sidiB, int sidiC) {
        super(name);
        this.sideA = sideA;
        this.sidiB = sidiB;
        this.sidiC = sidiC;
    }

    @Override
    public int colculatePerimeter() {
        return sideA + sidiB + sidiC;
    }

    @Override
    public void drow() {
        System.out.println("\uD83D\uDD3A");

    }
}
