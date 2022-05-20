package extras.cursoemvideo.ex07;

public class Fighter {
    private String name;
    private String nationality;
    private int age;
    private float weight;
    private String category;
    private int wins;
    private int losses;
    private int draws;

    public Fighter(String name, String nationality, int age, float weight, int wins, int losses, int draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.setWeight(weight);
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if(this.weight < 52.2){
            this.category = "Peso inválido, abaixo da categoria leve.";
        } else if(this.weight <= 70.3){
            this.category = "Leve";
        } else if(this.weight <= 83.9){
            this.category = "Médio";
        } else if(this.weight <= 120.2){
            this.category = "Pesado";
        } else {
            this.category = "Peso inválido, acima da categoria pesado.";
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void toPresent(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Com vocês o monstruoso "+this.getName()+" com "+this.getAge()+" anos, pesando "+this.getWeight()+" kgs representando "+this.getNationality()+".");
        System.out.println("Vitórias: "+getWins()+"\nDerrotas: "+getLosses()+"\nEmpates: "+getDraws());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void status(){
        System.out.println(this.getName()+" com um peso de "+this.getWeight()+"kg. \nVitórias: "+this.getWins()+"\nDerrotas: "+this.getLosses()+"\nEmpates: "+this.getDraws());
    }

    public void winFight(){
        setWins(getWins()+1);
    }

    public void loseFight(){
        setLosses(getLosses()+1);
    }

    public void drawFight(){
        setDraws(getDraws()+1);
    }
}