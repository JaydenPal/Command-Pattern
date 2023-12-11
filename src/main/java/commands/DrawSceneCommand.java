package commands;
import hw3.DrawingList;
import memento.Memento;

/**
 * DrawSceneCommand is a java class that represents a command that draws
 * all of the shapes currently in the draw list
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class DrawSceneCommand implements Command {
    private DrawingList drawList;
    private Memento drawSceneMemento;

    public DrawSceneCommand(DrawingList drawList) {
        this.drawList = drawList;
    }

    /*
     * draws all of the shapes currently in the draw list
     */
    public void execute() {
        drawSceneMemento = new Memento("none", 0, 0, 0, this);
        drawList.drawScene();
    }

    public void undo(){}

    public Memento getMemento() {
        return drawSceneMemento;
    }
}
