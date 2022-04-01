package com.company;
import java.io.* ;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Segment segment1 = new Segment(new Point(1,1), new Point(3,3));
        System.out.println(segment1.toString());
        Triangle trojkat1 = new Triangle(new Point(2,0), new Point(3,2), new Point(5,3));
        System.out.println(trojkat1.toString());
        System.out.println("Długość odcinka: " + segment1.getLength());
        System.out.println("Obwód trójkąta: " + trojkat1.getDistances());
        System.out.println("Jest to trójkąt: " + trojkat1.getType());
        System.out.println();

        testSegmentNaStringa();
        testTrianglNaStringa();
        testDlugoscOdcinka();
        testObwodTrojkata();
        testTypTrojkata();

    }
    public static void testSegmentNaStringa(){

        Segment segment2 = new Segment(new Point(2,5), new Point(5,6));
        String spodziewanyWynik = "Segment[v1=(2,5),v2=(5,6)]";
        String prawdziwyWynik = segment2.toString();

        if(spodziewanyWynik.equals(prawdziwyWynik)){
            System.out.println("testSegmentNaStringa(): ✓");
        }
        else {

            System.out.println("testSegmentNaStringa(): x");
            System.out.println("Spodziewany wynik to: " + spodziewanyWynik);
            System.out.println("Wyjściowy wynik to: " + prawdziwyWynik);
        }
    }
    public static void testTrianglNaStringa(){

        Triangle trojkat2 = new Triangle(new Point(2,6), new Point(5,9), new Point(3,1));
        String spodziewanyWynik = "Triangle[v1=(2,6),v2=(5,9),v3=(3,1)]";
        String prawdziwyWynik = trojkat2.toString();

        if(spodziewanyWynik.equals(prawdziwyWynik)){
            System.out.println("testTrianglNaStringa(): ✓");
        }
        else {

            System.out.println("testTrianglNaStringa(): x");
            System.out.println("Spodziewany wynik to: " + spodziewanyWynik);
            System.out.println("Wyjściowy wynik to: " + prawdziwyWynik);
        }
    }
    public static void testDlugoscOdcinka(){

        Segment segment3 = new Segment(new Point(12,3), new Point(5,8));
        double spodziewanyWynik = 32;
        double prawdziwyWynik = segment3.getLength();
        if(spodziewanyWynik == prawdziwyWynik){
            System.out.println("testDlugoscOdcinka(): ✓");
        }
        else{
            System.out.println("testDlugoscOdcinka():  x");
            System.out.println("Spodziewany wynik to: " + spodziewanyWynik);
            System.out.println("Wyjściowy wynik to: " + prawdziwyWynik);
        }
    }
    public static void testObwodTrojkata(){

        Triangle trojkat3 = new Triangle(new Point(0,0), new Point(0,6), new Point(8,0));
        double spodziewanyWynik = 24;
        double prawdziwyWynik = trojkat3.getDistances();
        if(spodziewanyWynik == prawdziwyWynik){
            System.out.println("testObwodTrojkata: ✓");
        }
        else{
            System.out.println("testObwodTrojkata: x");
            System.out.println("Spodziewany wynik to: " + spodziewanyWynik);
            System.out.println("Wyjściowy wynik to: " + prawdziwyWynik);
        }


    }
    public static void testTypTrojkata(){

        Triangle trojkat4 = new Triangle(new Point(0,0), new Point(8,0), new Point(0,8));
        String spodziewanyWynik = "Równoramienny";
        String prawdziwyWynik = trojkat4.getType();
        if(spodziewanyWynik.equals(prawdziwyWynik)){
            System.out.println("testTypTrojkata: ✓");
        }
        else{
            System.out.println("testTypTrojkata: x");
            System.out.println("Spodziewany wynik to: " + spodziewanyWynik);
            System.out.println("Wyjściowy wynik to: " + prawdziwyWynik);
        }
    }
}

class Point {

    private int x,y;

    public Point() {

        this(0,0);
    }


    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int number) {
        this.x = number;
    }

    public int getY() {
        return y;
    }

    public void setY(int number) {
        this.y = number;
    }

    public Point getCoordinates() {
        return new Point(this.x, this.y);
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public double distance(Point A) {

        double x;
        double y;
        double dlugosc;

        x = A.getX();
        y = A.getY();

        dlugosc = Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
        return dlugosc;
    }
}

class Segment {

    private Point A;
    private Point B;

    public Segment(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public String toString() {

        return "Segment[v1=(" + A.getX() + "," + A.getY() + "),v2=(" + B.getX() + "," + B.getY() + ")]";
    }

    public double getLength() {

        return Math.sqrt((A.getX() - B.getX()) * (A.getX() - B.getX())) + ((A.getY() - B.getY()) * (A.getY() - B.getY()));
    }
}

class Triangle {

    private Point X;
    private Point Y;
    private Point Z;

    public Triangle(Point X, Point Y, Point Z) {

        this.X = X;
        this.Y = Y;
        this.Z = Z;

    }

    public String toString() {

        return "Triangle[v1=(" + X.getX() + "," + X.getY() + "),v2=(" + Y.getX() + "," + Y.getY() + "),v3=(" + Z.getX() + "," + Z.getY() + ")]";
    }

    public double getDistances() {

        double XY, YZ, ZX, obwod;

        XY = Math.sqrt((X.getX() - Y.getX()) * (X.getX() - Y.getX()) + (Y.getX() - Y.getY()) * (Y.getX() - Y.getY()));
        YZ = Math.sqrt((Y.getX() - Y.getY()) * (Y.getX() - Y.getY()) + (Z.getX() - Z.getY()) * (Z.getX() - Z.getY()));
        ZX = Math.sqrt((Z.getX() - Z.getY()) * (Z.getX() - Z.getY()) + (X.getX() - X.getY()) * (X.getX() - X.getY()));
        obwod = (XY + YZ + ZX);

        return (obwod);
    }

    public String getType() {

        double XY, YZ, ZX;

        XY = Math.sqrt((X.getX() - Y.getX()) * (X.getX() - Y.getX()) + (Y.getX() - Y.getY()) * (Y.getX() - Y.getY()));
        YZ = Math.sqrt((Y.getX() - Y.getY()) * (Y.getX() - Y.getY()) + (Z.getX() - Z.getY()) * (Z.getX() - Z.getY()));
        ZX = Math.sqrt((Z.getX() - Z.getY()) * (Z.getX() - Z.getY()) + (X.getX() - X.getY()) * (X.getX() - X.getY()));

        if (XY == YZ && YZ == ZX)
            return "Równoboczny";
        else if (XY == YZ || YZ == ZX || ZX == XY)
            return "Równoramienny";
        else
            return "Różnoboczny";

    }
}
