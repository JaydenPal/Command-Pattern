package handlers;
import commands.CommandCareTaker;
import hw3.DrawingList;

/**
 * AbstractHandler is an absract java class that provides the skeleton  code
 * all handlers need to do their job 
 * 
 * hook function must be implemnted by subclasses to handle executing command
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public abstract class AbstractHandler {
    private AbstractHandler nextHandler;
    private String commandType;
    private CommandCareTaker commandCareTaker;

    public AbstractHandler(String commandType, CommandCareTaker commandCareTaker) {
        this.commandType = commandType;
        this.commandCareTaker = commandCareTaker;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * checks if if command type matches handler and performs necessary actions
     * passes request to next handler if not 
     * @param requestStrings - request string as tokens
     * @param drawList
     */
    public void handleRequest(String[] requestStrings, DrawingList drawList) {
        if(requestStrings[0].toLowerCase().equals(commandType)) {
            hook(requestStrings, drawList);
        } else {
            nextHandler.handleRequest(requestStrings, drawList);
        }
    }

    public CommandCareTaker getCommandCareTaker() {
        return commandCareTaker;
    }
    abstract void hook(String[] requestStrings, DrawingList drawList);
}