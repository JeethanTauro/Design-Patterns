package CommandPattern;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command turnOn = new LightOnCommand(livingRoomLight);
        Command turnOff = new LightOffCommand(livingRoomLight);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setButtonCommand(turnOn);
        remoteControl.pressButton();
        remoteControl.pressUndo();
    }
}
