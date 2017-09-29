package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    // abstract classes/methods can implement static methods (methods that apply to all objects)
    protected int length;
    protected int width;

    public Quadrilateral (int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength () {
        return length;
    }

    public int getWidth () {
        return width;
    }

    abstract void setLength (int length);

    abstract void setWidth (int width);

}
