package com.company;

interface Movable{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable{
    public double x,y,xSpeed,ySpeed;
    public MovablePoint(double x, double y, double xSpeed, double ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void moveUp(){
        y -= ySpeed;
    }
    public void moveDown(){
        y += ySpeed;
    }
    public void moveRight(){
        x -= xSpeed;
    }
    public void moveLeft(){
        x += xSpeed;
    }
    @Override
    public String toString(){
        return "Movable Point:[X: "+x+ " , Y: " +y + " ]";
    }
}
class Main{
    public static void main (String[] argv){
        MovablePoint m1 = new MovablePoint(10,10,10,10);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}