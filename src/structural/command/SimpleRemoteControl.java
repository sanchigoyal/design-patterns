package structural.command;

public class SimpleRemoteControl {
  private Command button1;
  private Command button2;

  public SimpleRemoteControl(Command button1, Command button2) {
    this.button1 = button1;
    this.button2 = button2;
  }

  public void pressButton1(){
    button1.execute();
  }

  public void pressButton2(){
    button2.execute();
  }
}
