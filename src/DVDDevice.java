public class DVDDevice implements Device{
    int volume;
    @Override
    public void powerOn() {
        System.out.println("DVD is on");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD is off");

    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD has no channels");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to " + volume);
    }
}
