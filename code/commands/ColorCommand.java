package commands;
import shapes.Shape;
import hw3.DrawingList;
import memento.Memento;

/**
 * ColorCommand is a java class that represents a command that changes the 
 * color of a specific shape within the draw list
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class ColorCommand implements Command {
    private Shape shape;
    private String newColor;
    private Memento colorMemento;
    private DrawingList drawList;

    public ColorCommand(String newColor, DrawingList drawList) {
        this.newColor = newColor;
        this.drawList = drawList;
        this.shape = drawList.getSelctedShape();
    }

    /**
     * changes the color of the passed shape to the provided color
     */
    public void execute() {
        colorMemento = new Memento(shape.getColor(), shape.getXCord(), shape.getYCord(), drawList.getSelectedShapeId(), this);
        shape.setColor(newColor);
    }

    /**
     * undoes the command
     */
    public void undo() {
        shape.setColor(colorMemento.getColor());
    }

    public Memento getMemento() {
        return colorMemento;
    }
}

