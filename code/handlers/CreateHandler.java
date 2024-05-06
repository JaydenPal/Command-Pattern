package handlers;

import commands.CommandCareTaker;
import commands.CreateCommand;
import hw3.DrawingList;

/**
 * CreateHandler is a java class that handles request that match the 'Create Command'
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class CreateHandler extends AbstractHandler{

    public CreateHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    /**
     * implemented abstract funciton from super class that handles the actions
     * for a Create command or passes the request to the next handler if not
     */
    public void hook(String[] requestStrings, DrawingList drawList) {
        int [] dimensions = parseDimensions(requestStrings);
        CreateCommand createCommand = new CreateCommand(requestStrings[1].toLowerCase(), dimensions, drawList);
        getCommandCareTaker().executeCommand(createCommand);
    }

    /**
     * parses the dimensions needed for creating a shape with the create 
     * command object into an array so a shape with any x number of dimensions
     * can be added (i.e circle = 1 dimension r; rectangle = 2 dimesnions l,w)
     * @param requestStrings
     * @return array of dimensions 
     */
    public int[] parseDimensions(String[] requestStrings) {
        int [] dimensions;
        if(requestStrings.length == 3) {
            dimensions = new int[1];
            dimensions[0] = Integer.parseInt(requestStrings[2]);
        } else {
            dimensions = new int[2];
            dimensions[0] = Integer.parseInt(requestStrings[2]);
            dimensions[1] = Integer.parseInt(requestStrings[3]);
        }
        return dimensions;
    }
}