package handlers;
import hw3.DrawingList;
public interface Handler {
    public void handleRequest(String[] requestStrings, DrawingList drawList);
}