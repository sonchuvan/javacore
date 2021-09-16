package OOPEx;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 5;
        height = 5;
    }

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }
}
