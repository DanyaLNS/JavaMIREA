public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;
    // конструктор
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return ("(x, y) = "  + '(' + x + ", " + y + ")\n" + "(xSpeed, ySpeed) = "  + '(' + xSpeed + ", " + ySpeed + ")\n" + "Radius = " + radius);
    }

}