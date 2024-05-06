package commands;

import memento.Memento;
import shapes.Shape;

/**
 * DrawCommand is a java class that represents a command that draws
 * the currently selected shape
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class DrawCommand implements Command {
    private Shape shape;
    private Memento drawMemento;
    

    public DrawCommand(Shape shape) {
        this.shape = shape;
    }

    /**
     * draws the currenlty selected shape in the draw list
     */
    public void execute() {
        drawMemento = new Memento("none", 0, 0, 0, this);
        shape.draw();
    }

    public void undo(){}

    public Memento getMemento() {
        return drawMemento;
    }
}
