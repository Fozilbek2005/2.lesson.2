package com.company;

public class Rectangle extends Figure{

    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public int colculatePerimeter() {
        return ( a + b) * 2 ;
    }

    @Override
    public void drow() {

    }
}
