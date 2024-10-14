public class AdvancedRemote extends RemoteControl{
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void setFavoriteChannel(int channel){
        System.out.println("Favorite channel: " + channel);
        device.setChannel(channel);
    }
}
