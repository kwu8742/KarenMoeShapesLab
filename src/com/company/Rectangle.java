package com.company;

public class Rectangle extends Shape {
    private int side;

    public Rectangle(int side) {
        super ("Rectangle");
        this.side = side;
    }
    @Override
    public double getArea(){
        return (side * side)
    }

    @Override
    public double getPerimeter(){
        return side*4;
    }
}
