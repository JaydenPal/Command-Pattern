package handlers;

import commands.CommandCareTaker;
import commands.DeleteCommand;
import hw3.DrawingList;

/**
 * DeleteHandler is a java class that handles request that match the 'Delete Command'
 * or passes the request to the next handler if not
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class DeleteHandler extends AbstractHandler {

    public DeleteHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    /**
     * implemented abstract funciton from super class that handles the actions
     * for a Delete command
     */
    public void hook(String[] requestStrings, DrawingList drawList) {
        DeleteCommand newDeleteCommand = new DeleteCommand(drawList);
        getCommandCareTaker().executeCommand(newDeleteCommand);
    }
}
