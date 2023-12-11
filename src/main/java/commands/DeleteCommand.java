package commands;

import memento.Memento;
import shapes.Shape;
import hw3.DrawingList;

/**
 * DeleteCommand is a java class that represents a command that deletes
 * the currently seleced shape
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class DeleteCommand implements Command {
    private DrawingList drawList;
    private Shape shapeToDelete;
    private Memento deleteMemento;

    public DeleteCommand(DrawingList drawList) {
        this.drawList = drawList;
        this.shapeToDelete = drawList.getSelctedShape();
    }

    /**
     * deletes the currenlty selected shape from the draw list
     */
    public void execute() {
        deleteMemento = new Memento("none", 0, 0, drawList.getSelectedShapeId(), this);
        drawList.getShapes().set(drawList.getSelectedShapeId(), null);
        drawList.setSelectedShapeId(0);
    }

    public void undo() {
        drawList.getShapes().add(deleteMemento.getId(), shapeToDelete);
        drawList.setSelectedShapeId(deleteMemento.getId());
    } 

    public Memento getMemento() {
        return deleteMemento;
    }
}
