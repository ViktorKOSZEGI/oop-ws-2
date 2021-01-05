public class Rectangle {
    private int height;
    private int width;
    private int size;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height, int width, int size) {
        this.height = height;
        this.width = width;
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
