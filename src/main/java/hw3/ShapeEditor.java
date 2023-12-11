package hw3;

import java.io.File;
import java.util.Scanner;

import commands.CommandCareTaker;
import handlers.*;


/**
 * this class contains the logic to make a drawlist and follow
 * commans from a provided input from an input files
 */
public class ShapeEditor {
    public static void main(String[] args) {
        DrawingList drawingList = new DrawingList();
        CommandCareTaker commandCareTaker = drawingList.getCommandCareTaker();
        AbstractHandler firstHandler;

        ColorHandler colorHandler = new ColorHandler("color", commandCareTaker);
        CreateHandler createHandler = new CreateHandler("create", commandCareTaker);
        DeleteHandler deleteHandler = new DeleteHandler("delete", commandCareTaker);
        DrawHandler drawHandler = new DrawHandler("draw", commandCareTaker);
        DrawSceneHandler drawSceneHandler = new DrawSceneHandler("drawscene", commandCareTaker);
        MoveHandler moveHandler = new MoveHandler("move", commandCareTaker);
        SelectHandler selectHandler = new SelectHandler("select", commandCareTaker);
        UndoHandler undoHandler = new UndoHandler("undo", commandCareTaker);
        DefaultHandler defaultHandler = new DefaultHandler("default", commandCareTaker);

        colorHandler.setNextHandler(createHandler);
        createHandler.setNextHandler(deleteHandler);
        deleteHandler.setNextHandler(drawHandler);
        drawHandler.setNextHandler(drawSceneHandler);
        drawSceneHandler.setNextHandler(moveHandler);
        moveHandler.setNextHandler(selectHandler);
        selectHandler.setNextHandler(undoHandler);
        undoHandler.setNextHandler(colorHandler);
        undoHandler.setNextHandler(defaultHandler);

        firstHandler = colorHandler;

        File file = new File(args[0]);
        Scanner inputScanner;
        try {
            inputScanner = new Scanner(file);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

        while(inputScanner.hasNext()) {
            String line = inputScanner.nextLine();
            String[] lineTokens = line.split(" ");
            // if(!lineTokens[0].toLowerCase().equals("select") && !lineTokens[0].toLowerCase().equals("create") && drawingList.getSelectedShapeId() == 0) {
            //     System.out.println("No shape selected.");
            //     continue;
            // }
            firstHandler.handleRequest(lineTokens, drawingList);
        }

        inputScanner.close();
    }
}
