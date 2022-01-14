package com.company;

public  class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void drow() {
        System.out.println("\uD83D\uDC15");
    }
}
