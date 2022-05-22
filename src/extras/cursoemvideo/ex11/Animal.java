package extras.cursoemvideo.ex11;

public abstract class Animal {
    protected double weight;
    protected int age;
    protected int limbs;

    public abstract void move();

    public abstract void feed();

    public abstract void emitSound();
}