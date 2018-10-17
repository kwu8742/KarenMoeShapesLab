package com.company;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius)
    {
        super("circle");
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return (3.14 * radius * radius);
    }
    @Override
    public double getPerimeter()
    {
        return (3.14 * radius * 2);
    }
}