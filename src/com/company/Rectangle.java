package com.company;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height,int width) {
        super ("Rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea(){
        return (width * height);
    }

    @Override
    public double getPerimeter(){
        return ((width*2) + (height * 2));
    }
}
