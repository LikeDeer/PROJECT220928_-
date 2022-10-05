package Practice4_4;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() { return width * height; }

    public void show() {
        System.out.println("(" + x + ", " + y + ")" +
                "에서 크기가 " + width + "x" + height + "인 사각형");
    }

    public boolean contains(Rectangle r) {
        if ((height/2.0 >= (Math.abs(r.y - y) + r.height/2.0))
                && (width/2.0 >= (Math.abs(r.x - x) + r.width/2.0)))
            return true;
        else
            return false;
    }
}
