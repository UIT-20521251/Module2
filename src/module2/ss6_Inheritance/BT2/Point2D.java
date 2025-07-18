package module2.ss6_Inheritance.BT2;

public class Point2D {
    private float x;
    private float y;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {}
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = {x,y};
        return xy;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
