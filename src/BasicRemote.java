public class BasicRemote extends RemoteControl{
    public BasicRemote(Device device){
        super(device);
    }
    public void mute(){
        System.out.println("Muted");
        device.setVolume(0);
    }
}
