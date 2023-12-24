public class Shape {
    private final Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public double perimeter() {
        double perimeter = 0;
        int n = points.length;

        for (int i = 0; i < n - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }

        perimeter += points[n - 1].distanceTo(points[0]);

        return perimeter;
    }

    public double longestSide() {
        double longest = 0;

        for (int i = 0; i < points.length - 1; i++) {
            double sideLength = points[i].distanceTo(points[i + 1]);
            if (sideLength > longest) {
                longest = sideLength;
            }
        }

        double lastSide = points[points.length - 1].distanceTo(points[0]);
        if (lastSide > longest) {
            longest = lastSide;
        }

        return longest;
    }

    public double averageSide() {
        int n = points.length;
        return perimeter() / n;
    }
}