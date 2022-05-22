package extras.cursoemvideo.finalProject;

public class Video implements VideoActions{
    private String title;
    private double assessment;
    private int views;
    private int likes;
    private boolean play;

    public Video(String title) {
        this.title = title;
        this.assessment = 1;
        this.views = 0;
        this.likes = 0;
        this.play = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAssessment() {
        return assessment;
    }

    public void setAssessment(double assessment) {
        int newAssessment;
        newAssessment = (int) ((this.assessment+assessment)/this.getViews());
        this.assessment = newAssessment;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }


    @Override
    public void play() {
        this.play = true;
    }

    @Override
    public void pause() {
        this.play = false;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", assessment=" + assessment +
                ", views=" + views +
                ", likes=" + likes +
                ", play=" + play +
                '}';
    }
}