package shapes;

abstract public class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) return false;
        Shape shape2 = (Shape) obj;
        return this.x == shape2.x && this.y == shape2.y && this.color.equals(shape2.color);
    }
}
