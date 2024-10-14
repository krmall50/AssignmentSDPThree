public class TVDevice implements Device{
    private int channel;
    private int volume;
    @Override
    public void powerOn() {
        System.out.println("Power is on");
    }

    @Override
    public void powerOff() {
        System.out.println("Power is off");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume= volume;
        System.out.println("Volume set to " + volume);
    }
}
