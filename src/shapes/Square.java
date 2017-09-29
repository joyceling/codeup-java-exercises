package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        double side = this.length;
        return side * 4;
    }

    @Override
    public double getArea() {
        double side = this.width;
        return Math.pow(side, 2);
    }
}

