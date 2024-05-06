package hw3;
import java.util.ArrayList;

import commands.CommandCareTaker;
import shapes.Shape;

/**
 * DrawingList is a class that represnets a draw list for a gui component 
 * but without actually drawing, using text instead 
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class DrawingList {
    private int selectedShapeId;
    private ArrayList<Shape> shapes;
    private CommandCareTaker commandCareTaker;


    public DrawingList() {
        selectedShapeId = 0;
        shapes = new ArrayList<Shape>();
        commandCareTaker = new CommandCareTaker();
        shapes.add(null);
    }

    /**
     * draws each shape currently in the shapes ArrayList
     */
    public void drawScene() {
        for (Shape shape : shapes) {
            if(shape != null)
                shape.draw();
        }
    }

    /**
     * returns the shape at the index of the shapes array matching the current shape id
     */
    public Shape getSelctedShape() {
        return shapes.get(selectedShapeId);
    }

    /**
     * removes the shape with the matching shape id
     */
    public void removeShape(int shapeId) {
        shapes.set(shapeId, null);
    }

     /**
     * returns the shape with the matching shape id
     */
    public Shape getShapeById(int shapeId) {
        return shapes.get(shapeId);
    }

    public void setSelectedShapeId(int newShapeId) {
        if(newShapeId == 0) {
            selectedShapeId = newShapeId;
            return;
        } else if (newShapeId < shapes.size() && newShapeId >= 0 && shapes.get(newShapeId) != null) {
            selectedShapeId = newShapeId;
        } else {
            System.out.println("ERROR: invalid shape for SELECT");
        }
    }

    public int getSelectedShapeId() {
        return selectedShapeId;
    }


    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public CommandCareTaker getCommandCareTaker() {
        return commandCareTaker;
    }
}
