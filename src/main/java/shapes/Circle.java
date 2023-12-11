package shapes;

/**
 * Circle is a class that represents a circle
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class Circle implements Shape {
    private int radius;
    private int xCord;
    private int yCord;
    private String color;

    public Circle(int radius) {
        this.radius = radius;
        xCord = 0;
        yCord = 0;
        color = "Blue";
    }

    /**
     * prints out the information about the circle
     */
    public void draw() {
        System.out.println(String.format("Circle, Color: %s, Origin: (%d, %d), Radius: %d", color, xCord, yCord, radius));
    }

    /**
     * moves the circle to the new coords
     */
    public void move(int x, int y) {
        xCord = x;
        yCord = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getXCord() {
        return xCord;
    }

    public void setXCord(int xCord) {
        this.xCord = xCord;
    }

    public int getYCord() {
        return yCord;
    }

    public void setYCord(int yCord) {
        this.yCord = yCord;
    }
}