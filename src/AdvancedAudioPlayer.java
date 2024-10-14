public class AdvancedAudioPlayer implements WAVPlayer, AACPlayer{
    @Override
    public void playWAV(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }
    @Override
    public void playAAC(String fileName) {
        System.out.println("Playing AAC file: " + fileName);
    }

}
