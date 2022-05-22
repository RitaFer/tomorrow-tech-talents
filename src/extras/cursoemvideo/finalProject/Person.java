package extras.cursoemvideo.finalProject;

public abstract class Person {
    protected String name;
    protected int age;
    protected String sex;
    protected int xp;

    public Person(String name, int age, String sex, int xp) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.xp = xp;
    }

    protected void moreXp(){
        this.xp++;
    }
}