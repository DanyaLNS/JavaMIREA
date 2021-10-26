public abstract class Shape {
    protected String color;
    protected boolean filled;
    // конструкторы
    public Shape(){
        color = "";
        filled = false;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    // геттеры и сэттеры
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    } 
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // абстрактные методы
    abstract public double getArea();
    abstract public double getPerimetr();
    abstract public String toString();
}
