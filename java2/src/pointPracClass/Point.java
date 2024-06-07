package pointPracClass;

public class Point {
    private double x;
    private double y;
    Point()// Default constructor is the constructor that accepts no parametrers
    {
        this(0,0);

    }

    Point(double x, double y){
        setX(x); setY(y); //Alternate method
//        this.x = x;
//        this.y = y;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Point objOther){
        //Note that the parameters can be called in these ways
        return (x == objOther.x && getY() == objOther.getY());
    }

    public String toString(){
//        return "X = " + getX() + ", Y = " + getY();
        return "(" + getX() + ", " + getY() + ")";
    }

    Point(Point objOther){
        this(objOther.x, objOther.y);
    }

}
