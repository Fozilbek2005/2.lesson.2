package com.company;

public class Spuare extends Figure {

    private int side;

    public Spuare(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public int colculatePerimeter() {
        return side * 4;
    }

    @Override
    public void drow() {
        System.out.println("\uD83D\uDFE9 ");

    }
}
