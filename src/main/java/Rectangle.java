public class Rectangle {
    private final int HEIGHT;
    private final int WIDTH;
    private int size;

    public Rectangle(int height, int width) {
        this.HEIGHT = height;
        this.WIDTH = width;
    }

    public Rectangle(int height, int width, int size) {
        this.HEIGHT = height;
        this.WIDTH = width;
        this.size = size;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getSize() {
        return size;
    }

    public double calculateArea() {
        return HEIGHT * WIDTH;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                ", size=" + size +
                '}';
    }

    public void printRectangle() {
        System.out.println(this.toString());
    }
}
