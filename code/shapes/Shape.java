package shapes;

/**
 * Shape is an interface to create differnet types if shapes
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public interface Shape {
    public void draw();
    public void setColor(String color);
    public String getColor();
    public void move(int x, int y);
    public int getXCord();
    public int getYCord();
}