public class Rectangle extends Shape {
    protected double width;
    protected double lenght;
    // конструкторы
    public Rectangle(){
        width = 0;
        lenght = 0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.lenght = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.lenght = length;
        this.color = color;
        this.filled = filled;
    }
    // геттеры и сэттеры
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea() {
        return width*lenght;
    }
    public double getPerimetr() {
        return (2*(width+lenght));
    }
    public String toString() {
        return ("Width = " + width + '\n' + "Lenght = " + lenght + '\n' + "Area = " + getArea() + '\n' + "Perimetr = " + getPerimetr() + '\n');
    } 
}
