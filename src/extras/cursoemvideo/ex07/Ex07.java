package extras.cursoemvideo.ex07;

public class Ex07 {
    public static void main(String[] args) {
        Fighter[] fighters = new Fighter[6];
        fighters[0] = new Fighter("Pretty Boy","França",31,68.9F,11,2,1);
        fighters[1] = new Fighter("Putscript","Brasil",29,57.8F,14,2,3);
        fighters[2] = new Fighter("Snapshadow","EUA",35, 80.9F,12,2,1);
        fighters[3] = new Fighter("DeadCode","Austrália",28, 81.6F,13,0,2);
        fighters[4] = new Fighter("UFOCobol","Brasil",37,119.3F,5,4,3);
        fighters[5] = new Fighter("Nerdaart","EUA",30,105.7F,12,2,4);

        Fight fight01 = new Fight();
        fight01.scheduleFight(fighters[2],fighters[3]);
        fight01.fight();
    }
}