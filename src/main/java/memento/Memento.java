package memento;

import commands.Command;

public class Memento {
    private String color;
    private int xCord;
    private int yCord;
    private int selectedShapeId;
    private Command command;

    public Memento(String color, int xCord, int yCord, int selectedShapeId, Command command) {
        this.color = color;
        this.xCord = xCord;
        this.yCord = yCord;
        this.selectedShapeId = selectedShapeId;
        this.command = command;
    }

    public String getColor() {
        return color;
    }

    public int getXCord() {
        return xCord;
    }

    public int getYCord() {
        return yCord;
    }

    public int getId() {
        return selectedShapeId;
    }

    public Command getCommand() {
        return command;
    }
}
