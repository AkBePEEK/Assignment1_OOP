public class MyApplication{
    public static void main(String[] args) {
        Point[] points = new Point[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new Point(Math.random(), Math.random());
        }

        Shape shape = new Shape(points);

        double perimeter = shape.perimeter();
        double longestSide = shape.longestSide();
        double averageSide = shape.averageSide();

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Longest Side: " + longestSide);
        System.out.println("Average Side: " + averageSide);
    }
}