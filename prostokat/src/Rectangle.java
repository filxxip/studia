import java.lang.Math;

public class Rectangle {
    private Point right_vertex;
    private Point left_vertex;

    Rectangle() {
        setDefaultValues();
    }

    Rectangle(Point first, Point second) {
        if (areCoordinatesValid(first, second)) {
            right_vertex = first;
            left_vertex = second;
        } else {
            setDefaultValues();
        }
    }

    Rectangle(double left_x, double left_y, double right_x, double right_y) {
        if (areCoordinatesValid(left_x, left_y, right_x, right_y)) {
            right_vertex = new Point(right_x, right_y);
            left_vertex = new Point(left_x, left_y);
        } else {
            setDefaultValues();
        }
    }

    Rectangle(Point start_point, double horizontal_side_lenght, double vertical_side_measure){
    if (areSidesMeasureValid(horizontal_side_lenght, vertical_side_measure)){
        left_vertex = start_point;
        left_vertex = left_vertex.createNewMovedPoint(horizontal_side_lenght, vertical_side_measure);
    }else{
        setDefaultValues();
    }
    }

    private void setDefaultValues() {
        right_vertex = new Point(1, 1);
        left_vertex = new Point(0, 0);
    }

    private boolean areCoordinatesValid(Point first, Point second) {
        boolean first_side_valid = !(first.getX() == second.getX());
        boolean second_side_valid = !(first.getY() == second.getY());

        return first_side_valid && second_side_valid;
    }

    private boolean areCoordinatesValid(double left_x, double left_y, double right_x, double right_y) {
        boolean first_side_valid = !(left_x == right_x);
        boolean second_side_valid = !(left_y == right_y);

        return first_side_valid && second_side_valid;
    }

    private boolean areSidesMeasureValid(double first_side, double second_side){
        return first_side!=0 && second_side!=0;
    }


    private double getAbsValueOf(double value) {
        return value < 0 ? -value : value;
    }

    private double getVerticalSideMeasure() {
        return getAbsValueOf(right_vertex.getY() - left_vertex.getY());
    }

    private double getHorizontalSideMeasure() {
        return getAbsValueOf(right_vertex.getX() - left_vertex.getX());
    }

    public double getArea() {
        return getVerticalSideMeasure() * getHorizontalSideMeasure();
    }

    public double getCircumference() {
        return 2 * getVerticalSideMeasure() + 2 * getHorizontalSideMeasure();
    }

    public double getDiagonal() {
        double squere_sum = getHorizontalSideMeasure() * getHorizontalSideMeasure() + getVerticalSideMeasure() * getVerticalSideMeasure();
        return Math.sqrt(squere_sum);
    }

    public void move(double delta_x, double delta_y){
            right_vertex.move(delta_x, delta_y);
            left_vertex.move(delta_x, delta_y);
    }


    public void showData() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println("Diagonal: " + getDiagonal() + "\n");

    }
}
