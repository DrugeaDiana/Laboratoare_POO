package task3;

public class Point {

    private float x;
    private float y;


    public Point(float _x, float _y)
    {
        this.x = _x;
        this.y = _y;
    }

    public void changeCoords(float _newx, float _newy) {
        this.x = _newx;
        this.y = _newy;
    }

    public void showPoint(){
        System.out.println("(" + x + ", " + y + ")");
    }
}
