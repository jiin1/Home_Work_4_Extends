package AbstractShape;


public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint_2 center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center=new MovablePoint_2(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                "} " + super.toString();
    }


    public void moveUp(){
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();;
    }
}
