package commands;

import memento.Memento;

/**
 * Command is an interface for making different tyes of commands
 * 
 * @author Jayden Palacios (ubc007) : CS-3773 Assign-3
 */
public interface Command {
    public void execute();
    public void undo();
    public Memento getMemento();
}