package handlers;

import commands.CommandCareTaker;
import commands.MoveCommand;
import hw3.DrawingList;

/**
 * MoveHandler is a java class that handles request that match the 'Move Command'
 * or passes the request to the next handler if not
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class MoveHandler extends AbstractHandler{

    public MoveHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    /**
     * implemented abstract funciton from super class that handles the actions
     * for a Move command
     */
    public void hook(String[] requestStrings, DrawingList drawList) {
        MoveCommand newMoveCommand = new MoveCommand(drawList, Integer.parseInt(requestStrings[1]), Integer.parseInt(requestStrings[2]));
        getCommandCareTaker().executeCommand(newMoveCommand);
    }
}
