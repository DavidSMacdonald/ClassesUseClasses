package com.company;

public class Circle {
    private double radius;
    public Circle(double r)
    {
        radius = r;
    }

    public double getArea()
    {
//        System.out.println(radius);
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

    }
}