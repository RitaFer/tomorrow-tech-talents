package extras.cursoemvideo.finalProject;

public class Locust extends Person{
    private String login;
    private int totalWatched;

    public Locust(String name, int age, String sex, int xp, String login){
        super(name, age, sex, xp);
        this.login = login;
        this.totalWatched = 0;
    }

    public void watched(){
        this.totalWatched++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalWatched() {
        return totalWatched;
    }

    public void setTotalWatched(int totalWatched) {
        this.totalWatched = totalWatched;
    }

    @Override
    public String toString() {
        return "Locust{" +
                "login='" + login + '\'' +
                ", totalWatched=" + totalWatched +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", xp=" + xp +
                '}';
    }
}
