import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private List<VideoLecture> videoLectures = new ArrayList<>();
    public void addVideoLectures(VideoLecture videoLecture){
        videoLectures.add(videoLecture);
    }
    public void showCourseContent(){
        for(VideoLecture videoLecture: videoLectures){
            System.out.println(videoLecture.getInfo());
        }
    }
    public void playVideoLecture(int index){
        if(index >= 0 && index < videoLectures.size()){
            videoLectures.get(index).play();
        } else {
            System.out.println("Invalid index");
        }
    }
}
