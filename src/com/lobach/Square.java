package com.lobach;

public class Square extends Rectangle {
    public Square(){
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square( width=" + super.getWidth() +
                ", length=" + super.getLength() +"color=" + super.getColor() +"isFilled=" + super.isFilled() +
                ")";
    }
}
