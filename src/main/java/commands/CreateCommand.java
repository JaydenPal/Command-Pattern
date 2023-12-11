package commands;

import hw3.DrawingList;
import memento.Memento;
import shapes.*;

/**
 * CreateCommand is a java class that represents a command that creates a 
 * shape object specified by input
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class CreateCommand implements Command{
    private String shapeType;
    private int [] dimensions;
    private DrawingList drawList;
    private Memento createMemento;

    public CreateCommand(String shapeType, int [] dimensions, DrawingList drawList) {
        this.shapeType = shapeType;
        this.dimensions = dimensions;
        this.drawList = drawList;
    }

    /**
     * creates a shape object with type specifed by user
     */
    public void execute() {
        Shape newShape;
        if(shapeType.toLowerCase().equals("rectangle")) {
            newShape = new Rectangle(dimensions[0], dimensions[1]);
        } else {
            newShape = new Circle(dimensions[0]);
        }
        createMemento = new Memento("none", 0, 0, drawList.getSelectedShapeId(), this);
        drawList.addShape(newShape);
    }

    public void undo() {
        drawList.removeShape(createMemento.getId());
    }

    public Memento getMemento() {
        return createMemento;
    }
}
