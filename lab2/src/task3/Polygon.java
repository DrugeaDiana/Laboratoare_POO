package task3;

import java.util.ArrayList;
import java.util.List;

public class Polygon {

    private List<Point> points = new ArrayList<>();
    private int nr;

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public Polygon(int _number_points) {
        nr = _number_points;
        for(int i = 0; i < nr; i++) {
            points.add(new Point(0,0));
        }
    }

    public Polygon(float[] _points){
        this(_points.length / 2);

        for(int i = 0; i < nr * 2; i += 2){
            points.get(i / 2).changeCoords(_points[i], _points[i+1]);
        }
    }

    public void showPolygon() {
        for (Point point : points) {
            point.showPoint();
        }
    }
}
