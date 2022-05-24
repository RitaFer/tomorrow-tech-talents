package oopi.soccer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SoccerTeam soccerTeam = new SoccerTeam("Soccer Team");
        Player player1 = new Player(1,"Keven Faria Banha", "Gordo", LocalDate.of(1996, 5, 20),1,"Meio de Campo",100,0,0,false);
        Player player2 = new Player(2,"Alisa Mesquita Caiado","Hosuel",LocalDate.of(1990,3,25),2,"Defesa",950,0,0,false);
        Player player3 = new Player(3,"Elizabeth Alvelos Calçada","Dequos",LocalDate.of(1991,12,12),3,"Defesa",150,0,0,false);
        Player player4 = new Player(4,"Dominic Homem Alcoforado","Plewol",LocalDate.of(2000,10,30),4,"DefeDefesander",90,0,0,false);
        Player player5 = new Player(5,"Enrique César Camacho","Baorho",LocalDate.of(1996,11,30),5,"Defesa",92,0,0,false);
        Player player6 = new Player(6,"Nazar Inácio Granjeiro","Loiheu",LocalDate.of(1996,10,8),6,"Goleiro",99,0,0,false);
        Player player7 = new Player(7,"Nadia Simão Galvão","Tuboas",LocalDate.of(1992,9,4),7,"Meio de Campo",105,0,0,false);
        Player player8 = new Player(8,"Amaro Maciel Saraiva","Fodayn",LocalDate.of(1993,8,5),8,"Atacante",100,0,0,false);
        Player player9 = new Player(9,"Layra Pinho Camacho","Oltaor",LocalDate.of(1998,9,18),9,"Atacante",115,0,0,false);
        Player player10 = new Player(10,"Safira Gabeira Morais","Pudos",LocalDate.of(1992,7,8),10,"Meio de Campo",93,0,0,false);
        Player player11 = new Player(11,"Antoine Farinha Calado","Weolus",LocalDate.of(1999,6,24),11,"Atacante",300,0,0,false);

        player1.runTraining();
        player10.runTraining();
        player3.getInjured();
        player11.redCards();
        player7.yellowCards(2);
        player10.yellowCards(3);

        soccerTeam.addPlayer(player1);
        soccerTeam.addPlayer(player2);
        soccerTeam.addPlayer(player3);
        soccerTeam.addPlayer(player4);
        soccerTeam.addPlayer(player5);
        soccerTeam.addPlayer(player6);
        soccerTeam.addPlayer(player7);
        soccerTeam.addPlayer(player8);
        soccerTeam.addPlayer(player9);
        soccerTeam.addPlayer(player10);
        soccerTeam.addPlayer(player11);

        System.out.println(soccerTeam);
    }
}
