package extras.cursoemvideo.ex08;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void birthday(){
        this.age = this.age + 1;
    }
}