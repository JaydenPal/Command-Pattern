package handlers;

import commands.CommandCareTaker;
import commands.SelectCommand;
import hw3.DrawingList;

/**
 * SelectHandler is a java class that handles request that match the 'Select Command'
 * or passes the request to the next handler if not
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class SelectHandler extends AbstractHandler{

    public SelectHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    /**
     * implemented abstract funciton from super class that handles the actions
     * for a Select command
     */
    public void hook(String[] requestStrings, DrawingList drawList) {
        SelectCommand newSelectCommand = new SelectCommand(Integer.parseInt(requestStrings[1]), drawList);
        getCommandCareTaker().executeCommand(newSelectCommand);
    }
}
