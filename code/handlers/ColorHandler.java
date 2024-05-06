package handlers;

import commands.ColorCommand;
import commands.CommandCareTaker;
import hw3.DrawingList;

/**
 * ColorHandler is a java class that handles request that match the 'Color Command'
 * or passes the request to the next handler if not
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class ColorHandler extends AbstractHandler{
    
    public ColorHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    /**
     * implemented abstract funciton from super class that handles the actions
     * for a Color command
     */
    public void hook(String[] requestStrings, DrawingList drawList) {
        ColorCommand colorCommand = new ColorCommand(requestStrings[1], drawList);
        getCommandCareTaker().executeCommand(colorCommand);
    }
}
