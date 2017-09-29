package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    @Override
    void setLength(int length) {
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
        return width * 4;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}

