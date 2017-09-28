package shapes;

public class Square extends Rectangle {

    public Square (int side) {

        super(side, side);
    }

    public int getArea () {
        int area = super.length * super.width;
        return area;

    }

    public int getPerimeter () {
        int perimeter = 4 * (super.length);
        return perimeter;
    }


}

