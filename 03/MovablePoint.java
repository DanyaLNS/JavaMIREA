class MovablePoint  implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    // конструкторы
    public MovablePoint(){}
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return ("(x, y) = "  + '(' + x + ", " + y + ")\n" + "(xSpeed, ySpeed) = "  + '(' + xSpeed + ", " + ySpeed + ")\n");
    }
    // методы перемещения
    public void moveUp(){
        this.y += ySpeed;
    }
    public void moveDown(){
        this.y -= ySpeed;
    }
    public void moveRight(){
        this.x += xSpeed;
    }
    public void moveLeft(){
        this.x -= xSpeed;
    }
}