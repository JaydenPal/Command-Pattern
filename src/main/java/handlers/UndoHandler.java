package handlers;

import commands.CommandCareTaker;
import hw3.DrawingList;

/**
 * UndoHandler is a java class that undoes the last command when
 * passed an undo request or passes the request to the next handler if not
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class UndoHandler extends AbstractHandler {

    public UndoHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    /**
     * undoes the last commdand
     */
    public void hook(String[] requestStrings, DrawingList drawList) {
        getCommandCareTaker().undo();
    }
}
