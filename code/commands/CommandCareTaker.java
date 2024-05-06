package commands;

import java.util.ArrayList;
import memento.Memento;

/**
 * CommandCareTaker is a class that handles the proces of executing commands and storing 
 * their mementos
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public class CommandCareTaker {
    private ArrayList<Memento> mementos;

    public CommandCareTaker() {
        mementos = new ArrayList<Memento>();
    }

    /**
     * adds a memento to the memento list
     * @param commandMemento
     */
    public void add(Memento commandMemento) {
        mementos.add(commandMemento);
    }

    /**
     * undoes the most recent command by restoring the memento
     */
    public void undo() {
        Memento mostRecentMemento;
        // System.out.println("undoing");
        mostRecentMemento = mementos.remove(mementos.size() - 1);
        mostRecentMemento.getCommand().undo();
    }

    /**
     * executes the passed command and stores its mementos in the list
     * @param command
     */
    public void executeCommand(Command command) {
        command.execute();
        add(command.getMemento());
    }
}
