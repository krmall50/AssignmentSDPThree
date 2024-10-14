public class SoundSystemDevice implements Device{
    private int volume;

    @Override
    public void powerOn() {
        System.out.println("Sound system is now on");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound system is now off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound system has no channels");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to " + volume);
    }
}
