public class Point {
     private double x_coordinate;
     private double y_coordinate;
    Point(double x, double y){
        x_coordinate = x;
        y_coordinate = y;
    }
    public double getX(){
        return x_coordinate;
    }
    public double getY(){
        return y_coordinate;
    }

    public void move(double x, double y){
        x_coordinate+=x;
        y_coordinate+=y;
    }

    public Point createNewMovedPoint(double delta_x, double delta_y){
        return new Point(x_coordinate+delta_x, y_coordinate+delta_y);
    }
}

