public class AudioAdapter implements AudioPlayer{
    AdvancedAudioPlayer advancedAudioPlayer;
    public AudioAdapter(String audioType){
        if(audioType.equalsIgnoreCase("wav")){
            advancedAudioPlayer = new AdvancedAudioPlayer();
        }
        else if(audioType.equalsIgnoreCase("acc")){
            advancedAudioPlayer = new AdvancedAudioPlayer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("wav")){
            advancedAudioPlayer.playWAV(fileName);
        }
        else if(audioType.equalsIgnoreCase("acc")){
            advancedAudioPlayer.playAAC(fileName);
        }
    }
}
