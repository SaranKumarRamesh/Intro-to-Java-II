package geometricObjectClass;

public class GeometricObject {
    private String color = "black";

    public String getColor() {
        return color;
    }

    public GeometricObject() {
        this.color = "black";
    }
    public void setColor(String color) {
        this.color = color;
    }

    public GeometricObject(String color) {
        this.color = color;
    }
}