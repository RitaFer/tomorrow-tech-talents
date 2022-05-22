package extras.cursoemvideo.finalProject;

public class View {
    private Locust viewer;
    private Video film;

    public View(Locust viewer, Video film) {
        this.viewer = viewer;
        this.film = film;
        this.viewer.setTotalWatched(this.viewer.getTotalWatched() + 1);
        this.film.setViews(this.film.getViews() + 1);
    }

    public Locust getViewer() {
        return viewer;
    }

    public void setViewer(Locust viewer) {
        this.viewer = viewer;
    }

    public Video getFilm() {
        return film;
    }

    public void setFilm(Video film) {
        this.film = film;
    }

    public void assess(){
        this.film.setAssessment(5);
    }

    public void assess(double note){
        this.film.setAssessment(note);
    }

    public void assess(float perc){
        int total = 0;
        if(perc<=20){
            total = 3;
        }else if(perc<=50){
            total = 5;
        }else if(perc<=80){
            total = 8;
        }else{
            total = 10;
        }
        this.film.setAssessment(total);
    }

    @Override
    public String toString() {
        return "View{" +
                "viewer=" + viewer +
                ", film=" + film +
                '}';
    }
}
