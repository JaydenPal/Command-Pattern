# Description
This is a project created for an assignment in my Object Oriented Systems class.

The goal is to simulate a drawing board that could be implemented on something like javafx. 

The project impelemnts the command oattern to take in commands from a user such as "Draw", 
"Select", or "Delete" to interact with the drawboard and change its state. Users can then undo 
these actions which is accomplished through the implementation of the memento design pattern. 

Lastly, the actual requests to perform a command are processed by event handlers using 
the chain of responsibility design pattern. 

# Technology
Java projectcreated with Maven
