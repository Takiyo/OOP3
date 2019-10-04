public class LightOnCommand implements Command{
    Light light;

    // Parameter is the specific light that will be controlled 
    // with this command.
    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
}