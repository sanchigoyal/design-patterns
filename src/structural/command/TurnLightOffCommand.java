package structural.command;

public class TurnLightOffCommand implements Command {

  private Light light;

  public TurnLightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    this.light.off();
  }
}
