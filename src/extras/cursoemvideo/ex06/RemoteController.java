package extras.cursoemvideo.ex06;

public class RemoteController implements Controller {
    private int sound;
    private boolean on;
    private boolean playing;

    public RemoteController() {
        this.sound = 50;
        this.on = false;
        this.playing = false;
    }

    private void setSound(int sound) {
        this.sound = sound;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    private int getSound() {
        return sound;
    }

    private boolean isOn() {
        return on;
    }

    private boolean isPlaying(boolean b) {
        return playing;
    }


    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        System.out.println("Está ligado?" + this.isOn());
        System.out.println("Está tocando?" + this.isPlaying(false));
        System.out.println("Volume?" + this.getSound());
        for(int i=0; i <= this.getSound(); i+=10){
            System.out.println("[]");
        }
    }

    @Override
    public void closeMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void moreSound() {
        if(this.isOn()){
            this.setSound(this.getSound()+1);
        }
    }

    @Override
    public void lessSound() {
        if(this.isOn()){
            this.setSound(this.getSound()-1);
        }
    }

    @Override
    public void withoutSound() {
        if(this.isOn() && this.getSound() > 0){
            this.setSound(0);
        }
    }

    @Override
    public void withSound() {
        if(this.isOn() && this.getSound() == 0){
            this.setSound(50);
        }
    }

    @Override
    public void play() {
        if(this.isOn() && !(this.isPlaying(true))){
            this.isPlaying(true);
        }
    }

    @Override
    public void pause() {
        if(this.isOn() && (this.isPlaying(true))){
            this.isPlaying(false);
        }
    }
}