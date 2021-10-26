public class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    //конструктор
    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        super();
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public String toString() {
        return ("(x1, y1) = "  + '(' + topLeft.x + ", " + topLeft.y + ")\n" + "(xSpeed, ySpeed) = "  + '(' + topLeft.xSpeed + ", " + topLeft.ySpeed + ")\n" + "(x2, y2) = "  + '(' + bottomRight.x + ", " + bottomRight.y + ")\n" + "(xSpeed, ySpeed) = "  + '(' + bottomRight.xSpeed + ", " + bottomRight.ySpeed + ")\n");
    }
    // метод проверки равенства скоростей
    public boolean speedCheck(){
        if(topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed){
            return true;
        }
        else {
            return false;
        }
    }

}