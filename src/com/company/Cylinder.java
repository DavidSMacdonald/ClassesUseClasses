package com.company;

public class Cylinder {

    private Circle base;
    private double height;

    public Cylinder(double r, double h)
    {
        height = h;
        base = new Circle(r);
    }

    public double vol()
    {
//        System.out.println(base.getArea());
        return base.getArea() * height;
    }

    public double sa()
    {
        return 2*base.getArea() + height*base.getCircumference();
    }

    public static void main(String[] args) {

        Cylinder cyl = new Cylinder(5, 2);
        double vol = cyl.vol();
        System.out.println("radius = 5 height = 2 volume = " + vol);
        double sa = cyl.sa();
        System.out.println("surface area = " + sa);

        Cylinder cyl2 = new Cylinder(8, 6);
        vol = cyl2.vol();
        System.out.println("radius = 8 height = 6 volume = " + vol);
        sa = cyl2.sa();
        System.out.println("surface area = " + sa);

        // OUTPUT
//        radius = 5 height = 2 volume = 157.07963267948966
//        surface area = 219.9114857512855
//        radius = 8 height = 6 volume = 1206.3715789784806
//        surface area = 703.7167544041137
    }
}