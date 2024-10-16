import java.security.PublicKey;

public class RealVideoLecture implements VideoLecture{
    private String title;
    public RealVideoLecture(String title) {
        this.title = title;
        loadVideo();
    }

    private void loadVideo(){
        System.out.println("Loading Video Lecture: " + title);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String getInfo() {
        return "Video Lecture: " + title;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + title);
    }
}
