//Tutaj napisz swoją klasę używając class 
class Circle{
    private double radius = 1.0;
    private String color = "red";
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    public String toString(){
        return "Circle[radius="+getRadius()+", color='"+getColor()+"']";
    }
}
class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        height = 1.0;
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius, double height){
        setRadius(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}