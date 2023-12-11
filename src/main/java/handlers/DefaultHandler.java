package handlers;

import commands.CommandCareTaker;
import hw3.DrawingList;

public class DefaultHandler extends AbstractHandler {

    public DefaultHandler(String commandType, CommandCareTaker commandCareTaker) {
        super(commandType, commandCareTaker);
    }

    @Override
    public void handleRequest(String[] requestStrings, DrawingList drawList) {
        hook(requestStrings, drawList);
    }
    public void hook(String[] requestStrings, DrawingList drawList) {
        System.out.println("Invalid command!");
    }
}
