package com.lobach;

public class Circle extends Shape{
    private double radius;


    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "Circle(" +
                "radius=" + radius +"color=" + super.getColor() +"isFilled=" + super.isFilled() +
                ")";
    }
}
