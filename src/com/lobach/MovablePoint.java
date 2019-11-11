package com.lobach;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super.setX(x);
        super.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }


    public float[] getSpeed() {
        float[] xy=new float[2];
        xy[0]=this.xSpeed;
        xy[1]=this.ySpeed;

        return xy;
    }

    @Override
    public String toString() {
        return "(" +super.getX()+
                ", "+super.getY()+"), speed = ("+
                 xSpeed +
                ", " + ySpeed +
                ')';
    }

    public MovablePoint move(){
        super.setX(getX()+xSpeed);
        super.setY(getY()+xSpeed);
        return this;
    }



}
