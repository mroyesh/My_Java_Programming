package day17_CustomClass.PracticeTasks;

public class Rectangle {

    public double length;
    public double width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double CalculateArea(double length, double width) {
        double area = width * length;
        return area;
    }

    public double parameter(double length, double width) {

        double parameter = 2 * (length + width);
        return parameter;

    }

    public String toString() {
        return "Rectangle{" +
                " length=" + length +
                ", width=" + width +
                ", CalculateArea=" + CalculateArea(length, width) +
                " ,parameter = " + parameter(length, width) +
                '}';
    }

}
