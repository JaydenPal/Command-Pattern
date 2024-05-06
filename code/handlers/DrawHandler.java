package handlers;

import commands.CommandCareTaker;
import commands.DrawCommand;
import hw3.DrawingList;

public class DrawHandler extends AbstractHandler {

/**
 * DrawHandler is a java class that handles request that match the 'Draw Command'
 * or passes the request to the next handler if not
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
    public DrawHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    /**
     * implemented abstract funciton from super class that handles the actions
     * for a Color command
     */
    public void hook(String[] requestStrings, DrawingList drawList) {
        DrawCommand newDrawCommand = new DrawCommand(drawList.getSelctedShape());
        getCommandCareTaker().executeCommand(newDrawCommand);
    }
}