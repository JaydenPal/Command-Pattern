package shapes;

/**
 * Rectangle is a class that represents a rectangle
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class Rectangle implements Shape {
    private int height;
    private int width;
    private int xCord;
    private int yCord;
    private String color;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        xCord = 0;
        yCord = 0;
        color = "Red";
    }

    /**
     * prints out the information about the rectangle
     */
    public void draw() {
        System.out.println(String.format("Rectangle, Color: %s, Origin: (%d, %d), Width: %d, Height: %d", color, xCord, yCord, height, width));
    }

    /**
     * moves the rectangle to the new coords
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