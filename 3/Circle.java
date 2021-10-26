public class Circle extends Shape {
    protected double radius;
    // конструкторы
    public Circle(){
        radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    // геттеры и сэттеры
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (3.14*radius*radius);
    }
    public double getPerimetr() {
        return (2*3.14*radius);
    }
    public String toString() {
        return ("Radius = " + radius + '\n' + "Area = " + getArea() + '\n' + "Perimetr = " + getPerimetr() + '\n');
    }
}
