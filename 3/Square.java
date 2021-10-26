public class Square extends Rectangle {
    // конструкторы
    public Square(){
        width = lenght = 0;
    }
    public Square(double side){
        width = lenght = side;
    }
    public Square(double side, String color, boolean filled){
        width = lenght = side;
        this.color = color;
        this.filled = filled;
    }
    // геттеры и сэттеры
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = lenght = side;
    }
    public void setWidth(double side) {
        width = side;
    }
    public void setLenght(double side) {
        lenght = side;
    }
    public String toString() {
        return ("Side = " + width + '\n' +  "Area = " + getArea() + '\n' + "Perimetr = " + getPerimetr() + '\n');
    }
}
