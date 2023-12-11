package commands;

import memento.Memento;
import hw3.DrawingList;

/**
 * SelectCommand is a java class that represents a command that selects 
 * the shape with the provided id
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class SelectCommand implements Command {
    private DrawingList drawList;
    private int shapeId;
    private Memento selectMemento;

    public SelectCommand(int shapeId, DrawingList drawList) {
        this.drawList = drawList;
        this.shapeId = shapeId;
    }

    /**
     *selects the shape from the drawlist with the provided id 
     */
    public void execute() {
        selectMemento = new Memento("none", 0, 0, drawList.getSelectedShapeId(), this);
        drawList.setSelectedShapeId(shapeId);
    }
    public void undo() {
        drawList.setSelectedShapeId(selectMemento.getId());
    }
    public Memento getMemento() {
        return selectMemento;
    }
}