package handlers;

import commands.CommandCareTaker;
import commands.DrawSceneCommand;
import hw3.DrawingList;

public class DrawSceneHandler extends AbstractHandler{

    /**
     * DrawSceneHandler is a java class that handles request that match the 'DrawScene Command'
     * or passes the request to the next handler if not
     * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
     */
    public DrawSceneHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    /**
     * implemented abstract funciton from super class that handles the actions
     * for a DrawScene command
     */
    public void hook(String[] requestStrings, DrawingList drawList) {
        DrawSceneCommand newDrawSceneCommand = new DrawSceneCommand(drawList);
        getCommandCareTaker().executeCommand(newDrawSceneCommand);
    }
}
