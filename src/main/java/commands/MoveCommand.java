package commands;

import hw3.DrawingList;
import memento.Memento;
import shapes.Shape;

/**
 * MoveCommand is a java class that represents a command that moves
 * the origin of a shape to the provided x and y values
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class MoveCommand implements Command {
    private DrawingList drawList;
    private int x;
    private int y;
    private Memento moveMemento;

    public MoveCommand(DrawingList drawList, int x, int y) {
        this.drawList = drawList;
        this.x = x;
        this.y = y;
    }

    /**
     * moves the origin of the slected shape to the provided
     * x and y values
     */
    public void execute() {
        Shape curShape = drawList.getSelctedShape();
        moveMemento = new Memento("none", curShape.getXCord(), curShape.getYCord(), drawList.getSelectedShapeId(), this);
        curShape.move(x, y);
    }

    public void undo(){
        drawList.getSelctedShape().move(moveMemento.getXCord(), moveMemento.getYCord());
    }

    public Memento getMemento() {
        return moveMemento;
    }
}
