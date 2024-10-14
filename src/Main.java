//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "music.mp3");
        AudioPlayer wavPlayer = new AudioAdapter("wav");
        wavPlayer.play("wav", "wav Music");
        AudioPlayer accPlayer = new AudioAdapter("acc");
        accPlayer.play("acc", "acc music");

        }
    }
