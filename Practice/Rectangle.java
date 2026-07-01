class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int side) {
        this(side, side);
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        System.out.println(length * width);
    }
}

class Demo {
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle(5);
        a1.area();
    }
}