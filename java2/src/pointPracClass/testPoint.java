package pointPracClass;

public class testPoint {
    public static void main(String[] args) {
        Point a = new Point();

        Point b = new Point(2.0, 3.0);

        Point c = new Point(b);

        c.setX(3.0);

        System.out.println("The distance between " + a + " and " + b + " is " +
                Math.sqrt((a.getX()- b.getX()) * (a.getX()- b.getX()) + (a.getY()- b.getY()) * (a.getY()- b.getY()))
        );
    }
}
