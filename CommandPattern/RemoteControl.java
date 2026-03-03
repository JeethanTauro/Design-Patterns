package CommandPattern;

//invoker knows nothing about buttons, light etc, it only knows about the command
public class RemoteControl {
    private Command buttonCommand;

    public void setButtonCommand(Command command){
        this.buttonCommand = command;
    }

    public void pressButton(){
        if(buttonCommand != null){
            buttonCommand.execute();
        }
    }
    public void pressUndo(){
        if(buttonCommand!=null){
            buttonCommand.undo();
        }
    }
}
