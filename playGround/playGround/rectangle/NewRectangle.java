package rectangle;

public class NewRectangle {
    private int width;
    private int height;
    public NewRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int perimeter() {
        return (width + height) * 2;
    }
}
