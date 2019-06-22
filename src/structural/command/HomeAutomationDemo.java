package structural.command;

public class HomeAutomationDemo {

  public static void main(String[] args) {

    // create the receiver
    Light light = new Light();

    // prepare the commands
    Command turnLightOnCommand = new TurnLightOnCommand(light);
    Command turnLightOffCommand = new TurnLightOffCommand(light);

    // initiate invoker with the commands
    SimpleRemoteControl remote = new SimpleRemoteControl(turnLightOnCommand, turnLightOffCommand);

    // perform action
    remote.pressButton1();
    remote.pressButton2();
  }
}
